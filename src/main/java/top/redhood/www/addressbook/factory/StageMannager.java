package top.redhood.www.addressbook.factory;

import javafx.stage.Stage;

public class StageMannager {

    public void addStage(String key,Stage stage){
        ConText.stageHashMap.put(key,stage);
    }

    public Stage getStage(String key){
        return ConText.stageHashMap.get(key);
    }

    public void deleteStage(String key){
        ConText.stageHashMap.remove(key);
    }
}
