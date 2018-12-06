/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package eu.clarity_h2020.csis.architecture;

import com.structurizr.Workspace;
import com.structurizr.io.plantuml.PlantUMLWriter;
import com.structurizr.util.WorkspaceUtils;
import com.structurizr.view.View;
import com.structurizr.view.ViewSet;

import org.apache.log4j.BasicConfigurator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * DOCUMENT ME!
 *
 * @author   pd
 * @version  $Revision$, $Date$
 */
public class WorkspaceExporter {

    //~ Static fields/initializers ---------------------------------------------

    static final org.apache.log4j.Logger LOGGER = org.apache.log4j.Logger.getLogger(WorkspaceExporter.class);

    //~ Methods ----------------------------------------------------------------

    /**
     * DOCUMENT ME!
     *
     * @param   args  DOCUMENT ME!
     *
     * @throws  Exception  DOCUMENT ME!
     */
    public static void main(final String[] args) throws Exception {
        BasicConfigurator.configure();
        File diagramsRoot;
        if (args.length > 0) {
            diagramsRoot = new File(args[0]);
        } else {
            diagramsRoot = new File(WorkspaceExporter.class.getResource("diagrams").toURI());
        }
        LOGGER.info("storing plantUML Diagrams in " + diagramsRoot);

        final Workspace workspace = new Workspace("CLARITY", "CLARTIY Architecture");

        final CsisArchitectureFactory csisArchitecture = new CsisArchitectureFactory(workspace);

        final PlantUMLWriter plantUMLWriter = new PlantUMLWriter();

        // if you're using dark background colours, you might need to explicitly set the foreground colour using skin
        // params e.g. rectangleFontColor, rectangleFontColor<<Software System>>, etc
        plantUMLWriter.addSkinParam("rectangleFontColor", "#ffffff");
        plantUMLWriter.addSkinParam("rectangleStereotypeFontColor", "#ffffff");

        final ViewSet viewSet = workspace.getViews();
        viewSet.getComponentViews().forEach((view) -> { writeDiagrams(diagramsRoot, plantUMLWriter, view); });
        viewSet.getContainerViews().forEach((view) -> { writeDiagrams(diagramsRoot, plantUMLWriter, view); });
        viewSet.getDeploymentViews().forEach((view) -> { writeDiagrams(diagramsRoot, plantUMLWriter, view); });
        viewSet.getDynamicViews().forEach((view) -> { writeDiagrams(diagramsRoot, plantUMLWriter, view); });
        viewSet.getSystemContextViews().forEach((view) -> { writeDiagrams(diagramsRoot, plantUMLWriter, view); });
        viewSet.getSystemLandscapeViews().forEach((view) -> { writeDiagrams(diagramsRoot, plantUMLWriter, view); });

//        try (FileWriter fileWriter = new FileWriter(new File(diagramsRoot, "workspace.puml"))) {
//            LOGGER.debug("writing " + diagramsRoot.toString() + File.separator + "workspace.puml");
//                plantUMLWriter.write(workspace, fileWriter);
//                fileWriter.flush();
//                fileWriter.close();
//            }
//         catch (IOException ex) {
//            LOGGER.error(ex.getMessage(), ex);
//        }

        if (args.length > 1) {
            final File workspaceFile = new File(args[1], File.separator + "workspace.json");
            LOGGER.info("storing JSON Workspace in " + workspaceFile.toString());
            WorkspaceUtils.saveWorkspaceToJson(workspace, workspaceFile);
        }
    }

    /**
     * DOCUMENT ME!
     *
     * @param  diagramsRoot    DOCUMENT ME!
     * @param  plantUMLWriter  DOCUMENT ME!
     * @param  view            DOCUMENT ME!
     */
    protected static void writeDiagrams(final File diagramsRoot, final PlantUMLWriter plantUMLWriter, final View view) {
        final String filename = view.getKey() + ".puml";
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("writing " + diagramsRoot.toString() + File.separator + filename);
        }
        try(final FileWriter fileWriter = new FileWriter(new File(diagramsRoot, filename))) {
            plantUMLWriter.write(view, fileWriter);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException ex) {
            LOGGER.error(ex.getMessage(), ex);
        }
    }
}
