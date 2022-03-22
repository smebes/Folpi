package smebes.folpi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    View game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showStartButton();


        game = new Game(this, getWindowManager().getDefaultDisplay().getHeight(), getWindowManager().getDefaultDisplay().getHeight());
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                setContentView(game);
            }
        },100);

    }

    private void showStartButton(){
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().findViewById(android.R.id.content).requestLayout();
    }



}