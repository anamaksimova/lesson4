package song;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {
    @FXML
    public Slider volumeSlider;




    Media media = new Media( "file:///Users/anamaksimova/Desktop/java2/lesson4/src/media/sample.mp3");
    MediaPlayer mediaPlayer = new MediaPlayer(media);


    public void click(ActionEvent actionEvent) {

        mediaPlayer.play();

    }

    public void clickPause(ActionEvent actionEvent) {
        mediaPlayer.pause();
    }

    public void clickStop(ActionEvent actionEvent) {
        mediaPlayer.stop();
    }
    public void clickSound(ActionEvent actionEvent) {
        mediaPlayer.volumeProperty();
    }

    public void click3(MouseEvent mouseEvent) {
        volumeSlider.setValue(mediaPlayer.getVolume() *100);
        volumeSlider.valueProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                mediaPlayer.setVolume(volumeSlider.getValue()/100);
            }
        });
    }
}
