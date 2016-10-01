package com.example.madhukant.test_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_1);
    }
    public void onButtonClick(View v){

        EditText e1=(EditText)(findViewById(R.id.editText));
        EditText e2=(EditText)(findViewById(R.id.editText2));
        TextView t1=(EditText)(findViewById(R.id.textView2));

    }
}
