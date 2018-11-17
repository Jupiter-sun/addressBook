package top.redhood.www.addressbook;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import top.redhood.www.addressbook.factory.ConText;

public class AddressBookApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        String[] styles = {"/css/style.css","org/kordamp/bootstrapfx/bootstrapfx.css"};
        primaryStage = ConText.stageFactory.creatStage("address","/fxml/homePage.fxml",styles,440,930);
        primaryStage.getIcons().add(new Image("/img/ico.png"));

        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
