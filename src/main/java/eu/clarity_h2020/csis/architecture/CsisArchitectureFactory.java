/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package eu.clarity_h2020.csis.architecture;

import com.structurizr.Workspace;
import com.structurizr.documentation.AutomaticDocumentationTemplate;
import com.structurizr.model.Component;
import com.structurizr.model.Container;
import com.structurizr.model.DeploymentNode;
import com.structurizr.model.Location;
import com.structurizr.model.Model;
import com.structurizr.model.Person;
import com.structurizr.model.SoftwareSystem;
import com.structurizr.model.Tags;
import com.structurizr.util.MapUtils;
import com.structurizr.view.*;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;

import java.net.URISyntaxException;
import java.net.URL;

/**
 * This is a simple example of how to get started with CSIS CsisArchitectureFactory.
 *
 * @version  $Revision$, $Date$
 */
public class CsisArchitectureFactory {

    //~ Instance fields --------------------------------------------------------

    protected Logger log = Logger.getLogger(CsisArchitectureFactory.class);
    protected final Workspace workspace;
    protected final URL documentationRoot = CsisArchitectureFactory.class.getResource("documentation");

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new CsisArchitectureFactory object.
     *
     * @param  workspace  DOCUMENT ME!
     */
    public CsisArchitectureFactory(final Workspace workspace) {
        // a CsisArchitectureFactory workspace is the wrapper for a software architecture model, views and documentation
        this.workspace = workspace;
        final Model model = workspace.getModel();

        // add some elements to your software architecture model
        final Person csCustomer = model.addPerson("Customer", "Climate Service Customer");
        final Person csSupplier = model.addPerson("Supplier", "Climate Service Supplier");

        final SoftwareSystem csis = model.addSoftwareSystem(
                Location.Internal,
                "CSIS",
                "Climate Service Information System");

        final SoftwareSystem marketplace = model.addSoftwareSystem(
                Location.Internal,
                "Marketplace",
                "Climate Service Marketplace");

        final SoftwareSystem platform = model.addSoftwareSystem(
                Location.External,
                "Platforms and Portals",
                "External (Climate) Data Infrasrtuctures, Servive Platform and Portals");

        // Building Blocks
        final Container docker = csis.addContainer("Runtime Environment", "Default Runtime Environment", "docker");

        final Component catalogueOfDataSourcesAndSimulationModels = docker.addComponent(
                "Catalogue of Data Sources and Simulation Models",
                "CatalogueOfDataSourcesAndSimulationModels",
                "AIT Emikat");

        // csis.uses(marketplace, "discover products and services");
        csCustomer.uses(csis, "perform climate addaptation study");

        // marketplace relations
        csCustomer.uses(marketplace, "discover additional products and services");
        csSupplier.uses(marketplace, "offer value-added products and services");
        marketplace.uses(csis, "promote products and services");

        final DeploymentNode developerLaptop = model.addDeploymentNode(
                "Developer Laptop",
                "A developer laptop.",
                "Microsoft Windows 10 or Apple macOS");
        final DeploymentNode apacheTomcat = developerLaptop.addDeploymentNode(
                    "Docker Container - Web Server",
                    "A Docker container.",
                    "Docker")
                    .addDeploymentNode(
                        "Apache Tomcat",
                        "An open source Java EE web server.",
                        "Apache Tomcat 8.x",
                        1,
                        MapUtils.create("Xmx=512M", "Xms=1024M", "Java Version=8"));
        apacheTomcat.add(docker);

        // define some views (the diagrams you would like to see)
        final ViewSet views = workspace.getViews();
        final SystemContextView systemContextView = views.createSystemContextView(
                csis,
                "SystemContextView",
                "CSIS System Context");
        systemContextView.setEnterpriseBoundaryVisible(false);
        systemContextView.addNearestNeighbours(csis);
        systemContextView.setPaperSize(PaperSize.A5_Landscape);
        systemContextView.addAllSoftwareSystems();
        systemContextView.addAllPeople();

        final DeploymentView developmentDeploymentView = views.createDeploymentView(
                csis,
                "DeploymentView",
                "An example development deployment scenario for the Internet Banking System.");
        developmentDeploymentView.setEnvironment("Development");
        developmentDeploymentView.add(developerLaptop);
        developmentDeploymentView.setPaperSize(PaperSize.A5_Landscape);

        final AutomaticDocumentationTemplate template = new AutomaticDocumentationTemplate(workspace);
        try {
            template.addSections(csis, new File(documentationRoot.toURI()));
        } catch (IOException | URISyntaxException ex) {
            log.error(ex.getMessage(), ex);
        }

        // add some styling
        final Styles styles = views.getConfiguration().getStyles();
        styles.addElementStyle(Tags.SOFTWARE_SYSTEM).background("#1168bd").color("#ffffff");
        styles.addElementStyle(Tags.PERSON).background("#08427b").color("#ffffff").shape(Shape.Person);
    }
}
