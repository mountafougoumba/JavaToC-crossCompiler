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
public class TREE24Controller implements Initializable {

    @FXML
    private AnchorPane idTREE24AnchorPane;

    @FXML
    private Label idMessage;

    @FXML
    private JFXTextField keyTextField;

    @FXML
    private JFXButton deleteNodebtn;

    @FXML
    private JFXButton InsertNodeBtn;

    public AnchorPane getIdTREE24AnchorPane() {
        return idTREE24AnchorPane;
    }

    public void setIdTREE24AnchorPane(AnchorPane idTREE24AnchorPane) {
        this.idTREE24AnchorPane = idTREE24AnchorPane;
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

    public JFXButton getDeleteNodebtn() {
        return deleteNodebtn;
    }

    public void setDeleteNodebtn(JFXButton deleteNodebtn) {
        this.deleteNodebtn = deleteNodebtn;
    }

    public JFXButton getInsertNodeBtn() {
        return InsertNodeBtn;
    }

    public void setInsertNodeBtn(JFXButton InsertNodeBtn) {
        this.InsertNodeBtn = InsertNodeBtn;
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
