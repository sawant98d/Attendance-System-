
package controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.sql.*;
import javax.swing.JOptionPane;


public class RegFormFXMLController implements Initializable {

    private JFXPasswordField password;
    @FXML
    private JFXTextField userName;
    @FXML
    private JFXTextField loginID;
    private JFXPasswordField confirmPassword;
    @FXML
    private JFXButton buttonSignUp;
    
    String filename;
    byte[] userImage;
    @FXML
    private ImageView photoPosition;
    @FXML
    private JFXPasswordField password1;
    @FXML
    private JFXPasswordField password2;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
       
    }   

    @FXML
    private void signUpAction(MouseEvent event) throws Exception
    {
        String password_1 = password1.getText();
        String password_2 = password2.getText();        
        String userNm = userName.getText();
        String userId = loginID.getText();
        
        Connection conn = EstablishedConnection.getEstablishedConnection();
        PreparedStatement pst;
        if(password_1.equals(password_2))
        {
            pst = conn.prepareStatement("INSERT into logindetail values(?,?,?)");
            pst.setString(1,userNm);
            pst.setString(2,userId);
            pst.setString(3,password_1);
            pst.execute();
            JOptionPane.showMessageDialog(null,"inserted success");
        }
        else
            JOptionPane.showMessageDialog(null,"Both password must be same");        
    }
}
