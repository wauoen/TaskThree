package com.wauoen.taskthree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class TaskThreeActivity1 extends AppCompatActivity {

    private static String TAG = "TaskThreeActivity1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        ((TextView)findViewById(R.id.activityName)).setText(TAG);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.launchActivity(TaskThreeActivity1.this,TaskThreeActivity2.class);
            }
        });
    }


}
