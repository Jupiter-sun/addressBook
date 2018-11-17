package top.redhood.www.addressbook.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import top.redhood.www.addressbook.bean.StudentMsg;
import top.redhood.www.addressbook.data.STUDENT_DATA;



import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HomeController extends RootController implements Initializable {

    public BorderPane homePage;
    public BorderPane ex_page;
    public ComboBox doorComboBox;
    public ComboBox sexComboBox;
    public Button homeButton;
    public TextField searchText;
    public Button serachButton;
    public ListView msgList;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        STUDENT_DATA.setMsg();
        doorComboBox.getItems().addAll("201#","202#","308#","309#");
        sexComboBox.getItems().addAll("男生","男生","不确定");

        ArrayList<BorderPane> list = new ArrayList<>();

        for (StudentMsg msg : STUDENT_DATA.StudentMsgarray){
            BorderPane msgPane = new BorderPane();
            Image image = new Image("/img/"+msg.getPicUrl());
            ImageView imageView  = new ImageView(image);
            msgPane.setLeft(imageView);

            list.add(msgPane);


            //msgList.getSelectionModel().setSelectionMode();
        }
        ObservableList<BorderPane> list2 = FXCollections.observableArrayList(list);
        msgList.setItems(list2);


        msgList.getCellFactory();
    }

}
