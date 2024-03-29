
package library;

import insidefx.undecorator.Undecorator;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class BorrowerInterface_FXMLController implements Initializable {

    Borrower a = new Borrower("Not available", "Not available", "Not available", "Not available", "Not available", "na.jpg", "Not available");

    @FXML
    private void handleStockButtonAction(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("borStock.fxml"));
        try {
            loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //FXMLController d = loader.getController();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //d.getUser(loginID.getText());
        //System.out.println(loginID.getText());
        Parent root1 = loader.getRoot();
        Undecorator undecorator = new Undecorator(stage, (Region) root1);

        // Default theme
        undecorator.getStylesheets().add("skin/undecorator.css");
        Scene scene1 = new Scene(undecorator);
        scene1.setFill(Color.TRANSPARENT);
        stage.setScene(scene1);
        stage.show();
        stage.setResizable(false);

    }

    @FXML
    private void handleProfileButtonAction(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("borProfile.fxml"));
        try {
            loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //FXMLController d = loader.getController();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //d.getUser(loginID.getText());
        //System.out.println(loginID.getText());
        Parent root1 = loader.getRoot();
        Undecorator undecorator = new Undecorator(stage, (Region) root1);

        // Default theme
        undecorator.getStylesheets().add("skin/undecorator.css");
        Scene scene1 = new Scene(undecorator);
        scene1.setFill(Color.TRANSPARENT);
        stage.setScene(scene1);
        stage.show();
        stage.setResizable(false);

    }

    @FXML
    private void handleRequestButtonAction(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("RequestBook.fxml"));
        try {
            loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //FXMLController d = loader.getController();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //d.getUser(loginID.getText());
        //System.out.println(loginID.getText());
        Parent root1 = loader.getRoot();
        Undecorator undecorator = new Undecorator(stage, (Region) root1);

        // Default theme
        undecorator.getStylesheets().add("skin/undecorator.css");
        Scene scene1 = new Scene(undecorator);
        scene1.setFill(Color.TRANSPARENT);
        stage.setScene(scene1);
        stage.show();
        stage.setResizable(false);
    }

    @FXML
    private void handleHistoryButtonAction(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("History.fxml"));
        try {
            loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //FXMLController d = loader.getController();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //d.getUser(loginID.getText());
        //System.out.println(loginID.getText());
        Parent root1 = loader.getRoot();
        Undecorator undecorator = new Undecorator(stage, (Region) root1);

        // Default theme
        undecorator.getStylesheets().add("skin/undecorator.css");
        Scene scene1 = new Scene(undecorator);
        scene1.setFill(Color.TRANSPARENT);
        stage.setScene(scene1);
        stage.show();
        stage.setResizable(false);
    }

    public Borrower getUser(String id) {

        for (Borrower in : Library.users) {
            //System.out.println(id);
            if (in.Username.equalsIgnoreCase(id)) {
                a = in;
                break;
            }
        }


        return a;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void logout(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("login.fxml"));
        try {
            loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //FXMLController d = loader.getController();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //d.getUser(loginID.getText());
        //System.out.println(loginID.getText());
        Parent root1 = loader.getRoot();
        Undecorator undecorator = new Undecorator(stage, (Region) root1);

        // Default theme
        undecorator.getStylesheets().add("skin/undecorator.css");
        Scene scene1 = new Scene(undecorator);
        scene1.setFill(Color.TRANSPARENT);
        stage.setScene(scene1);
        stage.show();
        stage.setResizable(false);

    }

}



