## Summary

A reusable, flexible and highly configurable map component that can be embedded in different parts of the common CSIS UI. It supports both visualisation and interaction with different maps layers, e.g. for elements at risk, hazards, scenario results, etc.. 


## Functionality

Baseline requirements elicitation and the assessment of presently available Test Cases identified the following functional requirements on this particular Building Block:

**Baseline functionality**


- visualize different types hazard maps in relation to climate change projections for the area of interest
- advanced layer management: let the user add individual (hazards) maps as layer, e.g. from existing (local) WMS, provide a set predefined climate change projection layers, e.g. from CSC
- support for Map Layer Timeline, e.g. visualize temperature change 2020-2050 in are of interest. (TIME attribute in WMS GetMap requests)
- derive geo-referenced information to exchange with planning services (*data export* of SHP, NetCDF export) 
- show map layers from both **internal and external** WMS Services (CLARITY cloud file storage / GeoServer / ERDDAP or public open data inventories).
- spatial data import: let the user upload (hazards) maps in standardised format, add them to a private data repository and the workspace and show them as layer
- predefined layers:  provide a set predefined climate change projection layers, e.g. from C3S
- tabular visualisation of GML Feature's attributes obtained from an OGC WFS
- editing of GML Feature's attributes via OGC WFT-T

**Functionality requested by CSIS Test Cases:** 

- from US-CSIS-100: For the pre feasibility study, where the user selects some random location, the system should be able to extract the information from the map at the selected location. So, we need more than just map visualization. It is also important that this information is available in the system (not offline, by some expert), so it can be used for the automatic evaluation: pre feasibility risk analysis and reporting. For the expert study, we have the flexibility that the maps can be uploaded/downloaded by the expert and analysed offline, but it depends on the US/TC. 
- from [TC-CSIS-0053](http://cat.clarity-h2020.eu/node/992/): The map component is used to specify, view  and change the geospatial project location. It will also display some standard background layers (topographic, aerial, ...)

**functionality requested by DC User Stories / Test Cases:**

- from **[US-DC1-150](http://cat.clarity-h2020.eu/content/us-dc1-150-climate-adaptive-planning%C2%A0-display-results-1)**: I want the results of CLARITY simulations and climate services to be visualized as Georeferenced maps.
- from **[US-DC1-110](http://cat.clarity-h2020.eu/content/us-dc1-110-climate-adaptive-planning%C2%A0-hazard)**: Visualize heat wave, landslide and pluvial flood hazard maps in relation to climate change projections for the area of the Metropolitan City of Naples.
- from **[TC DC1](http://cat.clarity-h2020.eu/node/791)**: Display results of impact scenario (no adaptation) on a map (note that map visualization must always include a legend based on the layers included).
- from **[TC DC1](http://cat.clarity-h2020.eu/node/791)**: Map widget should allow the comparison among "non adaptation" and "adaptation" scenarios (e.g. two maps juxtaposed on the same screen), see also [Scenario Transferability Component](http://cat.clarity-h2020.eu/node/359).
- from **[TC DC1](http://cat.clarity-h2020.eu/node/1015/)**: The Map View has to provide an user interface that will allow the user to visualize the location of the current project under assessment  (e.g. city) and to specific the spatial extent (area under assessment) that should be considered by a local model (e.g. urban climate model) when producing a specific hazard map (e.g. heat waves) for that particular area.
- from **[TC DC1](http://cat.clarity-h2020.eu/node/1015/)**: Displays hazards maps resulting from local models (e.g. urban climate models)  run "offline" by experts 
- from **[TC DC4](http://cat.clarity-h2020.eu/content/tc-dc4-030-hazard-assessment-road-elements)**: Displays the hazards using a map. It has to allow the user to configure how to represent them.
- from **[TC DC4](http://cat.clarity-h2020.eu/content/tc-dc4-050-atlas-road-elements-risk)**: The user selects a specific geographical area. The user needs to modify the geographical location of a selected element at risk.
- from **[TC DC4](http://cat.clarity-h2020.eu/content/tc-dc4-060-risk-assessment-road-elements)**: Needed to upload / store / compute / maps at a regional or local scale to allow to evaluate the climate risks.
- from **[TC DC4](http://cat.clarity-h2020.eu/content/tc-dc4-080-decision-support-tool-road-element)**: The user defines the geographical area covered by the study and loads the elements of the area
- from **[TC RA](http://cat.clarity-h2020.eu/node/873/)**: Position the elements at risk on a map, to show the hazard map layers and to show a color-coded map with the results of the HxExV calculation (alternative to showing it in a table).
- from **[TC RA](http://cat.clarity-h2020.eu/node/873/)**: Select and show an entire inventory of elements at risk (e.g. buildings layer) on the map.	
