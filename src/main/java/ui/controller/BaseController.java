package ui.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public abstract class BaseController {

    @FXML
    private AnchorPane rootPane;

    protected void openFXMl(String file){
        try {
            rootPane.getChildren()
                    .setAll((Parent) FXMLLoader
                            .load(getClass()
                                    .getClassLoader()
                                    .getResource("fxml/"+file))); }

        catch(IOException e){
            e.printStackTrace();
            System.out.println("Cannot open page "+file);
        }
    }

}
