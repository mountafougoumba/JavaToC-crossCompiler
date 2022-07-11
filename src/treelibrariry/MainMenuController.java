/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treelibrariry;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Barry Fougoumba
 */
public class MainMenuController implements Initializable {

    @FXML
    private JFXButton idHome;

    @FXML
    private JFXButton idAVL;

    @FXML
    private JFXButton idweigtedGraph;

    @FXML
    private JFXButton idredblack;

    @FXML
    private JFXButton idHash;

    @FXML
    private JFXButton idUnweightedGraph;

    @FXML
    private JFXButton idBSTbtn;

    @FXML
    private JFXButton id24tree;

    @FXML
    private AnchorPane containPage;

    @FXML
    void UnweightedGraph(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("UNWEIGTEDGRAPH.xml"));
            loader.load();
            UNWEIGTEDGRAPHController control = loader.getController();
            containPage.getChildren().clear();
            containPage.getChildren().add(control.getIdUNWEIGHTEDAnchorPane());
        } catch (IOException ex) {
            Logger.getLogger(MainMenuController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    void on24Treebtn(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TREE24.xml"));
            loader.load();
            TREE24Controller control = loader.getController();
            containPage.getChildren().clear();
            containPage.getChildren().add(control.getIdTREE24AnchorPane());
        } catch (IOException ex) {
            Logger.getLogger(MainMenuController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    void onAVLbtn(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AVL.fxml"));
            
            AVLController control = loader.getController();
            //loader.load();
            containPage.getChildren().clear();
            containPage.getChildren().add((Pane) loader.load());
        } catch (IOException ex) {
            Logger.getLogger(MainMenuController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    void onBSTbtn(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BST.fxml"));
            BSTController control = loader.getController();
            ;
            
            containPage.getChildren().clear();
            containPage.getChildren().add((Pane) loader.load());

        } catch (IOException ex) {
            Logger.getLogger(MainMenuController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    void onHashbtn(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HASH.fxml"));
            loader.load();
            HASHController control = loader.getController();
            containPage.getChildren().clear();
            containPage.getChildren().add(control.getIdHASHAnchorPane());
        } catch (IOException ex) {
            Logger.getLogger(MainMenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void onHomeBtn(ActionEvent event) {

    }

    @FXML
    void onREDBLACK(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("REDBLACK.fxml"));
            loader.load();
            REDBLACKController control = loader.getController();
            containPage.getChildren().clear();
            containPage.getChildren().add(control.getIdREDBLACKAnchorPane());
        } catch (IOException ex) {
            Logger.getLogger(MainMenuController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    void onWeightedGraph(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("WEIGHTEDGRAPH.fxml"));
            loader.load();
            WEIGHTEDGRAPHController control = loader.getController();
            containPage.getChildren().clear();
            containPage.getChildren().add(control.getIdWEIGHTEDAnchorPane());
        } catch (IOException ex) {
            Logger.getLogger(MainMenuController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
