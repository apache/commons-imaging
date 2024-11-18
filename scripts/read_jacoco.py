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
import xml.etree.ElementTree as ET
import matplotlib.pyplot as plt

# Define your thresholds
thresholds = {
    "instruction": 0.77,
    "line": 0.77,
    "branch": 0.64,
    "complexity": 0.60,
    "method": 0.80,
    "class": 0.96
}

# Load the XML file
xml_file = "/home/johcue/Documents/SwD/commons-imaging/target/site/jacoco/jacoco.xml"  # Path to JaCoCo XML report

#base_path = "/home/johcue/Documents/SwD/commons-imaging"
#xml_file = os.path.join(base_path, "target/site/jacoco.xml")
#/home/johcue/Documents/SwD/commons-imaging/target/site/jacoco/

tree = ET.parse(xml_file)
root = tree.getroot()

# Extract metrics
def get_coverage_ratio(metric_type):
    """Extract coverage ratio for a given metric type (instruction, line, branch, etc.)."""
    counter = root.find(f".//counter[@type='{metric_type.upper()}']")
    if counter is not None:
        covered = int(counter.get("covered"))
        missed = int(counter.get("missed"))
        return covered / (covered + missed)
    return None

# Analyze metrics
results = {}
for metric, threshold in thresholds.items():
    coverage = get_coverage_ratio(metric)
    if coverage is not None:
        results[metric] = {
            "coverage": coverage,
            "meets_threshold": coverage >= threshold
        }

# Print results
print("JaCoCo Coverage Analysis:")
for metric, data in results.items():
    print(f"{metric.capitalize()} Coverage: {data['coverage']:.2%} - "
          f"{'PASS' if data['meets_threshold'] else 'FAIL'}")

metrics = list(results.keys())
coverage = [data["coverage"] * 100 for data in results.values()]

plt.bar(metrics, coverage, color='blue')
plt.axhline(y=77, color='red', linestyle='--', label='Threshold')
plt.title("JaCoCo Code Coverage")
plt.ylabel("Coverage (%)")
plt.legend()
plt.show()
