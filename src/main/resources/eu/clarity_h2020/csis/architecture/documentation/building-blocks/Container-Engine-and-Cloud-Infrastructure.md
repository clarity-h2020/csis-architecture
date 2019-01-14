## Summary

The CSIS is envisioned to be composed of a set of (micro)services that can independently be deployed as isolated <strong>containers</strong>. For this purpose, we need a Container Engine or a Cloud Infrastructure, respectively.

Therefore we are relatively independent of technological constraints regarding background technology of ICT Services and are free to choose whatever fits best into CSIS architecture as long as the requirements (functional, exploitation, etc.) are met. For some of those ICT services we will be able use ready-to-use open source solutions, e.g. GeoServer, PostgeSQL with PostGIS and many more. Others, especially those mentioned in the WP4 Task descriptions, have to be developed based on background software.

## Functionality

As stated in deliverable 1.1 - Initial workshops and the clarity development environment, having a micro services architecture for CLARITY CSIS, will allow having heterogeneous technological stacks and different deployment processes.
Micro services are appropriate as architecture for CLARITY CSIS purposes and fits very well with a continuous integration platform, indeed it allows having heterogeneous technological stacks and different deployment processes for each software component. It will also bring autonomy on the development process of every consortium partner who will be working on a different CSIS component while having the confidence on not face big issues later on doing the different CSIS components integration.

This approach can provide:
- Independent developments
- Independent deploys
- Different software stacks.
- Fault tolerance
- Scalability and re-usability
- Ease security monitoring
- Business oriented components


## Exploitation Requirements assessment

The assessment of the Exploitation Requirements [2] identified the following concrete technical and functional implications on this particular Building Block:

- from "Develop a viable business ecosystem, business model and secure access to funding": Guaranteeing the long-term sustainability of the CSIS, which can be achieved by the provision of a technological infrastructure that ensures maintainability and extensibility beyond the end of the project.
- from "Develop a viable business ecosystem, business model and secure access to funding": Adopting state of the art cloud and container technologies to be able to transfer the complete CSIS to new hosting environment.
- from "Develop a viable business ecosystem, business model and secure access to funding": maximising the usage open source software for the implementation of ICT Climate Services to avoid licensing costs.
- from "Develop a viable business ecosystem, business model and secure access to funding": Minimizing dependencies to software and data that cannot be used after end of the project due to licensing, data protection issues.

## Technology Support

Regarding containerization Docker is the choice to achieve having such micro services architecture since Docker container engine is able to encapsulate lightweight runtime environments and provide good portability, performance, ease of replication, environment isolation, high availability and scalability as some of its main features.

To coordinate, monitor and manage such container infrastructure an automation technology is highly recommendable. Docker Compose seems to be appropriate as first approach because its simplicity but depending on the project needs it may change to Kubernetes. This kind of tools are able to provisioning hosts, instantiating a set of containers, link containers, expose services and scale the container cluster.

About the underlying hardware infrastructure there are two approaches under consideration:

- Local CI server
ATOS or AIT can provide a dedicated development server (64 GB RAM, 8 cores, 8 TB hard drive) where the CI tools will be available for automatizing the different CSIS components code compilation, testing, and integration. Initially this is the option to be used unless project development requires a more powerful infrastructure.

- European Grid Infrastructure
EGI is a foundation providing access to computing services across Europe by using grid computing techniques. It links computing centres in different European countries to support international research activities in different disciplines.
EGI offers to deploy and scale Docker containers on demand, offering guaranteed computational resources in a secure and isolated environment with standard API access, without overhead of managing the operative system for an improved performance, ideal for development work. This option fits well with technical CLARITY ideas so it can be further explored if it is finally needed.

