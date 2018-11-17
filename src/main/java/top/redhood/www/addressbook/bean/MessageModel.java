package top.redhood.www.addressbook.bean;

import javafx.beans.property.*;

//测试property模块,功能是利用监听事件，来进行数据的传输
public class MessageModel {
    private StringProperty text = new SimpleStringProperty();
    private ObjectProperty<StudentMsg> studentMsgProperty = new SimpleObjectProperty<StudentMsg>();

    //构造函数，不知道意思
    public MessageModel()
    {
        this.studentMsgProperty = new SimpleObjectProperty<StudentMsg>();
    }

    //一些get，set方法,也没看明白写了啥意思
    public StringProperty textProperty() {
        return text;
    }
    public final String getText() {
        return textProperty().get();
    }
    public final void setText(String text) {
        textProperty().set(text);
    }

    public ObjectProperty<StudentMsg>  StuProperty() {
        return studentMsgProperty;
    }
    public StudentMsg getStudentMsg(){ return  StuProperty().get();}
    public  void setStudentMsg(StudentMsg msg) {
        StuProperty().set(msg);
    }
}
