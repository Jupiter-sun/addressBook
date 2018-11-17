package top.redhood.www.addressbook.factory;

import javafx.stage.Stage;
import top.redhood.www.addressbook.controller.RootController;

import java.util.HashMap;

public class ConText {

    public static HashMap<String, Stage> stageHashMap = new HashMap<String, Stage>();

    public static StageMannager stageMannager = new StageMannager();
    public static StageFactory stageFactory = new StageFactory();


    public static HashMap<String, RootController> controllerHashMap = new HashMap<String, RootController>();

}
