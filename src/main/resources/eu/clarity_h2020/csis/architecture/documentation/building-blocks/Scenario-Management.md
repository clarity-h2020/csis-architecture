## Summary

The Scenario Management Building Block supports and enforces first and foremost the standardised workflows of the EU-GL [1] for each of the distinct planning steps and provides respective user interfaces that guide the user through the process of co-creating a Climate Adaptation Study. Basically, the end user is presented with the list of recommended and required steps for performing a complete Climate Adaptation Study for the respective (infrastructure) project under assessment and is asked to provide the information that is needed to complete the current step and advance to the next step. If the user is by itself not able to give the needed information (e.g. detailed local hazard maps for hazard characterisation), the user can either perform a limited pre assessment (pre-feasibility study) or obtain the required information from a suitable Expert Climate Service (e.g. generate tailored hazard maps by running local climate models) that is available from the CLARITY Marketplace (7.6).
For each of the distinct EU-GL modules or steps (Figure 6) the CSIS offers generic data-driven ICT Climate Services and Building Blocks, respectively, which are directly integrated into the Scenario Management Building Block. Additionally, there is the possibility for Climate Server Providers to develop sectoral or even site-specific ICT Climate Services that can be integrated into the Scenario Management Building Block on-demand for specific infrastructure project types, sectors or Climate Service Customers. This applies for example specifically to the non-generic aspect of Scenario Management, which is explained in the following.
 
The second aspect of Scenario Management, the site- and use-case-specific impact scenario analysis, covers mainly the modules related to the assessment of risks and impact and the identification of adaptation options (resulting from varying impact scenarios) and is currently foreseen to be provided as tailored Expert Climate Service rather than as generic ICT Climate Services. Nevertheless, also possibilities to support Climate Service Providers in actually performing impact scenarios are discussed in section 4.1.3. Independently of that, the results of such impact scenarios, if available in a standardised format supported by CLARITY, can of course be used in further modules and the respective Building Blocks like the Map Component (5.1), the Scenario Transferability Component (5.2) and the Multi Criteria Decision Support Analysis Tool (6.1).


## Functionality

Baseline requirements elicitation and the assessment of presently available Test Cases identified the following functional requirements on this particular Building Block:

**Baseline functionality**

The CLARITY Description of the Actions (Annex 1 to the Grant Agreement) describes the of the Scenario Management Building Block as a software that  "allows end-users to easily produce and manage new scenarios by editing the parameters of the pre-defined core scenarios as defined in WP1". If applied to the an "EU-GL scenario" the baseline functionality can be summarised as to

- manage projects and planning sessions (assessments)
- step-by-step guide through all steps of the EU-GL modules
- offer generic tools and (freely available) data for each step to be able to perform a pre-assessment
- offer possibilities for tailored data and services (advice, consulting, etc.) if the generic functionality is not sufficient and a detailed assessment is required

**Functionality related to the EU-GL Workflow requested by CSIS Test Cases and User Stories:**

