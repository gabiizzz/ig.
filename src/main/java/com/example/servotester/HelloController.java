package com.example.servotester;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.ImageCursor;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable{
    @FXML
    private Button button= new Button();
    @FXML
    private Button button1= new Button();
    @FXML
    private Button button2= new Button();
    @FXML
    private Button button3= new Button();
    @FXML
    private Button button4= new Button();
    @FXML
    private Button button5= new Button();
    @FXML
    private Button button6= new Button();
    @FXML
    private Button button7= new Button();
    @FXML
    private Button button8= new Button();
    @FXML
    private Button button9= new Button();
    @FXML
    private Button button10= new Button();
    @FXML
    private Button button11= new Button();
    @FXML
    private Button button12= new Button();
    @FXML
    private Button button13= new Button();
    @FXML
    private Button back= new Button();

    Image image= new Image("file:src/img/35.png");
    ImageView view= new ImageView(image);

    Image image1= new Image("file:src/img/axonmax.png");
    ImageView view1= new ImageView(image1);

    Image image2= new Image("file:src/img/swyft.png");
    ImageView view2= new ImageView(image2);

    Image image3= new Image("file:src/img/swyft2.png");
    ImageView view3= new ImageView(image3);

    Image image4= new Image("file:src/img/swyft3.png");
    ImageView view4= new ImageView(image4);

    Image image5= new Image("file:src/img/gobilda.png");
    ImageView view5= new ImageView(image5);

    Image image6= new Image("file:src/img/gobilda3.png");
    ImageView view6= new ImageView(image6);

    Image image7= new Image("file:src/img/gobilda2.png");
    ImageView view7= new ImageView(image7);

    Image image8= new Image("file:src/img/plex.png");
    ImageView view8= new ImageView(image8);

    Image image9= new Image("file:src/img/plex2.png");
    ImageView view9= new ImageView(image9);

    Image image10= new Image("file:src/img/rev.png");
    ImageView view10= new ImageView(image10);

    Image image11= new Image("file:src/img/axonmini.png");
    ImageView view11= new ImageView(image11);

    Image image12= new Image("file:src/img/axon.png");
    ImageView view12= new ImageView(image12);

    Image image13= new Image("file:src/img/axonmk2mini.png");
    ImageView view13= new ImageView(image13);

    private Stage stage;

    @FXML
    protected void thirtyfive(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("thirty.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage= (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void axonmax(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("axon.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage= (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void axonmini(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("axonmini.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage= (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void axonmk2max(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("axonmk2max.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage= (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void axonmk2mini(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("axonmk2mini.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage= (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void swyft(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("swyft.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage= (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void swyft2(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("swyft2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage= (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void swyft3(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("swyft3.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage= (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void rev(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("rev.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage= (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void gobilda(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("gobilda.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage= (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void gobilda2(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("gobilda2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage= (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void gobilda3(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("gobilda3.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage= (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void plex(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("plex.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage= (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void plex2(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("plex2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage= (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void back(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage= (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        view.setPreserveRatio(false);
        view.setFitWidth(110);
        view.setFitHeight(110);
        button.setGraphic(view);

        view1.setPreserveRatio(false);
        view1.setFitWidth(110);
        view1.setFitHeight(110);
        button1.setGraphic(view1);

        view2.setPreserveRatio(false);
        view2.setFitWidth(110);
        view2.setFitHeight(110);
        button2.setGraphic(view2);

        view3.setPreserveRatio(false);
        view3.setFitWidth(110);
        view3.setFitHeight(110);
        button3.setGraphic(view3);

        view4.setPreserveRatio(false);
        view4.setFitWidth(110);
        view4.setFitHeight(110);
        button4.setGraphic(view4);

        view5.setPreserveRatio(false);
        view5.setFitWidth(110);
        view5.setFitHeight(110);
        button5.setGraphic(view5);

        view6.setPreserveRatio(false);
        view6.setFitWidth(110);
        view6.setFitHeight(110);
        button6.setGraphic(view6);

        view7.setPreserveRatio(false);
        view7.setFitWidth(110);
        view7.setFitHeight(110);
        button7.setGraphic(view7);

        view8.setPreserveRatio(false);
        view8.setFitWidth(110);
        view8.setFitHeight(110);
        button8.setGraphic(view8);

        view9.setPreserveRatio(false);
        view9.setFitWidth(110);
        view9.setFitHeight(110);
        button9.setGraphic(view9);

        view10.setPreserveRatio(false);
        view10.setFitWidth(110);
        view10.setFitHeight(110);
        button10.setGraphic(view10);

        view11.setPreserveRatio(false);
        view11.setFitWidth(110);
        view11.setFitHeight(110);
        button11.setGraphic(view11);

        view12.setPreserveRatio(false);
        view12.setFitWidth(110);
        view12.setFitHeight(110);
        button12.setGraphic(view12);

        view13.setPreserveRatio(false);
        view13.setFitWidth(110);
        view13.setFitHeight(110);
        button13.setGraphic(view13);
    }
}
