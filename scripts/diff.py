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

from bs4 import BeautifulSoup
import matplotlib.pyplot as plt

def extract_total_coverage(file_path):
    """Extracts the total coverage percentages from a JaCoCo report HTML file."""
    with open(file_path, 'r', encoding='utf-8') as file:
        soup = BeautifulSoup(file, 'html.parser')
        tfoot = soup.find('tfoot')
        if not tfoot:
            raise ValueError(f"No <tfoot> found in {file_path}")
        coverage_cells = tfoot.find_all('td', class_='ctr2')
        return {
            "Instructions": float(coverage_cells[0].text.strip('%')),
            "Branches": float(coverage_cells[1].text.strip('%')),
        }

def compare_coverages(report1_path, report2_path):
    """Compares the code coverage between two JaCoCo reports."""
    coverage1 = extract_total_coverage(report1_path)
    coverage2 = extract_total_coverage(report2_path)

    print("Coverage Comparison:")
    print(f"{'Metric':<15} {'Report 1 (%)':<15} {'Report 2 (%)':<15} {'Difference (%)':<15}")
    comparison_data = {}
    for metric in coverage1.keys():
        diff = coverage2[metric] - coverage1[metric]
        print(f"{metric:<15} {coverage1[metric]:<15} {coverage2[metric]:<15} {diff:+.2f}")
        comparison_data[metric] = (coverage1[metric], coverage2[metric])
    
    return comparison_data

def generate_bar_chart(data, title):
    """Generates a bar chart for coverage comparison."""
    metrics = list(data.keys())
    report1_values = [v[0] for v in data.values()]
    report2_values = [v[1] for v in data.values()]

    x = range(len(metrics))
    bar_width = 0.35

    fig, ax = plt.subplots(figsize=(10, 6))
    ax.bar(x, report1_values, bar_width, label='Report 1', color='b', alpha=0.7)
    ax.bar([p + bar_width for p in x], report2_values, bar_width, label='Report 2', color='r', alpha=0.7)

    ax.set_xlabel('Metrics')
    ax.set_ylabel('Coverage (%)')
    ax.set_title(title)
    ax.set_xticks([p + bar_width / 2 for p in x])
    ax.set_xticklabels(metrics)
    ax.legend()

    plt.tight_layout()
    plt.show()

# Paths to the uploaded JaCoCo report HTML files
report1_path = "./index.html"
report2_path =  "./index_1.html"

# Compare the coverages and generate the chart
comparison_data = compare_coverages(report1_path, report2_path)
generate_bar_chart(comparison_data, "Code Coverage Comparison")




