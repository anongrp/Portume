package grp.anon.database;

import anon.database.Database;
import anon.database.DatabaseConnectionException;
import anon.database.Table;
import anon.database.TableCreationOutOfBoundException;
import javafx.scene.control.Alert;
import anon.database.connect.Connection;

import java.io.IOException;

final class DatabaseHandler {
    private static DatabaseHandler databaseHandler = null;
    private static Database mainDB;
    private static Table recruiterLoginTB;
    private static Table studentLoginTB;

    private DatabaseHandler() throws DatabaseConnectionException, IOException, TableCreationOutOfBoundException {
        if (!createConnection()){
            showError("Database Connection Failed");
        }
        else {
            mainDB= new Database("portume");
            recruiterLoginTB = new Table("RLT",mainDB); // RTL = Recruiter Login Table
            studentLoginTB = new Table("SLT",mainDB); // STL = Student Login Table
        }
    }

    private boolean createConnection(){
        return Connection.connect("Portume");
    }

    public static DatabaseHandler getInstance() throws IOException, DatabaseConnectionException, TableCreationOutOfBoundException {
        if (databaseHandler == null){
            databaseHandler = new DatabaseHandler();
        }
        return databaseHandler;
    }


    /* Method For Show Error */
    private void showError(String data){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error occured");
        alert.setHeaderText(data);
        alert.showAndWait();
    }

}
