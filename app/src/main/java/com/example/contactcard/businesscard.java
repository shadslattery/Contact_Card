package com.example.contactcard;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class businesscard extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //res/layout/activity_main = R.layout.activity_main
        setContentView(R.layout.new_cardlayout);

    }
}