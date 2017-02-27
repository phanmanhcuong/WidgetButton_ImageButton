package com.example.cuongphan.widgetbutton_imagebutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);
    }

    public void changeTextViewColor(int color){
        TextView mTextView = (TextView)findViewById(R.id.textview);
        mTextView.setBackgroundColor(color);
    }

    public void changeTextViewColorRed(View clickedButton){
        changeTextViewColor(Color.RED);
    }

    public void changeTextViewColorBlue(View clickedButton){
        changeTextViewColor(Color.BLUE);
    }
}
