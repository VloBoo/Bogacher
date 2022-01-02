package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    int a = 0;

    public Button button_num;
    public Button button500;
    public Button button_Start;



    @FXML
    void Action_Button_1(){
        button_Start.setLayoutX(10000);
        button_Start.setLayoutY(10000);

    }
    @FXML
    void Action_Button_2(){


        button500.setLayoutX(Math.random()*(275-75));
        button500.setLayoutY(Math.random()*(275-25));
    }
    @FXML
    void Action_Button_3(){
        button500.setLayoutX(Math.random()*(275-75));
        button500.setLayoutY(Math.random()*(275-25));
        a = a + 500;
        button_num.setText(a+"$");
    }



}
