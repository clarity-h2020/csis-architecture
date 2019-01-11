Summary
-------

The CLARITY meta-data catalogue makes data accessible – by providing tools to streamline publishing, sharing, finding and using data. It for the formal documentation (meta-data, linked data, lineage, etc.) of data collected and produced by the project and thus to Data Management activities.

Especially catalogue features linking data to organisations, software (models) or underlying input data (provenance / lineage) may help to establish trust and confidence in (climate) data and thus to fulfil related exploitation requirements. It may be used for data discovery and meta-data storage by different Climate Services and Building Blocks, respectively. The catalogue is integrated to the marketplace so that data or services that are for sale can be discovered in the catalogue.

Functionality
-------------

**Main Features:**

-   REST web Service, RIA WEb Application
-   can be harvested (e.g. OGC CSW Endpoint)
-   OpenAIRE compliant repository
-   Harnessing (make usable) Earth observation data (GEO) (through harvesting))  
-   usable as source for meta-data harvesting (datasets will be made accessible through the GEOSS platform following the GEOSS Data Sharing Principles).
-   Integration with Marketplace (buy dataset)
-   public / private data
-   Metadata harvesting using the OAI-PMH (Open Archive Initiative – Protocol Metadata Harvesting) protocol.
-   OpenAIRE compliant repository (optional), we should use Zenodo instead

**general functionality**

-   **Integration** of the CLARITY meta-data catalogue **with** **external catalogues** and external / internal repositories (harvesting), e.g. the GEOSS catalogue. According to the Grant Agreement, “*datasets will be made accessible through the GEOSS platform following the GEOSS Data Sharing Principles*”!
-   Possibly integration of Climate Services / Building Blocks with catalogue / **repository APIs** to codify the data management policy. E.g. **instant open data publication** / dissemination like a *share-your-scenario-on-OpenAIRE button* bears high **innovation potential**!
-   Zenodo’s OAI-PMH Endpoint can be used by the CLARITY Metadata Catalogue (CKAN) to harvest (<https://ckan.org/portfolio/federate/>) metadata records of the set *user\_clarity* (CLARITY community). These records can then in turn be harvested by GEOSS Registry System (<http://geossregistries.info/>) from CLARITY’s CKAN Catalogue.
-   Store machine-readable metadata for spatial extent, temporal extent, resolution, hazards, etc. etc. to support automated queries to find the right dataset for the right purpose, e.g. input datasets for local hazard models

**functionality requested by CSIS Test Cases:**

-   from **[TC-CSIS-0031](http://cat.clarity-h2020.eu/node/1003)**: New (external) data sources that will be added/modified/deleted from the catalogue have to be managed by this Building Block.
-   from **[TC-CSIS-0900](http://cat.clarity-h2020.eu/node/854/)**: Retrieve metadata records from each dataset that was used in the study (and that is registed in CSIS Data Repository / Catalogue) in order to be included in the data package.

**functionality requested by DC Test Cases:**

-   from **[TC DC1](http://cat.clarity-h2020.eu/node/1015/)**: When the user is asked by the Scenario Management BB to provide the input data needed by the respective (hazard) model, the Catalogue of Data Sources and Simulation Models could searched and if suitable data is available for the project area and the respective model, it could be offered to the user.
-   from **[TC DC1](http://cat.clarity-h2020.eu/node/1015/)**: When the user specifies individual requirements for a hazard map (hazard type, minimal resolution, …) the Catalogue of Data Sources and Simulation Models could searched and if suitable models are available they could be offered to the user.
-   from **[TC DC4 010](http://cat.clarity-h2020.eu/node/933/)**: Used to get the models and data available in CSIS that could be used in the assessment. The catalogue of data sources and simulation models must offer metadata both for models and datasets and provide the possibility to relate model I/O to datasets. from **[TC DC4 050](http://cat.clarity-h2020.eu/node/984/)**: The catalogue of data sources has to offer metadata on element at risk inventories / repositories / atlases that can be used by the Catalogue of Elements at Risk or an external or internal data repository that store the actual element at risk instances.
-   from **[TC DC4 080](http://cat.clarity-h2020.eu/content/tc-dc4-080-decision-support-tool-road-element)**: It needs to provide a list of hazards based on the geographical area selected for a study/scenario.

Technology Support
------------------
