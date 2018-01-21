package grp.anon.login;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

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
        login_pane.getChildren().add(FXMLLoader.load(getClass().getResource("Login.fxml")));
        makeFadeEffect(login_material_pane,FXMLLoader.load(getClass().getResource("Login.fxml")));
    }

    @FXML
    void recruiterSignup(ActionEvent event) throws IOException {
        login_material_pane.setVisible(false);
        login_pane.getChildren().add(FXMLLoader.load(getClass().getResource("SignUP.fxml")));
    }

    @FXML
    void studentLogin(ActionEvent event) throws IOException {
        login_material_pane.setVisible(false);
        login_pane.getChildren().add(FXMLLoader.load(getClass().getResource("Login.fxml")));
    }

    @FXML
    void studentSignup(ActionEvent event) {

    }

    private void makeFadeEffect(Node from,Node to) {
        to.setVisible(false);
        FadeTransition fromFade = new FadeTransition(Duration.seconds(1),from);
        fromFade.setFromValue(1);
        fromFade.setToValue(0);
        fromFade.play();
        fromFade.setOnFinished(e->{
            from.setVisible(false);
            to.setVisible(true);
            FadeTransition fromTo = new FadeTransition(Duration.seconds(1),from);
            fromTo.setFromValue(0);
            fromTo.setToValue(1);
            fromTo.play();
        });
    }
}
