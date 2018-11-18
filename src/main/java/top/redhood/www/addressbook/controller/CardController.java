package top.redhood.www.addressbook.controller;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import top.redhood.www.addressbook.bean.StudentMsg;

public class CardController extends RootController {

    public Label name;
    public ImageView photo;
    public Label phoneNum;
    public ImageView phoneIcon;
    public Label sex;
    public Label address;

    public void createCard(StudentMsg studentMsg) {
        name.setText(studentMsg.getName());
        phoneNum.setText("电话：" + studentMsg.getPhoneNum().replaceAll("(\\d{3})(\\d{4})(\\d{3})", "$1****$3"));
        sex.setText("性别：" + studentMsg.getSex());
        address.setText("地址：" + studentMsg.getAddress());

        photo.setImage(new Image("/img/" + studentMsg.getPicUrl()));
        phoneIcon.setImage(new Image("/img/phoneIcon.png"));
    }
}
