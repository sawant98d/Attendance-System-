
package home.controllers;

import com.jfoenix.controls.JFXButton;
import controllers.EstablishedConnection;
import home.model.StudentsModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.sql.*;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Dadaso
 */
public class StudentDesignFXMLController implements Initializable {

    @FXML
    private SplitPane SplitPane;
    @FXML
    private TableView<?> tbData;
    
    @FXML
    private PieChart pieChart;
    @FXML
    private JFXButton butttonAddStudent;
    @FXML
    private Label totalStudents;
    @FXML
    private Label totalBoys;
    @FXML
    private Label totalGirls;
    @FXML
    private Label labNo;
    @FXML
    private TableColumn<?, ?> columnRollNo;
    @FXML
    private TableColumn<?, ?> columnFirstName;
    @FXML
    private TableColumn<?, ?> columnLastName;
    @FXML
    private TableColumn<?, ?> columnEMail;
    @FXML
    private TableColumn<?, ?> columnContact;
    @FXML
    private TableColumn<?, ?> columnGender;
    @FXML
    private TableColumn<?, ?> columnIPAddress;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        loadChart();
        loadStudents();
    }
    
    private void loadChart()
    {   
        int total_boys=0;
        int total_girls=0; 
        try
        {
            Connection conn = EstablishedConnection.getEstablishedConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student WHERE gender='Male'");
            for(total_boys=1; rs.next(); total_boys++);
            
            rs = stmt.executeQuery("SELECT * FROM student WHERE gender='Female'");
            
            for(total_girls=1; rs.next(); total_girls++);
        }
        catch(Exception e){}
                
        PieChart.Data slice1 = new PieChart.Data("Boys", total_boys);
        PieChart.Data slice2 = new PieChart.Data("Girls", total_girls);
                
        pieChart.getData().add(slice1);
        pieChart.getData().add(slice2);        
        
        totalStudents.setText(total_boys+total_girls+"");
        totalBoys.setText(total_boys+"");
        totalGirls.setText(total_girls+"");
        
    }

    @FXML
    private void signUpAction(MouseEvent event) throws Exception
    {        
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/RegisterStudent1FXML.fxml")); 
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.getIcons().add(new Image("/images/icon.png"));
        stage.initStyle(StageStyle.UTILITY);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    } 
    
   // private ObservableList<StudentsModel> studentsModels = ;
    
    private void loadStudents()
    {
        columnRollNo.setCellValueFactory(new PropertyValueFactory<>("RollNo"));
        columnFirstName.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
        columnLastName.setCellValueFactory(new PropertyValueFactory<>("LastName"));
        columnEMail.setCellValueFactory(new PropertyValueFactory<>("EMail"));        
        columnContact.setCellValueFactory(new PropertyValueFactory<>("Contact"));
        columnGender.setCellValueFactory(new PropertyValueFactory<>("Gender"));
        columnIPAddress.setCellValueFactory(new PropertyValueFactory<>("IP Address"));        
     //   tbData.setItems(studentsModels);
    }
}
