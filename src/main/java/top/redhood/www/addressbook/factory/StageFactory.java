package top.redhood.www.addressbook.factory;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StageFactory {

    public Stage creatStage(String title,String XmlName,String[] CssUrls,int width,int height) throws IOException {

        Parent root = FXMLLoader.load(StageFactory.class.getResource(XmlName));

        Scene scene = new Scene(root,width,height);
        scene.getStylesheets().addAll(CssUrls);

        Stage stage = new Stage();
        stage.setTitle(title);
        stage.setScene(scene);

        stage.setResizable(false);

        //将初始化过后的stage放入容器中方便管理
        ConText.stageMannager.addStage(XmlName.replaceAll("[a-z,A-Z,1-9]*/|.fxml",""),stage);

        return stage;
    }

}
