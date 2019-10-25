package com.jasolsingh.githubdemo;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.jasolsingh.githubdemo.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
        //*****************************************
        Toast.makeText(this, "BranchA", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "BranchA Toast 2", Toast.LENGTH_SHORT).show();
    }
}
