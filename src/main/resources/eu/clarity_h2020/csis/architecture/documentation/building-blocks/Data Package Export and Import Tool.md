## Summary 

Information produced by CLARITY Climate Services must be provided in a common data package that accompanies the (semi-)automaticallity generated text based report (Word document with text, graphs, maps, etc.). This data package should contain all data used to generate the contents of such Word report so it can be (re)used later on in further stages. Thus for instance, a climate expert hired to further carry out local assessment of the climate impact should import the information from CLARITY Data Package and use it for his/her own analyses. Later on, he/she should generate a similar package that then can be imported in CLARITY CSIS.

- Technically, a standardised Data Package can be realised as “distributed data object“ so that not all data has to reside in the same location (database, server). Here arises also the need for&nbsp;<strong>Smart Links</strong>&nbsp;that are able to combine, relate and describe different information entities (in this particular case the distinct elements of data package).

- A serialisation feature for Data Packages is needed that allows to put all contents of package that into a concrete (zip) file that can be shared, e.g. with other experts. Thereby, the actual output Climate Services should be delivered as such a Standardised Data Package to ensure technical interoperability to the CSIS and thus the Climate Services Ecosystem.

- Consequently, a data package can either reside on the CSIS Virtual Data Package (distributed among several physical data stores) if the provider of the Expert Climate Service uses the CLARITY CSIS to provide its service, or as concrete file (Serialized Data Package) if the provider works offline.

## Functionality

Baseline requirements elicitation and the assessment of presently available Test Cases identified the following functional requirements on this particular Building Block:

**Baseline functionality**

- CLARITY Data Package specification: The specification describes which standards are accepted/used to encode the information as well as metadata to be included.
- software (with a defined and exposed API) that allows writing and reading data from CLARITY Data Package

**Functionality requested by CSIS Test Cases:**

- from **[TC-CSIS-0900](http://cat.clarity-h2020.eu/node/854/)**:  The tool could offer a GUI like a **data dashboard** (as separate Building Block or as part of the Data Package Building Block) that shows the origin (from expert study, from public data catalogue, from external climate data service), the status (ordered, available, self-provided, ...)  and purpose (input for H, E, V, RA Impact Scenario Analysis, output of RA or impact/ adaptation scenario analysis) and allows to select the data for inclusion the the data and related metadata (expert opinion, inspire metadata, provenance metadata, uncertML, .... etc.) package export ("download zip file").


## Exploitation Requirements assessment

The assessment of the Exploitation Requirements [2] identified the following concrete technical and functional implications on this particular Building Block:

- from "Demonstrate and communicate the (co-)benefits of Climate Services": Expert Climate Services by external stakeholders should be easily integrated with generic ICT Services of the CSIS through a "data-driven" architecture. Thereby, data standards are important. This relates to the definition of standardised “Data Packages” which include the results of a complete climate adaptation study in standardised format.
- from Consider the role of new regulatory frameworks in stimulating the emergence of Climate Services": All datasets included in the Data Package that are provided together with the accompanying report document must enclose the corresponding metadata records so that external parties are aware of who, when, how (including information about the uncertainty) and for what purpose the data was produced.
- from "Use, define and promote open standards for data and services": A standardised Data Package “provides a simple contract for data interoperability that supports frictionless delivery, installation and management of data.” (http://frictionlessdata.io/data-packages/). It is a general container format for climate risk adaptation studies that is based on the CLARITY Modelling Methodology, best practices, data standards and state-of-the art ICT technologies. As starting point, a simple directory layout that follows the CLARITY Modelling Methodology (adapted EU-GL modules) and defines the format and details of contained (model I/O) data as it is done for example by CMIP5 - Data Description (https://cmip.llnl.gov/cmip5/output_req.html). Then, the Data Package Standard will evolve during the course of the project (agile approach).

## Technology Support

 As described in OGC Network , GeoPackage is a universal open file format for geo-data provided by Open Geospatial Consortium. It is standards-based, application and platform independent and self-describing to Technology Supportincrease the cross-platform interoperability of geospatial applications and web services.
It is designed to facilitate widespread adoption and use of a single and simple file format by open-source software applications. Since it is built on top of SQLite, it can be accessed through SQL standard, giving all performance of a spatial database along with the convenience of a single file-based data set that can be easily shared. It is able to store:
- vector features
- tile matrix sets of imagery and raster maps at various scales
- attributes (non-spatial data)
- extensions

It could be useful to manage vector data to avoid shapefile limitations and can be manipulated by OGR and GDAL libraries. Its major downside is that the underlying SQLite database is a complex binary format that is not suitable for streaming. It either must be written to the local file system or accessed through an intermediary service.

Another alternative is to use Data Packages, as described by Frictionless Data , is a simple container format to describe and package a collection of data. It provides a simple contract for data interoperability that supports delivery, installation and management of data.
It could be useful to include metadata and point to local or remote raster files avoiding conversions of image data like rasters. It offers two complexity levels:

**Data Package specification**, a simple format for packaging data for sharing between tools and people.
- Readme file
- Data package, a json file used as general metadata and resource index
- Data files, for alphanumeric data this model use CSV files.

**Tabular Data Package**, a format to package tabular data that builds on Data Package but additionally it uses:
- Table Schema, a specification to define a schema for tabular data. This means a json file describing data fields, description and data types.
- CSV Dialect Description Format, a json file where to specify and define a dialect for CSV data.



