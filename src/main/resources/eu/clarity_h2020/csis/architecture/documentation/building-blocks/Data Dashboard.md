## Summary

The Data Dashboard Building Block provides an overview of all the different datasets that are used, produced, ordered, collected, requested, exchanged etc. by an end user (e.g. project planner or climate resilience manager) during an assessment (planning session). Thereby, it reports also on the usage of datasets obtained or available from supply-driven Downstream Climate (Data) Services. Datasets are organised (e.g. in a folder-like structure) according to their relation to the modules of the EU-GL (e.g. hazard maps, impact scenario results, elements of risk inventory). From the dashboard, the user has access to different dataset-type-specific tools that are realised as separate ICT Climate Services integrated into the CSIS. These tools correspond to Building Blocks or external tools and provide for example e.g. map visualisation (5.1), data analysis and comparison (5), data package download (4.2) and marketplace functionality (7.6). Technically, the Data Dashboard is integrated in the Scenario Management Building Block (4.3) and the UI integration Platform (7.5) respectively.

## Functionality

**Baseline functionality**

- provides an overview of all the different datasets that are used, produced, ordered, collected, requested, exchanged etc. by an end user in the user's project workspace
- integrates with different (also external) (meta)data catalogues
- can show the origin (provenance) of each dataset
- integrates different tools (ICT Climate Services) that can be used to visualise the data or to perform operations on the data
- supports the CLARITY Data Package Standard for easy import and export of datasets with help of the Data Package Export Tools
- provides "deep links" to external Climate (Data) Services (e.g. SWICCA), so that the end user can explore, process, view, export the dataset in the original system

**Functionality requested by DC Test Cases**

- from **[TC-CSIS-0900](http://cat.clarity-h2020.eu/node/854/)**: The Data Dashboard shows the origin (from expert study, from public data catalogue, from external climate data service), the status (ordered, available, self-provided, ...) and the purpose (input for Hazard, Exposure, Vulnerability, input and output of Risk Assessment and     Impact / Adaptation Scenario Analysis,) and related metadata (expert opinion, inspire metadata, provenance metadata, uncertML, etc.)
- from **[TC RA](http://cat.clarity-h2020.eu/node/873/)**: The Data Dashboard is a Building Block that provides an easy overview of the results for the user.
	
## Exploitation Requirements assessment 

- from "Demonstrate and communicate the (co-)benefits of Climate Services": Expert Climate Services by external stakeholders should be easily integrated with generic ICT Services of the CSIS through a "data-driven" architecture.
- from "Demonstrate and communicate the (co-)benefits of Climate Services": There is a strong need for an (meta-) information model for case studies (CLARITY Demonstration Cases) that is linked with the information models for Climate Services (marketplace offer) and their providers (Service Portfolio) and through indirection also with climate data and models, tools (provenance). This allows also for demonstrating the benefits of Upstream Climate Services (e.g. Copernicus C3S) by means of Case Studies (e.g. CLARITY Demonstration Cases).


## Technology Support
-------------
	
The disadvantage of the Carto-based approach is, that out-of-the box CARTO supports only a limted set geospatial data formats like Shapefile, Keyhole Markup Language (KML), GeoJSON, CSV, Spreadsheets (Excel or OpenDocument), GPS Exchange Format (GPX) and their own CARTO data format.
