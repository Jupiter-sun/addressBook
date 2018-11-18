package top.redhood.www.addressbook.controller;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import top.redhood.www.addressbook.bean.StudentMsg;
import top.redhood.www.addressbook.data.STUDENT_DATA;
import top.redhood.www.addressbook.factory.ConText;

import java.io.IOException;

public class CardController extends RootController {

    public Label name;
    public ImageView photo;
    public Label phoneNum;
    public ImageView phoneIcon;
    public Label sex;
    public Label address;

    private StudentMsg studentMsg;

    public void createCard(StudentMsg studentMsg) {
        name.setText(studentMsg.getName());
        phoneNum.setText("电话：" + studentMsg.getPhoneNum().replaceAll("(\\d{3})(\\d{4})(\\d{3})", "$1****$3"));
        sex.setText("性别：" + studentMsg.getSex());
        address.setText("地址：" + studentMsg.getAddress());

        photo.setImage(new Image("/img/" + studentMsg.getPicUrl()));
        phoneIcon.setImage(new Image("/img/phoIcon.png"));
    }

    public void tomsgPage() throws IOException {

        String[] styles = {"/css/style.css","org/kordamp/bootstrapfx/bootstrapfx.css"};
        Stage stage = ConText.stageFactory.creatStage("msg","/fxml/msgPage.fxml",styles,440,930);
        stage.getIcons().add(new Image("/img/msgPage.png"));
        stage.show();


        StudentMsg studentMsg = appModel.searchByName(STUDENT_DATA.StudentMsgarray,name.getText());
        //System.out.println("----"+studentMsg);
        MsgPageController msgPageController = (MsgPageController)ConText.controllerHashMap.get(MsgPageController.class.getSimpleName());
        msgPageController.initialMsgPage(studentMsg);

    }
}
