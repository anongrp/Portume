package grp.anon.student;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class StudentSignUpController {
    @FXML
    private Button nxtButton;
    @FXML
    private Stage nxtStage;
    @FXML
    private Scene nxtScene1;
    @FXML
    private AnchorPane signup_input_pane;
    public void onNxtButtonClick(ActionEvent event){
        signup_input_pane.setVisible(false);
    }
}