- **from [US-CSIS-100](http://cat.clarity-h2020.eu/content/us-csis-100-platform-supports-users-defining-and-following-standardized-planning-procedures)**: The Scenario Management Component supports and enforce the standardized workflows for each of the supported planning processes
- **from [TC-CSIS-0052](http://cat.clarity-h2020.eu/node/989/)**:  The Scenario Management Component is responsible for the management of user projects and "planning sessions" (adaptation assessments). The Building Blocks provides the respective user interfaces and communicates with the Integration RDMBS BB to obtain the list of project types (or templates) needed for initial creation of a new project as well as the user specific workspace information that consist of concrete project instances and planning sessions.
- **from [TC-CSIS-0000](http://cat.clarity-h2020.eu/content/tc-csis-0000-ict-cs-csis-infrastructure)**:  The Scenario Management Component and the project management user interfaces, respectively, are either embedded (e.g. as iframe) in the UI Integration Platform (Drupal System) or directly as part of the UI Integration Platform (e.g. Drupal Module).
- **from [TC-CSIS-0000](http://cat.clarity-h2020.eu/content/tc-csis-0000-ict-cs-csis-infrastructure)**: the Scenario Management Building Block should provide APIs and user interfaces to facilitate the management of the planning scenarios.

**Functionality related to the EU-GL Workflow requested by DC Test Cases and User Stories:**

- from **[TC-AIT-01](http://cat.clarity-h2020.eu/node/782/)**: The Scenario Management Component has produce the overall user interface and lead the user from one step to another. 
- from **[TC DC1](http://cat.clarity-h2020.eu/node/1015/)**: The Scenario Management Building Block has to provide a user interface interface (model input data dashboard widget) for the user with the list of required input data needed for the parametrisation / calibrating of a specific (hazard) model that is executed "offline" by an expert. The user must have the possibility to upload the data or to chose existing data from his personal workspace (data dashboard) or from the CLARITY Catalogue of Data Sources and Models or Marketplace.
- from **[TC DC2 P1 ](http://cat.clarity-h2020.eu/node/829/)**: The Scenario Management Building Block has to provide a form or questionnaire that allows the user to specify relevant information about his problem (project), such as geographic location, elements and risks, etc.
- from **[TC DC4 010](http://cat.clarity-h2020.eu/node/933/)**: The Scenario Management component should generate a formal and standardised order specification for local climate information (hazard) needed by the end user to perform the climate adaptation study. The order specification has to take the temporal horizons, the resolution, the spatial extent, the needed climate (hazard) variables, the data format (NetCDF, Shape, ...) requested by the user, etc. into account. The Scenario Management puts the standardised order in the marketplace and notifies the user, if a CS Providers have accepted the order and have made an offer.
- from **[TC DC4 080](http://cat.clarity-h2020.eu/node/987/)**: The Scenario Management component supports the user in selecting the hazards to be considered in his study and for each of them selects the impact scenarios to be considered.

**Functionality related to simulation scenarios requested by DC Test Cases and User Stories:**

- from **[TC DC1](http://cat.clarity-h2020.eu/node/791)**: We are assuming here that simulation scenarios run off-line upon request of end users and are retrieved through the Scenario Management Building Block. Alternatively, the Scenario Management Building Block should allow to run simulations through web services.
- from **[TC DC1](http://cat.clarity-h2020.eu/node/791)**: The Scenario Management Building Block has to provide an user interface that will allow the user to request the creation of alternate (adaptation) scenarios for scenario comparison in the expert work flow (adaptation / no-adaptation option). This request needs to include the type of hazard/impact scenarios object of the simulation and the type of adaptation options to take into account. The supported adaptation options for a specific type of scenario are provided by the Catalogue of adaptation options.
- from **[TC DC1](http://cat.clarity-h2020.eu/node/791)**: Scenario Management Building Block has to offer a GUI that enables the end user to provide a complete specification of different (adaptation) scenarios that should be performed (off-line) by an expert.

## Exploitation Requirements assessment

**Implications related to the EU-GL Workflow:**

- from "Co-design Climate Services engaging a community of users, providers, purveyors and researchers": Be based on a well-defined and well-documented process (CLARITY Modelling Methodology) so that both users and providers of Climate Services are aware of the steps of the process as well as the required input and the required output.
- from "Establish trust in Climate Services and their providers": Users must be able to record the decisions that lead to the implementation of climate change adaptation measures and to trace them back to the underlying data and models. This relates mainly to Scenario Management.
- from "Co-design Climate Services engaging a community of users, providers, purveyors and researchers": Be based on a well-defined and well-documented process (CLARITY Modelling Methodology) so that both users and providers of Climate Services are aware of the steps of the process as well as the required input and the required output.
- from "Follow a multi-sectoral approach that crosses the boundary of climate sciences": As different user perspectives (depending on the sectors in which they work in) will lead to different solutions being assessed by the use of CSIS, the Scenario Management is required to be flexible enough to cope with this variety of possible solutions. This is heterogeneity challenge can only be addressed by enforcing standardised processes (CLARITY Modelling Methodology) and data formats (Data Packages).
- from "Provide a user-friendly, intuitive and context-aware discovery and communication infrastructure for Climate Service": At each step ("module" in EU-GL terminology) the Scenario Management Building Block that actually implements the basic or expert workflow, has to present information on additional suitable context-dependent and fit-for-purpose local and sectoral data or providers that are able to generate such data. This includes of course also potential Expert Climate Services and their providers, respectively. When linked to the Marketplace such a discovery approach that recommends relevant content opens new exploitation possibilities.
- from "Provide a user-friendly, intuitive and context-aware discovery and communication infrastructure for Climate Service" The different steps proposed by EU-GL should be presented to the user in a "story" manner, allowing him to go back and forth, assessing in a visual manner (i.e, maps, graphs, tables) the consequences of the decisions he/she makes in each step.
- from "Use, define and promote open standards for data and services": The CLARITY Modelling Methodology that is developed in WP3 based on EU-GL combining the concepts of IPCC AR5 and the risk assessment community has to manifest in technical specifications and concrete technical solutions (e.g. Scenario Management and CSIS) that are to be provided and co-developed in WP4 and WP1.

**Implications related to simulation scenarios:**

- from "Provide a user-friendly, intuitive and context-aware discovery and communication infrastructure for Climate Service": ICT Climate Services that allow direct user interaction should be developed according concepts for usability and for human computer interaction with help of state-of-the art technologies for user interface design. This demands for modern and lightweight web applications rather than heavyweight and complex desktop applications.

## Technology Support


We could adopt the concept of a "Virtual Research Environment" to provide a shared workspace for users and providers of Expert Climate Service. 
The workspace is organized according to the CLARITY Modelling Methodology (Steps, Modules, etc.) and allows among other the exchange of information. 
We can provide a simple cloud based data exchange, messaging system, etc.

If these system becomes too complex nobody will use it and there is risk that we will get lost in details.