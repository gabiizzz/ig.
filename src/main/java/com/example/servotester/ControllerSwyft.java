package com.example.servotester;

import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.servotester.DurationThing.setDur;

public class ControllerSwyft implements Initializable {
    @FXML
    private Button back= new Button();
    @FXML
    private ImageView view= new ImageView();
    @FXML
    private ImageView servo = new ImageView();
    @FXML
    private ImageView arm = new ImageView();
    @FXML
    private Button L;
    @FXML
    private Button P;
    @FXML
    private Button R;

    Stage stage;

    @FXML
    protected void back(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage= (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    double angle = 0;
    double lastAngle = 0;

    @FXML
    protected void onR(){
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(arm);
        angle = 160;
        rotate.setDuration(Duration.seconds(setDur(angle, lastAngle, 0.0112)));
        rotate.setToAngle(angle);
        rotate.play();
        lastAngle = angle;
    }

    @FXML
    protected void onP(){
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(arm);
        angle = 0;
        rotate.setDuration(Duration.seconds(setDur(angle, lastAngle, 0.0112)));
        rotate.setToAngle(angle);
        rotate.play();
        lastAngle = angle;
    }

    @FXML
    protected void onL(){
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(arm);
        angle = -160;
        rotate.setDuration(Duration.seconds(setDur(angle, lastAngle, 0.0112)));
        rotate.setToAngle(angle);
        rotate.play();
        lastAngle = angle;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image image= new Image("file:src/img/swyfties.png");
        view.setImage(image);
        view.setPreserveRatio(false);

        Image img = new Image("file:src/img/servoSWYFTTorque.png"); // te urasc swyft. dc n-am poze si trebuie sa ma complic >:[
        servo.setImage(img);
        Image img2 = new Image("file:src/img/armSwyft.png");
        arm.setImage(img2);
    }
}
