package eu.clarity_h2020.csis.architecture;

import com.structurizr.Workspace;
import com.structurizr.documentation.Format;
import com.structurizr.documentation.StructurizrDocumentationTemplate;
import com.structurizr.model.Model;
import com.structurizr.model.Person;
import com.structurizr.model.SoftwareSystem;
import com.structurizr.model.Tags;
import com.structurizr.view.*;
import org.apache.log4j.Logger;

/**
 * This is a simple example of how to get started with CSIS
 * ExplicitArchitectureFactory
 */
public class ExplicitArchitectureFactory {

    protected Logger log = Logger.getLogger(ExplicitArchitectureFactory.class);
    protected final Workspace workspace;

    public ExplicitArchitectureFactory(final Workspace workspace) {
        // a ExplicitArchitectureFactory workspace is the wrapper for a software architecture model, views and documentation
        this.workspace = workspace;
        Model model = workspace.getModel();

        // add some elements to your software architecture model
        Person csCustomer = model.addPerson("Customer", "Climate Service Customer");
        Person csSupplier = model.addPerson("Supplier", "Climate Service Supplier");

        SoftwareSystem csis = model.addSoftwareSystem("CSIS", "Climate Service Information System");
        SoftwareSystem marketplace = model.addSoftwareSystem("Marketplace", "Climate Service Marketplace");

        // csiis relations
        //csis.uses(marketplace, "discover products and services");
        csCustomer.uses(csis, "perform climate addaptation study");

        // marketplace relations
        csCustomer.uses(marketplace, "discover additional products and services");
        csSupplier.uses(marketplace, "offer value-added products and services");
        marketplace.uses(csis, "promote products and services");

        // define some views (the diagrams you would like to see)
        ViewSet views = workspace.getViews();
        SystemContextView contextView = views.createSystemContextView(csis, "CSIS", "CSIS System Context");
        contextView.setPaperSize(PaperSize.A5_Landscape);
        contextView.addAllSoftwareSystems();
        contextView.addAllPeople();

        // add some documentation
        StructurizrDocumentationTemplate template = new StructurizrDocumentationTemplate(workspace);
        template.addContextSection(csis, Format.Markdown,
                "Here is some context about the software system...\n"
                + "\n"
                + "![](embed:CSIS System Context)");

        // add some styling
        Styles styles = views.getConfiguration().getStyles();
        styles.addElementStyle(Tags.SOFTWARE_SYSTEM).background("#1168bd").color("#ffffff");
        styles.addElementStyle(Tags.PERSON).background("#08427b").color("#ffffff").shape(Shape.Person);
    }
}
