package ui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginController extends BaseController {

    @FXML
    TabPane tabPane;
    @FXML
    Button login_sp_button, login_sc_button, exit_button;
    @FXML
    TextField username_sp_text, username_sc_text;
    @FXML
    PasswordField password_sp_text, password_sc_text;
    @FXML
    Label login_sp_text, login_sc_text;

    public void exit(){
        System.exit(0);
    }

    public void loginSp(){
        if(username_sp_text.equals("spotify") && password_sp_text.getText().equals("password")){
            login_sp_text.setText("You have logged in to spotify");
        } else{
            login_sp_text.setText("Wrong username/password");
        }
    }

    public void loginSc(){
        if(username_sc_text.equals("spotify") && password_sc_text.getText().equals("password")){
            login_sc_text.setText("You have logged in to soundcloud");
        } else{
            login_sc_text.setText("Wrong username/password");
        }
    }


}
