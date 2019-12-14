
package fxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import start.StartApp;



public class RegistrationFormFXMLController implements Initializable 
{

    @FXML
    private AnchorPane pane;
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {        
    }       

    @FXML
    private void openLognForm(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/MainGUIFXML.fxml"));
        start.StartApp.stage.getScene().setRoot(root);
    }    
    
    @FXML
    private void openRegistrationForm(MouseEvent event) 
    {
    }
}
