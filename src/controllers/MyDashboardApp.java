
package controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MyDashboardApp extends Application {
    
    @Override
    public void start(Stage stage) throws Exception 
    {        
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/MainHomePageDesignFXML.fxml"));
        stage.setTitle("Attendance System & File Sharing");
        stage.getIcons().add(new Image("/images/icon.png"));
        stage.setScene(new Scene(root));
        stage.setMaximized(true);
        stage.show();       
    }    
    public static void main(String[] args) 
    {
        launch(args);
    }    
}
