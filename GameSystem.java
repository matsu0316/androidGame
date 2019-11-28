package jp.atsu.matsu.rpggame;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GameSystem {
    List<Map.Entry<String,List<Integer>>> enemiesInfo=new ArrayList<>();
    private Lib lib=new Lib();
    GameSystem(){
        createEnemiesStatus();
    }
    boolean isEncounterEnemy(){
        return true;
    }
    void setGameDisplay(){

    }
    void getPlayerPosition(){

    }
    void setPlayerPosition(){

    }
    void setBattleDisplay(){

    }
    void movePlayer(){
        lib.getIndexPosition();
        lib.getNextIndexPosition();
    }
    private void createEnemiesStatus(){
        List<String> enemiesName=new ArrayList<>();
        List<List<Integer>> enemiesStatus;
        HashMap<String,List<Integer>> enemiesTmpInfo=new HashMap<>();
        enemiesStatus=Arrays.asList(Arrays.asList(8,2,10,7,7),Arrays.asList(10,2,12,9,10),Arrays.asList(10,2,12,9,10),Arrays.asList(15,0,13,8,8));
        for(int i=0;i<enemiesStatus.size();i++){
            enemiesName.add("敵"+i);
        }
        //Log.d("lis",enemiesName.get(0));
        for(int i=0;i<enemiesStatus.size();i++){
            enemiesTmpInfo.put(enemiesName.get(i),enemiesStatus.get(i));
        }
        enemiesInfo.addAll(enemiesTmpInfo.entrySet());
    }
}
