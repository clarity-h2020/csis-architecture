package eu.clarity_h2020.csis.architecture;

import com.structurizr.Workspace;
import com.structurizr.api.StructurizrClient;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Properties;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 *
 * @author Pascal Dihé
 */
public class WorkspaceUploader {

    protected final Logger log = Logger.getLogger(ExplicitArchitectureFactory.class);
    protected final Properties properties = new Properties();
    private final static String PROPERTIES_FILE = "structurizr.properties";

    public WorkspaceUploader() {
        final InputStreamReader isr = new InputStreamReader(this.getClass().getResourceAsStream("structurizr.properties"));
        final BufferedReader br = new BufferedReader(isr);
        
        try {
            properties.load(br);
        } catch (IOException ioex) {
            log.error("could not load properties file: " + ioex.getMessage(), ioex);
            // bail out ....
            System.exit(1);
        }
    }

    protected void uploadWorkspaceToStructurizr(Workspace workspace) throws Exception {
        StructurizrClient structurizrClient = new StructurizrClient(properties.getProperty("API_KEY"), properties.getProperty("API_SECRET"));
        structurizrClient.setMergeFromRemote(true);
        structurizrClient.putWorkspace(Long.valueOf(properties.getProperty("WORKSPACE_ID")), workspace);
    }
    
    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();
        final WorkspaceUploader workspaceUploader = new WorkspaceUploader();
        final Workspace workspace = new Workspace("CLARITY", "CLARTIY Explicit Architecture");
        
        ExplicitArchitectureFactory explicitArchitecture = new ExplicitArchitectureFactory(workspace);
        
        workspaceUploader.uploadWorkspaceToStructurizr(workspace);
    }
    
}
