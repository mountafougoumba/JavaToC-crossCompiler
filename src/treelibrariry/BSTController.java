/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treelibrariry;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.PreparedStatement;
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
public class BSTController implements Initializable {

    @FXML
    private AnchorPane idBstAnchorPane;

    @FXML
    private Label idMessage;

    @FXML
    private com.jfoenix.controls.JFXTextField keyTextField;

    public AnchorPane getIdBstAnchorPane() {
        return idBstAnchorPane;
    }

    public void setIdBstAnchorPane(AnchorPane idBstAnchorPane) {
        this.idBstAnchorPane = idBstAnchorPane;
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
