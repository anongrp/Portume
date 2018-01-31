package grp.anon.recruiter;


import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class RecruiterWindow implements Initializable {

    @FXML
    private AnchorPane drawer_pane;

    @FXML
    private ImageView hamburger;

    @FXML
    private AnchorPane drawer;

    @FXML
    private WebView profilePic;
    private WebEngine engine;

    private TranslateTransition drawerOpenTransition;
    private TranslateTransition drawerCloseTransition;
    private Integer toggle = -1;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        engine = profilePic.getEngine();
        engine.load(getClass().getResource("../inssets/profilePic.html").toExternalForm());
        drawerOpenTransition = new TranslateTransition(Duration.seconds(1),drawer);
        drawerOpenTransition.setFromX(0);
        drawerOpenTransition.setToX(300);
        drawerCloseTransition = new TranslateTransition(Duration.seconds(0.5),drawer);
        drawerCloseTransition.setFromX(300);
        drawerCloseTransition.setToX(0);
        hamburger.setOnMouseClicked(e->{
            if (toggle == -1){
                drawerOpenTransition.play();
                toggle *= -1;
            }
            else{
                drawerCloseTransition.play();
                toggle *= -1;
            }
        });
    }
}
