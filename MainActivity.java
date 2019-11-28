package jp.atsu.matsu.rpggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    GameSystem gameSystem=new GameSystem();
    BattleSystem battleSystem=new BattleSystem();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //encounterEnemy()はboolean値を返す
    public void encounterEnemy(){
        if(gameSystem.isEncounterEnemy()){
            //戦闘画面をセット
            gameSystem.setBattleDisplay();
            //戦闘開始
            battleSystem.runBattle();
        }
    }

    //スタートボタンをクリックしてゲームスタート
    public void onClickgameStart(View v){
        //ゲーム画面をセット
        gameSystem.setGameDisplay();
        //プレイヤーのポジションを取得しセット
        gameSystem.getPlayerPosition();
        gameSystem.setPlayerPosition();
        //プレイヤーを動かす
        gameSystem.movePlayer();
    }
}
