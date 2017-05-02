package com.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by cdot on 2/5/17.
 */

public class ThreadSample  extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.threaddemo);
        tv = (TextView)findViewById(R.id.text1);
        insideThread();
        tv.setText("DONE");
    }
    private void insideThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(long i = 0;i<100000;i++){
                    Log.d("Hello...","The value of i is " + i);
                }
                    /* runOnUiThread(new Runnable(){
                    @Override
                    public void run() {
                        tv.setText("DONE");
                    }

                     });*/

            }
        }).start();
    }
}
