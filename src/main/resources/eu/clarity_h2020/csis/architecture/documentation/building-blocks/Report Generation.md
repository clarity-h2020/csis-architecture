## Summary

The result of a climate adaptation study is a report that could be (semi-) automatically generated. Report Generation should enable the user to easily access and download draft and final reports packages at the end of the project assessment process. Such report packages should include automatically generated documentation (with embedded supporting tables, graphs and maps of the study area) together with all the datasets (Data Package) used in the study in order to be further used in other stages of the planning project.

(semi-) automatic Report Generation depends on well-defined input that can be validated, aggregated and visualised. Therefore, technical standards for the respective input formats have to be adopted by CLARTIY Data Packages and communicated to external stakeholders that want to use the CLARITY Report Generation functionality for their Expert Climate Services

## Functionality

Baseline requirements elicitation and the assessment of presently available Test Cases identified the following functional requirements on this particular Building Block:

**Baseline functionality**

- tbd

**Functionality requested by CSIS Test Cases:**

- from US-CSIS-100: The Report Generation Component should be automatically generated based on the available data and users' decisions. This must be a credible report so that it can be added to project documentation
- from US-CSIS-100: The report should also contain the information that is needed for auditing the decision making process later on: e.g., the list of all actions, inputs, outputs and decisions.

**Functionality requested by DC User Stories / Test Cases:**

- **from [US-DC1-100](http://cat.clarity-h2020.eu/content/us-dc1-160-climate-adaptive-planning%C2%A0-display-results-2)**: I want the results of CLARITY simulations and climate services to be visualized as synthetic document (e.g. pdf with text and images).
- **from [TC DC1](http://cat.clarity-h2020.eu/node/791)**: The Report Generation Building Block should allow to acquire in a single document the results of the simulation and MCDA.
- **from [TC DC4 090](http://cat.clarity-h2020.eu/node/990/)**: The Report Generation Building Block shows a preliminary report with the results obtained in the project and allows the inclusion of new information for the generation of the final report.

## Exploitation Requirements assessment

The assessment of the Exploitation Requirements [2] identified the following concrete technical and functional implications on this particular Building Block:

- from "Follow a multi-sectoral approach that crosses the boundary of climate sciences": Besides the possibility to produce a general/summarized report which contains the most important information, the ability of Reporting Generation to produce additional “extended focus reports” which addresses certain sectors (climate, adaptation, financial, people, etc.) in more detail, could contribute to always providing the most valuable information to end users without overloading them with information.
- from Consider the role of new regulatory frameworks in stimulating the emergence of Climate Services": Simple templates for reports have to be defined. This requires an assessment of regulatory frameworks and their requirements. Besides the omnipresent EU-GL, this includes for example also the methodology for tracking climate adaptation finance of Multilateral Development Banks
- from Consider the role of new regulatory frameworks in stimulating the emergence of Climate Services": (semi-) automatic Report Generation depends on well-defined input that can validated, aggregated and visualised. Therefore, technical standards for the respective input formats (Data Packages) have to be defined and communicated to external stakeholders that want to use CLARITY Report Generation functionality for their Expert Climate Services.
- from "Provide a user-friendly, intuitive and context-aware discovery and communication infrastructure for Climate Service": Reporting Generation should enable the user to easily access and download draft and final reports packages at the end of the project assessment process. Such report packages should include automatically generated documentation (with embedded supporting tables, graphs and maps of the study area) together with all the datasets (Data Package) used in the study in order to be further used in other stages of the planning project.



## Technology Support


**TODO:** AIT + SCC check possibilities for realisation (drupal module)? PDF report?
See https://climatescreeningtools.worldbank.org/ncds/country-project-details?pdf=1&ass_id=4534

Template-based Report Generation can also be implemented based on free and open source software like JasperReports (https://community.jaspersoft.com)
