/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package eu.clarity_h2020.csis.architecture;

import com.structurizr.Workspace;
import com.structurizr.api.StructurizrClient;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Properties;

/**
 * DOCUMENT ME!
 *
 * @author   Pascal Dihé
 * @version  $Revision$, $Date$
 */
public class WorkspaceUploader {

    //~ Static fields/initializers ---------------------------------------------

    private static final String PROPERTIES_FILE = "structurizr.properties";

    //~ Instance fields --------------------------------------------------------

    protected final Logger log = Logger.getLogger(CsisArchitectureFactory.class);
    protected final Properties properties = new Properties();

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new WorkspaceUploader object.
     */
    public WorkspaceUploader() {
        final InputStreamReader isr = new InputStreamReader(this.getClass().getResourceAsStream(
                    PROPERTIES_FILE));
        final BufferedReader br = new BufferedReader(isr);

        try {
            properties.load(br);
        } catch (IOException ioex) {
            log.error("could not load properties file: " + ioex.getMessage(), ioex);
            // bail out ....
            System.exit(1);
        }
    }

    //~ Methods ----------------------------------------------------------------

    /**
     * DOCUMENT ME!
     *
     * @param   workspace  DOCUMENT ME!
     *
     * @throws  Exception  DOCUMENT ME!
     */
    protected void uploadWorkspaceToStructurizr(final Workspace workspace) throws Exception {
        final StructurizrClient structurizrClient = new StructurizrClient(properties.getProperty("API_KEY"),
                properties.getProperty("API_SECRET"));

        // Specifies whether the layout of diagrams from a remote workspace should
        // be retained when putting a new version of the workspace.
        structurizrClient.setMergeFromRemote(true);
        structurizrClient.setWorkspaceArchiveLocation(null);
        structurizrClient.putWorkspace(Long.valueOf(properties.getProperty("WORKSPACE_ID")), workspace);
    }

    /**
     * DOCUMENT ME!
     *
     * @param   args  DOCUMENT ME!
     *
     * @throws  Exception  DOCUMENT ME!
     */
    public static void main(final String[] args) throws Exception {
        BasicConfigurator.configure();
        final WorkspaceUploader workspaceUploader = new WorkspaceUploader();
        final Workspace workspace = new Workspace("CSIS", "CSIS Architecture");

        final CsisArchitectureFactory csisArchitecture = new CsisArchitectureFactory(workspace);

        workspaceUploader.uploadWorkspaceToStructurizr(workspace);
    }
}
