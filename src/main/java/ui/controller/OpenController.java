package ui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class OpenController extends BaseController {

    @FXML
    Button exit_button;

    public void exit(){
        System.exit(0);
    }

    public void toLoginPage(){
        openFXMl("fxml/login.fxml");
    }
}
