
package fxml;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class MainDashboardFXMLController implements Initializable {

    private VBox printStudents = null;
    @FXML
    private Circle myCircle;
    @FXML
    private Button buttonHome;
    @FXML
    private Button buttonStudent;
    @FXML
    private Button buttonAttendenceOverview;
    @FXML
    private Button buttonStudentContact;
    @FXML
    private Button buttonSetting;  
  
    private Pane myPane;
    @FXML
    private Pane contentArea;
    @FXML
    private Button buttonLogout;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
        //circle image display start
        myCircle.setStroke(Color.SEAGREEN);                  // set the border of the circle
        Image image = new Image("/images/34.jpg", false);    //  set image to image object   
        myCircle.setFill(new ImagePattern(image));           // fill circle with image object
       // myCircle.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));
        //circle image display end
    }    
    

    @FXML
    // On click event of button menu left side on dashboard
    private void handleClicked(MouseEvent actionEvent) 
    {
        if(actionEvent.getSource() == buttonHome)
        {
            //myPane.setStyle("-fx-background-color:#0A0E3F");
            //myPane.toFront();
            try
            {
                Parent root = FXMLLoader.load(getClass().getResource("/fxml/StudentDesignFXML.fxml"));
                contentArea.getChildren().removeAll();
                contentArea.getChildren().setAll(root);
            }
            catch (IOException ex) 
            {
                System.out.println("Exception"+ex);
            }        
        }
        if(actionEvent.getSource() == buttonStudent)
        {
            try
            {
                Parent root = FXMLLoader.load(getClass().getResource("/fxml/StudentDesignFXML.fxml"));
                contentArea.getChildren().removeAll();
                contentArea.getChildren().setAll(root);                                                                       
            }
            catch(IOException ex)
            {
                System.out.println("Exception "+ex);
            }
            
        }
        if(actionEvent.getSource() == buttonAttendenceOverview)
        {
            try
            {
                Parent root = FXMLLoader.load(getClass().getResource("/fxml/OverviewFXML.fxml"));
                contentArea.getChildren().removeAll();
                contentArea.getChildren().setAll(root);
            }
            catch(IOException ex)
            {
                System.out.println("Exception "+ex);
            }
        }
        if(actionEvent.getSource() == buttonStudentContact)
        {
            try
            {
                Parent root = FXMLLoader.load(getClass().getResource("/fxml/ChatView.fxml"));
                contentArea.getChildren().removeAll();
                contentArea.getChildren().setAll(root);                
            }
            catch(IOException ex)
            {
                System.out.println("Exception "+ex);
            }
        }
        if(actionEvent.getSource() == buttonSetting)
        {
            try
            {
                Parent root = FXMLLoader.load(getClass().getResource("/fxml/SettingDesignFXML.fxml"));
                contentArea.getChildren().removeAll();
                contentArea.getChildren().setAll(root);
            }
            catch(IOException ex)
            {
                System.out.println("Exception "+ex);
            }            
        }
        if(actionEvent.getSource() == buttonLogout)
        {
            try
            {
                Parent root = FXMLLoader.load(getClass().getResource("/fxml/LogoutDesignFXML.fxml"));
                contentArea.getChildren().removeAll();
                contentArea.getChildren().setAll(root);                
            }
            catch(IOException ex)
            {
                System.out.println("Exception : "+ex);
            }
        }
    }
}
