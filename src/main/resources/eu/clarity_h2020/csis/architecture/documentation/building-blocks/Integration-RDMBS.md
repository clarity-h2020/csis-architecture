## Summary

The Integration RDMBS is the central relational database management system for management and integration of common and shared information stored as relations (in tabular form). It is used as the storage back end of the UI Integration Platform and the Scenario Management Building Block (4.3) and stores, among others, the individual infrastructure project configurations and the associated assessment and adaptation planning information created by end users. Thereby, it is important to highlight, that the actual datasets generated during the EU-GL/CLARITY adaptation planning process (hazards maps, model outputs, ...) are not stored in this Integration RDMBS but in general in a separate Data Repository (7.4). The Integration RDBMS Building Block may offer several different databases, each suitable for a different purpose. Therefore, also other Building Blocks that are not directly related to UI Integration Platform, the like Marketplace (7.6) for example, may use the RDMBS as storage back end for their relational data. This allows for easy sharing of common data without the need to introduce additional Building Blocks or APIs.

## Functionality

Baseline requirements elicitation and the assessment of presently available Test Cases identified the following functional requirements on this particular Building Block:

**Baseline functionality**

- in addition to the common features of a modern Relational Database Management System (e.g. provide relational operators to manipulate the data in tabular form, replication, security, ...), the Integration and Management RDMBS has to support storing, processing and querying of spatial data.

**Functionality requested by CSIS Test Cases:**

- from TC-CSIS-0050: The Integration RDMBS BB exposes a REST API towards the user workspace and the Project Master Data databases and provides to following Functionalities: get Project Instance from User Workspace, update Project Instance in User Workspace, create Project Option Instances in User Workspace, get Project Option Types for Project Type from Project Master Data, add new Project Option Type to Project Master Data (Project Option Types).
- from TC-CSIS-0060: Static (project types, project option types, sector types, ...) project information as well as concrete instances of projects created by end users (workspace) are stored in this RDMBS.
- from TC-CSIS-0065: Provider Profiles and Portfolios should be stored and managed by this Building Block. It is realised by the PostgreSQL RDBMS database backend of of the UI Integration Platform (Drupal) and possibly also the Marketplace Building Block.
- from **[TC-CSIS-0900](http://cat.clarity-h2020.eu/node/854/):** Retrieve information concerning the current project being assessed (e.g. project type) that will be also included in the data package.

**Functionality requested by DC Test Cases:**

- from **[TC DC2 P1 ](http://cat.clarity-h2020.eu/node/829/):** Database that connect projects to elements at risks, hazards and information in specific datasets.

## Technology Support

PostgreSQL, one one of the most widely used RDMBS, hs been selected as the actual implementtion of the Integration RDMBS. As open-source software, it can not only be used free of charge, it is also default RDBMS of the cids Integration Base () and compatible with UI Integration Platform. The PostGIS extensions supports storage of spatial data and numerous spatial operations including spatial queries.


Since a relational database management system is per definition generic, no adaptation or development activities are needed apart form the design and specification of individual data models. The data models, especially the cids integration base DDL can be easily extended as needed. Moreover, the ability to implement stored database procedures opens wide possibilities for further extensions, e.g. to develop (simple) impact models directly on the level of the RDMBS.


The is PostgreSQL 9.x with PostGIS 2.x extension.



No extensions to the generic RDMBS software are needed. 

CIS provides a custom PostgeSQL 9.x+ PostGIS 2.x docker image that automatically creates a new cids Integration Base on basis of the cids-init database schema DDL. Alternatively, the mdillon/postgis docker image can be used to initialize an empty postgres RDBMS docker container and to create the cids Integration Base dabase with help of the cids-init script afterwards.

Official Drupal Docker container (https://hub.docker.com/_/drupal/) and a PostGIS container that is based on the official PostgreSQL Docker container. (https://hub.docker.com/r/mdillon/postgis/).