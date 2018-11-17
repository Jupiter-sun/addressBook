package top.redhood.www.addressbook.bean;

public class StudentMsg {
    private String name;
    private int age;
    private String sex;
    private int num;//学号
    private String phoneNum;
    private String dormitory;
    private String classID;
    private String address;
    private String picUrl;

    public StudentMsg() { }

    public StudentMsg(String name, int age, String sex, int num, String phoneNum, String dormitory, String classID, String address, String picUrl) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.num = num;
        this.phoneNum = phoneNum;
        this.dormitory = dormitory;
        this.classID = classID;
        this.address = address;
        this.picUrl = picUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getDormitory() {
        return dormitory;
    }

    public void setDormitory(String dormitory) {
        this.dormitory = dormitory;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    @Override
    public String toString() {
        return "StudentMsg{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", num=" + num +
                ", phoneNum='" + phoneNum + '\'' +
                ", dormitory='" + dormitory + '\'' +
                ", classID='" + classID + '\'' +
                ", address='" + address + '\'' +
                ", picUrl='" + picUrl + '\'' +
                '}';
    }
}
