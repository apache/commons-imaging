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

# Define the license header
JAVA_LICENSE_HEADER = """/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
"""

XML_LICENSE_HEADER = """<!--
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
-->
"""

# Function to add license header to a file
def add_license_header(file_path, header):
    with open(file_path, "r") as file:
        content = file.read()

    # Check if the header already exists
    if header.strip() in content:
        print(f"Header already exists in: {file_path}")
        return

    # Add the header at the beginning
    with open(file_path, "w") as file:
        file.write(header + "\n" + content)
        print(f"Header added to: {file_path}")

# Scan a directory for .java and .xml files
def process_directory(directory):
    for root, _, files in os.walk(directory):
        for file in files:
            file_path = os.path.join(root, file)
            if file.endswith(".java"):
                add_license_header(file_path, JAVA_LICENSE_HEADER)
            elif file.endswith(".xml"):
                add_license_header(file_path, XML_LICENSE_HEADER)

# Main function
if __name__ == "__main__":
    # Set the directory to process
    directory_to_process = input("Enter the directory to process: ").strip()
    if os.path.isdir(directory_to_process):
        process_directory(directory_to_process)
    else:
        print("Invalid directory. Please enter a valid directory path.")
