## Summary

"Continuous integration is a software engineering practice in which isolated changes are immediately tested and reported on when they are added to a larger code base. The goal of CI is to provide quick feedback so that if a defect is introduced into the code base, it can be identified and corrected as soon as possible. Continuous integration software tools can be used to automate the testing and build a document trail." 
(July 2008 by Margaret Rouse - http://searchsoftwarequality.techtarget.com/definition/continuous-integration )

## Functionality

As described in deliverable 1.1 - Initial workshops and the clarity development environment, the purpose of this task is to provide a continuous integration platform allowing every consortium partner to rely on a software engineering practice already consolidated. One of the most important factors on a successful IT projects is to develop high quality software. Use an appropriate development infrastructure and best practices could be crucial in development in a distributed environment.

Continuous Integration can prevent and reduce errors by analysing health of the source code, since code analysis and tests provided by a CI environment can reveal bugs in a more effective way ensuring a higher quality final product. This feature gives more confidence to developer team on providing new functionalities and makes development much more comfortable, it even provide tools to generate API-like documentation for all committed code, making much easier to improve and reuse source code or software components.


## Exploitation Requirements assessment

The assessment of the Exploitation Requirements [2] identified the following concrete technical and functional implications on this particular Building Block:

- from "Develop a viable business ecosystem, business model and secure access to funding": provision of a development environment and continuous integration system that eases common software maintenance tasks, e.g. bug fixes

## Technology Support

- the source code of the various visual modules to be implemented/integrated in the CIS web client(s) must be tested against the different browser flavours available in the market (i.e., Firefox, Chrome, Safari, Internet Explorer) in order to ensure that they run smoothly and free of incompatibilities in each them. To that end, plugins for the Jenkins( https://jenkins-ci.org/) Continuous Integration service like Selenium(http://www.seleniumhq.org/) allowing carrying out such automated tests will be used in the development phase (from "Provide a user-friendly, intuitive and context-aware discovery and communication infrastructure for Climate Service")

