
package controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

import controllers.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class RegiFormFXMLController implements Initializable {

    @FXML
    private JFXPasswordField password;
    @FXML
    private JFXTextField userName;
    @FXML
    private JFXTextField loginID;
    @FXML
    private JFXPasswordField confirmPassword;
    @FXML
    private JFXButton signUpButton;

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signUpAction(MouseEvent event) throws Exception
    {
        PreparedStatement pst;
        Connection conn = EstablishedConnection.getEstablishedConnection();
        String password1 = password.getText();
        String password2 = confirmPassword.getText();
        String userNm = userName.getText();
        String loginId = loginID.getText();
        
        if(password1.equals(password2))
        {
            pst = conn.prepareStatement("insert into logindetail values(?,?,?)");
            pst.setString(1,userNm);
            pst.setString(2,loginId);
            pst.setString(3,password1);
            pst.execute();
            JOptionPane.showMessageDialog(null,"inserted success");
        }
        else
            JOptionPane.showMessageDialog(null,"Both password must be same");
    }

    @FXML
    private void openLoginForm(MouseEvent event) 
    {
       
    }
    
}
