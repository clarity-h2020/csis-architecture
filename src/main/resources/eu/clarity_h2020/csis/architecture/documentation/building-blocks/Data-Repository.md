## Summary

This Building Block represents a generic data repository that can be used to store, manage an retrieve different types of (file based) datasets. Examples for concrete data repositories (software) are WebDAV, OpenDAP (Thredds), WMS/WFS (Geoserver), etc. Among others, this Building Block is used to facilitate the sharing of datasets between users and providers of Climate Services.


## Functionality

Baseline requirements elicitation and the assessment of presently available Test Cases identified the following functional requirements on this particular Building Block:

**Baseline functionality**

- store and manage all types of "data" (file based cloud storage)
- access control (if we need to store confidential or sensitive demonstrator specific data or "paid" data)
- facilitate sharing of data between users and providers of Climate Services (store and retrieve data related to "Expert Studies")
- standards-based data access protocols (HTTP, WMS, OpenDAP, ....)

**Functionality requested by CSIS Test Cases:**

- from **[TC-CSIS-0900](http://cat.clarity-h2020.eu/node/854/)**: Data generated on each step of the pre-feasibility study (e.g, RA -Hazard, Impact, Vulnerability maps, etc.) should be registered in the data repository (e.g., GeoServer). References (URLs) to these datasets will be added to the Data Package descriptor.

**Functionality requested by DC Test Cases:**

- from **[TC DC1](http://cat.clarity-h2020.eu/node/791)**: The simulation scenario results (indicators and maps) generated by the expert during offline simulations have to be uploaded to the Data Repository so that it is accessible for Scenario Analysis and MCDA. This includes Indicators and spatial data. Spatial data uploaded to the data repository should be made available as WMS layer so that it can be shown in the Map View Building Block. If requested by the user, also the "raw model output" could be uploaded by the expert (e.g. for further offline analysis or validation by the end user)
- from **[TC RA](http://cat.clarity-h2020.eu/node/873/)**: To retrieve the exiting hazard map, links to the hazard maps could point directly to the files or to layers in a Geoserver service (Data Repository).
- from **[TC DC4 010](http://cat.clarity-h2020.eu/node/933/)**: The climate broker (CS Provider) makes data available requested by the end user (e.g. local hazard data generated by a micro climate model) through the Data Repository.
- from **[TC DC4 050](http://cat.clarity-h2020.eu/node/984/)**: The Data Repository will contain the elements at risk available. It may offers a standards-based OGC WFS-T interface that can be used to update and modify and the attributes and spatial extent of elements at risk which are represented as GML features.

**Exploitation Requirements assessment**

The assessment of the Exploitation Requirements [2] identified the following concrete technical and functional implications on this particular Building Block:

- from "Offer free basic Climate Services based on free and open data": Technology support has to provide **Data Repositories** that are not only able to store several Gigabytes of climate data but also provide standardised machine-level access (OpenDAP, WMS) to other ICT services and (impact) models. In order to reduce the storage capacity, a service data-broker may be used; this service would offer access to data stored by servers external to CSIS in an easy and transparent way for the user.
- ICT Climate Services have to produce tangible outputs for end users, e.g. reports and data in standard formats like SHP, NetCDF, PDF, ODF, etc. (from "Demonstrate and communicate the (co-)benefits of Climate Services")
- from "Co-design Climate Services engaging a community of users, providers, purveyors and researchers": allow external stakeholders participating in co-design of Expert Climate Services to easily request and exchange information needed to perform a climate adaptation study. This includes for example secure cloud storage facilities that are suitable for exchanging confidential and private data.
- from "Offer commercial fit-for-purpose tailored services targeting specific sectors and user groups": Easy technical facilities for external service providers to develop their Climate Services according to CLARITY conceptual and technical standards have to be offered. This includes for example convenient data (e.g. study results and model outputs) upload facilities that enable Climate Service providers that deliver their result in the standardised data formats recognized by CLARITY
- from "Offer commercial fit-for-purpose tailored services targeting specific sectors and user groups": Data repositories (Thredds, GeoServer, etc.) for secured and controlled access have to be provided and technically integrated into the CSIS Infrastructure. Thereby, data protection is an important issue as such data exchanged between providers of paid Expert Services and the users of such services will in most cases not be made public, so secured access to the data repositories as to be ensured.