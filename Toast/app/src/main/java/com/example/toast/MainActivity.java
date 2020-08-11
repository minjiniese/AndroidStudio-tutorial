package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void btn1Method(View view){
        //토스트 객체를 생성한다
        Toast t1 = Toast.makeText(this,"토스트 메시지 입니다",Toast.LENGTH_SHORT);
        //토스트 메시지를 운영체제에게 요청한다.
        t1.show();
    }
}