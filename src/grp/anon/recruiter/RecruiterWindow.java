package grp.anon.recruiter;


import grp.anon.Launcher;
import javafx.animation.TranslateTransition;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class RecruiterWindow implements Initializable {


    @FXML
    private BorderPane root;

    @FXML
    private AnchorPane drawer_pane;

    @FXML
    private HBox windowDock;

    @FXML
    private ImageView minBtn;

    @FXML
    private ImageView exitBtn;

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
        drawerOpenTransition = new TranslateTransition(Duration.seconds(0.5),drawer);
        drawerOpenTransition.setToX(300);
        drawerCloseTransition = new TranslateTransition(Duration.seconds(0.3),drawer);
        drawerCloseTransition.setToX(0);
        hamburger.setOnMouseClicked(e->{
            if (toggle == -1){
                drawerOpenTransition.setFromX(drawer.getTranslateX());
                drawerOpenTransition.play();
                toggle *= -1;
            }
            else{
                drawerCloseTransition.setFromX(drawer.getTranslateX());
                drawerCloseTransition.play();
                toggle *= -1;
            }
        });

        exitBtn.setOnMouseClicked(e->{
            exit();
        });
        minBtn.setOnMouseClicked(e->{
            minimize();
        });

        final double[] xOffset = new double[1];
        final double[] yOffset = new double[1];
        windowDock.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset[0] = event.getSceneX();
                yOffset[0] = event.getSceneY();
            }
        });

        windowDock.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                root.getScene().getWindow().setX(event.getScreenX() - xOffset[0]);
                root.getScene().getWindow().setY(event.getScreenY() - yOffset[0]);
            }
        });
    }

    private void exit(){
        System.exit(0);
    }

    private void minimize(){
        Launcher.minimize();
    }
}
