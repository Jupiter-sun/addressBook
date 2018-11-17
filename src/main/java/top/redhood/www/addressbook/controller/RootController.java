package top.redhood.www.addressbook.controller;

import top.redhood.www.addressbook.factory.ConText;

import java.util.Random;

public class RootController {
//自动初始化Controller的时候把自身引用放入静态空间，方便取用和互相传递数据。
    public RootController(){
        ConText.controllerHashMap.put(this.getClass().getSimpleName(),this);
    }


}
