## Summary

There are two main usage scenarios for the Scenario Transferability Component: Providing general matchmaking functionality by means of "Smart Links" (REST API) and side-by-side (visual) comparison of alternate (adaptation) scenarios (graphical user interface):

**Matchmaking**

In the first usage scenario, the Scenario Transferability Component is used for discovery and matchmaking of related entities like scenarios, projects, elements at risk, adaptation options, etc.
For example, applied to the Catalogue of Elements at Risk and Adaptation Options, infrastructure projects being assessed by end users can be matched to other projects that share the same elements at risk (covering a variety of sectors). The same could be true for adaptation options or adaptation Scenarios. Moreover, end users could discover other projects with the same proposed or already implemented adaptation options, in order to investigate further and learn from the experiences already made.

The Scenario Transferability Component should also be used to match the offer of Expert Climate Services that are described in CSIS Marketplace as part of a Climate Service Provider's Service Portfolio against the demand of the users, e.g. when performing a Climate Adaptation Study. Moreover, the   Transferability Component should also provide links to partner portals like Climate-ADAPT (http://climate-adapt.eea.europa.eu/) or Upstream Climate Services like SWICCA (http://swicca.climate.copernicus.eu/). Thereby, contextual information (e.g. spatial location, climate hazard, sector, ...) should also be used (e.g. by means of HTTP GET parameters or deep links) to direct the user to relevant information (e.g. guidance documents) and data (provenance).

**Scenario Analysis and Comparison**

In the second usage scenario, the Scenario Transferability Component is used for (visual) scenario analysis and comparison. Thereby, it allows the side-by-side comparison not only of different climate scenarios (Climate Twins Concepts), but also the comparison of alternate adaptation scenarios resulting from **Impact Scenario Analysis** as described in EU-GL Module 4 "Assess Risks and Impact" and in chapter 3.3 "Risk Assessment and Impact Scenario Analysis" of D3.1. To support a generic comparison of arbitrary impact scenarios, the Scenario Transferability Component relies on standardised data formats for aggregated scenario  data (indicators) in JSON/CSV format and spatial data (maps) in OGC format. The Component supports decision making by visualising the key performance indicators (e.g. operation duration, number of evacuated citizens, number of deaths 4 ,value of lost property, value of lost productivity, price of mitigation actions,etc.) as tables, diagrams or maps.


## Functionality

Baseline requirements elicitation and the assessment of presently available Test Cases identified the following functional requirements on this particular Building Block:

**Baseline functionality related to "Matchmaking"**

- support for “Smart Links” that describe a relationship between different entities and that can be enriched with additional metadata
- connected case studies (CLARITY Demonstration Cases) via “Smart Links” to product portfolios of Climate Service Providers as well as to the underlying data and models and their provenance metadata
- provide references to external information sources (documentation, papers, websites, etc.).
- Climate Twins matrix should not only to be based on climate (false-positive aspect of climate change: it's getting warmer) but also on sectoral impact (negative effects)

**Functionality related to "Matchmaking" requested by CSIS  Test Cases**

- from [TC-CSIS-0000]Scenario Transferability could be used for the management of categories or classifications of climate services or climate service providers to support matchmaking and discovery. This includes for example information on sectors, regions, service type (risk assessment, ....) etc.
- from [TC-CSIS-0050] The Scenario Transferability Component could be used to establish some relationship (similarity) between different project types, sectors, elements at risk, etc. e.g. to assist the user in finding the right project type by e.g. economic sector or specific element at risk type. 
- from [TC-CSIS-0053](http://cat.clarity-h2020.eu/node/992/): The Scenario  Transferability Component will store project-instance specific relationships (e.g. spatial)  in form of "Smart Links" that can later on be used e.g. for the discovery of similar or "nearby" projects.  

**Functionality related to "Matchmaking" requested by DC Test Cases**

- from  **[TC DC1](http://cat.clarity-h2020.eu/node/1015/)**:  The Scenario Transferability Component could be used for matchmaking functionality: If the user is in need of a specific hazard map (input: hazard type) for a specification location (input: spatial location) and resolution, the Scenario Transferability Component could query the Catalogue of Data Sources & Models the Marketplace and then and propose a) a local (climate / geophysical / ....) model that is able to generate such a hazard map, b) a list of required input data types (models needs a DEM, model needs cordex climate data, ....) by the model, c) a list of potential data sources that are available for free and for sale and c) CS providers that are able to produce the hazard maps "offline".


**Baseline functionality related to "Scenario Analysis and Comparison"**

- **TODO (AIT)**

**Functionality related to Scenario Analysis and Comparison requested by DC Test Cases**

- from  **[TC DC1](http://cat.clarity-h2020.eu/node/791)**: Display results of the map (no adaptation) in a table format (needs to be displayed together with the map results)

## Exploitation Requirements assessment

The assessment of the Exploitation Requirements [2] identified the following concrete technical and functional implications on this particular Building Block:

- from "Demonstrate and communicate the (co-)benefits of Climate Services": The implementation of the Demonstration Cases must follow a common methodology that is supported by tools (ICT Climate Services) that are able to generate data-driven insights, e.g. in the form of (standardised) indicators that can be easily visualised (chart, diagram) 
- from "Follow a multi-sectoral approach that crosses the boundary of climate sciences": The scope of the Scenario Transferability concept could be extended beyond basic climate indicators so that end users could also discover “twin” regions within other sectors e.g. where the probability of certain hazards is similar to their actual project region.  Furthermore, the Scenario Transferability concept could also be applied to the Catalogue of elements at risk and adaptation options so that the end users project being assessed can be matched to other projects that share the same elements at risk (covering a variety of sectors). The same could be true for adaptation options. By the use of Scenario Transferability, end users can search for and find other projects with the same proposed or already implemented adaptation options, in order to investigate further and learn from the experiences already made.
- from "Provide a user-friendly, intuitive and context-aware discovery and communication infrastructure for Climate Service": Discovery and matchmaking (Scenario Transferability) should not be limited to the CSIS (Marketplace) but also provide links to partner portals like Climate-ADAPT (http://climate-adapt.eea.europa.eu/) or Upstream Climate Services like SWICCA (http://swicca.climate.copernicus.eu/). Thereby, contextual information (e.g. spatial location, climate hazard, sector, ...) should also be used (e.g. by means of HTTP GET parameters or deep links) to direct the user to relevant information (e.g. guidance documents) and data (provenance).

## Technology Support

Ideas for the "Matchmaking" Scenario: graph database

Ideas for technology support for the Scenario Analysis and Visualisation Scenario:

- https://crisma-cat.ait.ac.at/component/Worldstate-Widget-(JavaScript)
- https://crisma-cat.ait.ac.at/bb/Scenario%20Analysis%20and%20Comparison%20View
- https://crisma-cat.ait.ac.at/component/Scenario%20Analysis%20and%20Comparison%20Widgets%20%28Java%29
- https://crisma-cat.ait.ac.at/component/Scenario%20Analysis%20and%20Comparison%20Widgets%20%28JavaScript%29

Technologies: Map Component + table visualisation of aggregated scenario data, + some diagrams.
- http://selection.datavisualization.ch/


