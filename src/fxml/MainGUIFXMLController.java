
package fxml;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

import java.sql.*;
import controllers.*;
import javafx.scene.image.Image;

public class MainGUIFXMLController implements Initializable 
{
    @FXML
    private Pane contentArea;
    @FXML
    private JFXPasswordField loginPassword;
    @FXML
    private JFXTextField loginID;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
       
    }    

    @FXML
    private void openTheRegistrationForm(MouseEvent event) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/RegiFormFXML.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(root);                                                   
    }

    @FXML
    private void openDashboard(MouseEvent event) throws Exception
    {
        Connection conn = EstablishedConnection.getEstablishedConnection();
        PreparedStatement pst = conn.prepareStatement("SELECT loginID,password FROM logindetail WHERE loginID=? AND password=?");
        pst.setString(1,loginID.getText());
        pst.setString(2,loginPassword.getText());               
        ResultSet rs = pst.executeQuery();
        if(rs.next())
        {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/MainDashboardFXML.fxml"));
            Stage stage = new Stage();                        
            stage.setTitle("Attendance System & File Sharing");
            stage.getIcons().add(new Image("/images/icon.png"));
            stage.setScene(new Scene(root));
            stage.setMaximized(true);
            stage.show();       
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Incorrect id or password or both");
        }
    }           
}
