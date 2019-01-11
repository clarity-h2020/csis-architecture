## Summary

The Catalogue of Elements at Risk and Adaptation Options is strongly linked to the EU-GL modules/steps “Characterise Hazard”, “Evaluate Exposure”, “Vulnerability Analysis”, “Assess Risks and Impact” and “Identify Adaptation Options” (see Figure 6) as the actions to be carried out in these steps (except for “Characterise Hazard”) are based on the respective elements at risk types or inventories of elements at risk. 
The currently identified elements at risk per demonstration area vary. A more detailed look at the elements at risk per demonstration case is required which will be conducted as one of the next actions. As of now, the Catalogue of Elements at Risk and Adaptation Options has to enable 2 different points of view: 

1) The pre-feasibility study point of view: At this point, only element at risk types are of interest, e.g. people, buildings, critical infrastructure, etc. 
2) The expert-part point of view: At this point, actual element at risk inventories and their specific locations and properties are of interest. 

Both points of view require a different set of functionalities. One of the functionalities which are required for “2) expert-part point of view” is to enable users to import their site specific data. Users should be able to upload elements at risk inventories (e.g. inventory of buildings) and/or may purchase already existing datasets in the Marketplace (7.6). One of the challenges will be to identify a generic workflow which nevertheless is specific enough to cater to all user needs. E.g. to best enable users to add/edit/link vulnerability classes to the single elements at risk from a complete element at risk inventory which they upload, two options have been identified:

1) Enforce a specific data structure (e.g. predefined categories, like vulnerability classes etc.) and format which users must use in order to upload elements at risk inventories.
2) Let users upload their data first, and then link the respective columns/fields to the categories (e.g. predefined vulnerability classes) which being used/understood by CSIS.

The functionalities requested by the CSIS- and DC User Stories and Test Cases are described in the next chapter. Current works focus on the understanding of the relationships between elements at risk types/inventories, their vulnerability classes and vulnerability functions, how to best store them and their relationships and how to then calculate exposure, vulnerability, risk and impact.

## Functionality

Baseline requirements elicitation and the assessment of presently available Test Cases identified the following functional requirements on this particular Building Block:

**Baseline functionality**

- Users should be able to upload an inventory of elements at risk, to add or modify elements and to visualize them on a map. 
- The Catalogue of Elements at Risk and Adaptation Options should also provide the necessary data on the vulnerability of the elements at risk. If no data is available, the user should be able to define his/her own element at risk, along with the estimates of the vulnerabilities to different hazards. This needs to be saved in the catalogue too, with "reliability of the data" set to low so that the data set is either not shown to other users at all or shown as "low confidence" dataset.
- The Catalogue of Adaptation Options should contain sets of adaptation options and good practices. For adaptation scenarios, users should be able to modify the exposure of elements at risk. 
- Users should be able to provide their own adaptation options to be included in the simulations which are then assessed by an expert as part of the expert-workflow. 

**Functionality requested by CSIS Test Cases:**

