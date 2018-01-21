package resume;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import java.net.URL;
import java.util.ResourceBundle;

public class Resume implements Initializable {

    @FXML
    private AnchorPane root;
    @FXML
    private ImageView profileDP;

    TableView tableView;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tableView = new TableView();
        TableColumn column = new TableColumn("Name");

    }
}
