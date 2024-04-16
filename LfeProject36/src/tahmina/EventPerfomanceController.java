/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package tahmina;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class EventPerfomanceController implements Initializable {

    @FXML
    private ComboBox<String> venueCB;
    @FXML
    private PieChart performancePieChart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        venueCB.getItems().addAll(
                "Proshika HRDC, Koitta, Manikganj",
                "Brac Learning Center, Barisal",
                "Rural Development Academy, Bogra"
        );
        
        // TODO
    }    

    @FXML
    private void returntodashboardClickedButton(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/tahmina/VenueIncharge.fxml"));
        Scene scene = new Scene(parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void submitClickedButton(ActionEvent event) {
        String selectedVenue = venueCB.getValue();
        
        // Generate sample data for the PieChart
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Day 1", Math.random() * 100),
                new PieChart.Data("Day 2", Math.random() * 100),
                new PieChart.Data("Day 3", Math.random() * 100),
                new PieChart.Data("Day 4", Math.random() * 100),
                new PieChart.Data("Day 5", Math.random() * 100),
                new PieChart.Data("Day 6", Math.random() * 100),
                new PieChart.Data("Day 7", Math.random() * 100)
        );
        
        // Set the data to the PieChart
        performancePieChart.setData(pieChartData);
        performancePieChart.setTitle("Event Performance for " + selectedVenue);
    }
    }
    

