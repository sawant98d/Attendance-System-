
package com.client.chatwindow;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class ChatController implements Initializable {

    @FXML
    private BorderPane borderPane;
    @FXML
    private ImageView userImageView;
    @FXML
    private Label usernameLabel;
    @FXML
    private HBox onlineUsersHbox;
    @FXML
    private Label onlineCountLabel;
    @FXML
    private ListView<?> userList;
    @FXML
    private ListView<?> chatPane;
    @FXML
    private TextArea messageBox;
    @FXML
    private Button buttonSend;
    @FXML
    private Button recordBtn;
    @FXML
    private ImageView microphoneImageView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void closeApplication(MouseEvent event) {
    }

    @FXML
    private void sendMethod(KeyEvent event) {
    }

    @FXML
    private void sendButtonAction(ActionEvent event) {
    }

    @FXML
    private void recordVoiceMessage(MouseEvent event) 
    {
    }    
}
