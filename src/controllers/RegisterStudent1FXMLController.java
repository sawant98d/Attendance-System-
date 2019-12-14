
package controllers;

import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.sql.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;
import popupbox.*;

public class RegisterStudent1FXMLController implements Initializable 
{
    @FXML
    private JFXTextField eMail;
    @FXML
    private JFXTextField firstName;
    @FXML
    private JFXTextField rollNo;
    @FXML
    private JFXTextField contact;
    @FXML
    private JFXTextField lastName;
    @FXML
    private JFXTextField ipAddress;
    @FXML
    private JFXRadioButton rbMale;
    @FXML
    private JFXRadioButton rbFemale;
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {     
    }        

    @FXML
    private void onSaveAction(MouseEvent event) throws Exception
    {
       /* String studRollNo = rollNo.getText();
        String studIPAddress = ipAddress.getText();
        String studFirstName = firstName.getText();
        String studLastName = lastName.getText();
        String studEMail = eMail.getText();
        String studContact = contact.getText();
        String studGender = "";
        if(rbMale.isSelected())
            studGender+="Male";
        if(rbFemale.isSelected())
            studGender+="Female";
            
        String query = "INSERT INTO student VALUES(?,?,?,?,?,?,?)";
                
        Connection conn = EstablishedConnection.getEstablishedConnection();
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setString(1,studRollNo);
        pst.setString(2,studIPAddress);
        pst.setString(3,studFirstName);
        pst.setString(4,studLastName);
        pst.setString(5, studEMail);
        pst.setString(6,studContact);
        pst.setString(7,studGender);
        pst.execute();
        //JOptionPane.showMessageDialog(null,"Inserted success..!");
        
        */
        
        
        Parent root = FXMLLoader.load(getClass().getResource("/popupbox/DoneFXML.fxml")); 
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.getIcons().add(new Image("/images/icon.png"));
        stage.initStyle(StageStyle.UNDECORATED);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();                   
    }

    @FXML
    private void onResetAllAction(MouseEvent event) 
    {
        rollNo.setText("");
        ipAddress.setText("");
        firstName.setText("");
        lastName.setText("");
        eMail.setText("");
        contact.setText("");
        rbMale.setSelected(false);
        rbFemale.setSelected(false);
    }
}
