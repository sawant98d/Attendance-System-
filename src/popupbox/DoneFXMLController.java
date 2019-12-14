
package popupbox;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
public class DoneFXMLController implements Initializable {

    @FXML
    private Label doneMessage;

    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
            doneMessage.setText("Inserted success");
    }               
}