- from **[TC-CSIS-0050 Infrastructure Project Management](https://cat.clarity-h2020.eu/content/tc-csis-0050-infrastructure-project-management)**: This Building Block should provide static information on the 4 thematic project options as defined by EU-GL, which are - On-site assets and process types (**Element at Risk** Types) - Transport links types - project Inputs types - project outputs types and for each of these themes vulnerability **functions** that provide a concrete vulnerability indicator based on hazard / exposure input
- from **[TC-CSIS-0900 Data Package Export/Download/Forward To](https://cat.clarity-h2020.eu/content/tc-csis-0900-data-package-exportdownloadforward)**: This Building Block should allow to add elements at risk and adaptation options selected for the current project under assessment to a data package that can be downloaded by the end user.

**Functionality requested by DC Test Cases:**

- from **[TC DC1](http://cat.clarity-h2020.eu/node/791)**: The user interface of the Scenario Management Building Block has to provide an user interface that will allow the end user to request the creation of alternate adaptation scenarios for scenario comparison in the expert workflow. This request needs to include the type of hazard/impact scenarios object of the simulation and the *type of adaptation options to take into account*. The supported adaptation options for a specific type of scenario are provided by the *Catalogue of Adaptation Options*
- from **[TC DC1](http://cat.clarity-h2020.eu/node/791)**: The Catalogue of Adaptation Options user interface needs to guide the user in the *selection of adaptation options* to be displayed and compared with the "no adaptation" results (could be a drop down menu with different adaptation options, e.g. green roofs on 50% of existing buildings, 50% increase vegetative cover on streets, etc. last entry should allow on-demand adaptation measures if the desired one is not available in the list). 
- from **[TC DC1](http://cat.clarity-h2020.eu/node/791)**: The Catalogue of Adaptation Options has to provide an user interface to allow the user to request the simulation of a specific adaptation measure that is not yet listed in the Catalogue of Adaptation Options. We are assuming here that simulation scenarios run offline upon request of end users and are retrieved through the Scenario Management Building Block.
- from **[TC DC4 040](http://cat.clarity-h2020.eu/content/tc-dc4-040-catalogue-road-elements-risk)**: The user can incorporate new Catalogues of Elements at Risk. Also add or modify elements on an existing one and associate them with an atlas of elements at risk.
- from **[TC DC4 050](http://cat.clarity-h2020.eu/content/tc-dc4-050-atlas-road-elements-risk)**: The user needs to add or modify elements at risk in the Catalogue of Elements at Risk.
- from **[TC DC4 070](http://cat.clarity-h2020.eu/content/tc-dc4-070-good-practices-and-adaptation-measures-catalogue-road-elements)**: The user must be able to update and incorporate new Catalogues of Adaptation Options. The catalogue must contain adaptation measures and good practices
- from **[TC RA](http://cat.clarity-h2020.eu/node/873/)**: The Catalogue of Elements at Risk should offer the possibility to edit an elements at risk feature layer (WFS) in a GUI (e.g. Map Building Block connected to Catalogue of Elements at Risk). This would relate to *adaptation scenario* and *modifying the exposure of elements at risk*, respectively.
- from **[TC DC4 050](http://cat.clarity-h2020.eu/node/984/)**: The Catalogue of Elements at Risk will contain the elements at risk available and that can be updated and modified. It has to offer an OGC WFS-T interface for interactive editing of elements at risk with help of OGC compliant GUI clients like GeoExt (OpenLayers and ExtJS).
- from **[TC-AIT-01](http://cat.clarity-h2020.eu/node/782/)**: The Catalogue of Elements at Risk and Adaptation Options provides the necessary data on the vulnerability of the elements at risk. If no data is available, the user should be able to define his/her own element at risk, along with the estimates of the vulnerabilities to different hazards. This needs to be saved in the catalogue too, with "reliability of the data" set to low so that the data set is either not shown to other users at all or shown as "low confidence" dataset.

## Exploitation Requirements assessment

The assessment of the Exploitation Requirements [2] identified the following concrete technical and functional implications on this particular Building Block:

- from "Establish trust in Climate Services and their providers": Data Provenance Information including information about the quality of the data, uncertainty, etc. as well as the process (model) which created them have to be attached to each dataset. Such Provenance information has to be considered in the information model of each element of the overall climate adaptation study workflow. This includes for example also the information model of elements at risk, adaptation options, etc. Therefore, the original information source of the contents Catalogue of Elements at Risk and Adaptation Options, other CSIS catalogues, and data stores must be disclosed transparently.
- from "Follow a multi-sectoral approach that crosses the boundary of climate sciences": In order to follow such a multi-sectoral approach, the Catalogue of Elements at Risk and Adaptation Options needs to provide both a wide range of elements at risk types which are related to many different sectors (e.g. road infrastructure, buildings, social, etc.), as well as a wide range of adaptation options. It might be that not all sectors are fully dealt with at the beginning; therefore, a community-driven mechanism by which the gaps are being filled is suggested. This challenge could be dealt with if the catalogue enables users to provide their own elements at risk types and suggest their own adaptation options, which then might be assessed by experts. Thereby, such user provided content have to follow the same quality and transparency standards as being used for essential climate data.

## Technology Support



