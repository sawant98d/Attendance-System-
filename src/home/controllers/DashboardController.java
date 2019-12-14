/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.controllers;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;


public class DashboardController implements Initializable {

    @FXML
    private TableView<?> tbData;
    @FXML
    private TableColumn<?, ?> studentId;
    @FXML
    private TableColumn<?, ?> firstName;
    @FXML
    private TableColumn<?, ?> lastName;
    @FXML
    private PieChart pieChart;
    @FXML
    private SplitPane SplitPane;
    @FXML
    private JFXButton butttonAddStudent;
   
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
                
    }    

    @FXML
    private void signUpAction(MouseEvent event) 
    {
    }
    
}
