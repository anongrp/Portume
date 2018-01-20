package grp.anon.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private StackPane login_pane;

    @FXML
    private AnchorPane login_material_pane;

    @FXML
    private Button recruiter_login_btn;

    @FXML
    private Button recruiter_signup_btn;

    @FXML
    private Button student_login_btn;

    @FXML
    private Button student_signup_btn;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    void recruiterLogin(ActionEvent event) throws IOException {
        login_material_pane.setVisible(false);
        login_pane.getChildren().add(FXMLLoader.load(getClass().getResource("Login.fxml")));
    }

    @FXML
    void recruiterSignup(ActionEvent event) throws IOException {
        login_material_pane.setVisible(false);
        login_pane.getChildren().add(FXMLLoader.load(getClass().getResource("SignUP.fxml")));
    }

    @FXML
    void studentLogin(ActionEvent event) {

    }

    @FXML
    void studentSignup(ActionEvent event) {

    }

}
