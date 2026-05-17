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
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import com.example.servotester.DurationThing;
import javafx.util.Duration;
import static com.example.servotester.DurationThing.setDuration;
import static com.example.servotester.DurationThing.setDuration2;

public class Controller35 implements Initializable{
    @FXML
    private Button back= new Button();
    @FXML
    private ImageView view= new ImageView();
    @FXML
    private ImageView servo= new ImageView();
    @FXML
    private ImageView arm= new ImageView();
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

    double angle=0;



    @FXML
    protected void onR(){
        RotateTransition rotate= new RotateTransition();
        rotate.setNode(arm);
        angle=135;
        rotate.setDuration(Duration.seconds(setDuration(angle)));
        rotate.setToAngle(angle);
        rotate.play();
    }

    @FXML
    protected void onP(){
        RotateTransition rotate= new RotateTransition();
        rotate.setNode(arm);
        angle=0;
        rotate.setDuration(Duration.seconds(setDuration2(angle, 1.35)));
        rotate.setToAngle(angle);
        rotate.play();
    }

    @FXML
    protected void onL(){
        RotateTransition rotate= new RotateTransition();
        rotate.setNode(arm);
        angle=-135;
        rotate.setDuration(Duration.seconds(setDuration(angle)));
        rotate.setToAngle(angle);
        rotate.play();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image image= new Image("file:src/img/thirty.png");
        view.setImage(image);
        view.setPreserveRatio(false);

        Image img= new Image("file:src/img/servo.png");
        servo.setImage(img);
        Image img2= new Image("file:src/img/incercarea4.png");
        arm.setImage(img2);
    }
}
