package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextField msgField;

    @FXML
    TextArea textArea;

    public void clickSendBtn(ActionEvent actionEvent) {
        textArea.appendText(msgField.getText()+"\n");
        msgField.clear();
    }

    public void clickSendEnter(ActionEvent actionEvent) {
        textArea.appendText(msgField.getText()+"\n");
        msgField.clear();
    }
}
