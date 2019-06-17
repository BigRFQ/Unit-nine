package com.example.unitnine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //测试WebView功能
        Button next_WebView = findViewById(R.id.next_WebView);
        next_WebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,WebViewTest.class);
                startActivity(intent);

            }
        });
        //NetWork测试
        Button next_NetWork = findViewById(R.id.next_NetWorkTest);
        next_NetWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NetworkTest.class);
                startActivity(intent);

            }
        });

    }


}
