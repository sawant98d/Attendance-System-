
package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

public class MainHomePageDesignFXMLController implements Initializable 
{
    public static Stage myStage = null;
    @FXML
    private Pane contentArea;
    @FXML
    private Circle collegeLogo;
    @FXML
    private Button buttonHome;
    @FXML
    private Button buttonAboutUs;
    @FXML
    private Button buttonAboutApp;
    @FXML
    private Button buttonSetting;
    @FXML
    private Button buttonLogin;
    @FXML
    private Button buttonSignUp;
    @FXML
    private StackPane parentContainer;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        collegeLogo.setStroke(Color.SEAGREEN);                 
        Image image = new Image("/images/logo.jpg", false); // set the college logo on left top corner
        collegeLogo.setFill(new ImagePattern(image));     
    }    

    @FXML
    private void handleClicked(MouseEvent event) throws Exception
    {
        if(event.getSource() == buttonHome)
        {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/HomeContentAreaFXML.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(root);                       
        }
        
        if(event.getSource() == buttonAboutUs)
        {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/developer.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(root);                       
        }
        if(event.getSource() == buttonAboutApp)
        {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/AboutAppFXML.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(root);                     
        }
        if(event.getSource() == buttonSetting)
        {            
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/Setting1FXML.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(root);
        }        
        if(event.getSource() == buttonLogin)
        {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/MainGUIFXML.fxml")); 
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.getIcons().add(new Image("/images/icon.png"));
            stage.initStyle(StageStyle.UTILITY);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        }
        if(event.getSource() == buttonSignUp)
        {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/RegFormFXML.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.getIcons().add(new Image("/images/icon.png"));
            stage.initStyle(StageStyle.UTILITY);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        }
    }
}
