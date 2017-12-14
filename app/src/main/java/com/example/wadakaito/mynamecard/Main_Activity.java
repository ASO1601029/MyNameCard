package com.example.wadakaito.mynamecard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Main_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickButton(View view){
        TextView text = (TextView)findViewById(R.id.name);
        text.setText("キリン");
    }
}
