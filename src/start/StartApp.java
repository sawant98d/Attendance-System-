
package start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class StartApp  extends Application
{
   
    public static Stage stage=null;
    @Override
    public void start(Stage primaryStage) throws Exception 
    {
           Parent root = FXMLLoader.load(getClass().getResource("/fxml/MainGUIFXML.fxml"));
           stage = new Stage();
           Scene scene = new Scene(root);
           
           primaryStage.setTitle("Sawant Dadaso");
           primaryStage.getIcons().add(new Image("/images/icon.png"));
           
           stage.setScene(scene);
           stage.show();           
    }
     
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
