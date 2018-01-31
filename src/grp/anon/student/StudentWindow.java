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

    @FXML
    private WebEngine webEngine;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        webEngine = proPic.getEngine();
        webEngine.load(getClass().getResource("../inssets/ProfilePicForPortfolio.html").toExternalForm());
    }
}
