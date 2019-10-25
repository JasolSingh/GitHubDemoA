package com.jasolsingh.githubdemo;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        showToast();
    }


    private void showToast() {
        Toast.makeText(this, "MainActivity2 and BranchA", Toast.LENGTH_SHORT).show();
    }
}
