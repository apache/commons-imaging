"""
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements. See the NOTICE file
distributed with this work for additional information
regarding copyright ownership. The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License. You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied. See the License for the
specific language governing permissions and limitations
under the License.
"""

import os
import requests
from requests.auth import HTTPBasicAuth

# Function to load tokens from a text file
def load_tokens_from_file(file_path):
    tokens = {}
    with open(file_path, 'r') as file:
        for line in file:
            line = line.strip()
            if not line:  # Ignore empty lines
                continue
            if '=' not in line:  # is there an = ?
                print(f"Invalid format on line: '{line}' - expected format KEY=VALUE.")
                continue
            try:
                key, value = line.split('=', 1)  # Use split with maxsplit lo allow = on the token value
                tokens[key] = value
            except ValueError:
                print(f"Error processing line: '{line}'.")
    return tokens


# Load tokens from the text file
tokens = load_tokens_from_file('dir_file') #


# SonarCloud setup
SONARCLOUD_URL = "https://sonarcloud.io/api/issues/search"
SONARCLOUD_PROJECT_KEY = "johcue_commons-imaging"
SONARCLOUD_TOKEN = tokens.get("SONARCLOUD_TOKEN")

# JIRA setup
JIRA_URL = "https://johcue.atlassian.net/rest/api/2/issue"
JIRA_USER_EMAIL = tokens.get("JIRA_USER_EMAIL")
JIRA_API_TOKEN = tokens.get("JIRA_API_TOKEN")
JIRA_PROJECT_KEY = "CI"

# Step 1: Get issues from SonarCloud
headers_sonar = {
    "Authorization": f"Bearer {SONARCLOUD_TOKEN}"
}

params = {
    "componentKeys": SONARCLOUD_PROJECT_KEY,
    "severities": "BLOCKER,CRITICAL",
    "types": "BUG"
}

response = requests.get(SONARCLOUD_URL, headers=headers_sonar, params=params)
sonar_issues = response.json()["issues"]  # This is our list of issues

# Step 2: Create JIRA tasks for each issue
for issue in sonar_issues:
    # Details for the JIRA task
    jira_data = {
        "fields": {
            "project": {
                "key": JIRA_PROJECT_KEY
            },
            "summary": f"Fix SonarCloud Issue: {issue['message']}",
            "description": (
                f"SonarCloud found an issue:\n\n"
                f"Severity: {issue['severity']}\n"
                f"File: {issue['component']}\n"
                f"Line: {issue['line']}\n\n"
                f"See more at SonarCloud: https://sonarcloud.io/project/issues?id={SONARCLOUD_PROJECT_KEY}&open={issue['key']}"
            ),
            "issuetype": {
                "name": "Bug"
            }
        }
    }

    # Send request to JIRA to create the task
    headers_jira = {
        "Content-Type": "application/json"
    }

    response = requests.post(
        JIRA_URL,
        json=jira_data,
        headers=headers_jira,
        auth=(JIRA_USER_EMAIL, JIRA_API_TOKEN)
    )

    if response.status_code == 201:
        print(f"Created JIRA issue {response.json()['key']}")
    else:
        print("Failed to create JIRA issue:", response.status_code, response.text)
