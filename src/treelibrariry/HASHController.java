/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treelibrariry;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Barry Fougoumba
 */
public class HASHController implements Initializable {

    @FXML
    private AnchorPane idHASHAnchorPane;

    @FXML
    private Label idMessage;

    @FXML
    private JFXTextField keyTextField;

    
    @FXML
    private JFXButton InsertNodeBtn;

    public AnchorPane getIdHASHAnchorPane() {
        return idHASHAnchorPane;
    }

    public void setIdHASHAnchorPane(AnchorPane idHASHAnchorPane) {
        this.idHASHAnchorPane = idHASHAnchorPane;
    }

    public Label getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Label idMessage) {
        this.idMessage = idMessage;
    }

    public JFXTextField getKeyTextField() {
        return keyTextField;
    }

    public void setKeyTextField(JFXTextField keyTextField) {
        this.keyTextField = keyTextField;
    }

    @FXML
    void DeleteNodeBtn(ActionEvent event) {

    }

    @FXML
    void InsertNodeBtn(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
