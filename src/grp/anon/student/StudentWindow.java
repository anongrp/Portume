package grp.anon.student;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentWindow  implements Initializable {


    @FXML
    private WebView proPic;
    private WebEngine engine;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        engine = proPic.getEngine();
        engine.load(getClass().getResource("../inssets/pro_pic_portfolio.html").toExternalForm());
    }
}
