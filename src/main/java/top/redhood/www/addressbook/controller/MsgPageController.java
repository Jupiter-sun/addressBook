package top.redhood.www.addressbook.controller;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import top.redhood.www.addressbook.bean.StudentMsg;
import top.redhood.www.addressbook.factory.ConText;

import java.io.IOException;

public class MsgPageController extends RootController{

    public ImageView Photo4msgPage;
    public Label name4Msg;
    public Label sex4Msg;
    public Label phone4Msg;
    public Label address4Msg;
    public Label class4Msg;
    public Label doorNum;

    public void initialMsgPage(StudentMsg msg) throws IOException {
        Photo4msgPage.setImage(new Image("/img/"+msg.getPicUrl()));

        name4Msg.setText(msg.getName());
        sex4Msg.setText("性别：" + msg.getSex());
        phone4Msg.setText("电话：" + msg.getPhoneNum());
        address4Msg.setText("地址：" + msg.getAddress());
        class4Msg.setText("班级：" +msg.getClassID());
        doorNum.setText("宿舍：" +msg.getDormitory());

    }
}
