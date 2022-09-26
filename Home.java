package com.example.firstproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    Button btnProfile, btnListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnProfile= (Button) findViewById(R.id.profile);
        btnListView= (Button) findViewById(R.id.listViewHome);

        btnProfile.setOnClickListener((view ->{
            Intent intent = new Intent(Home.this, Profile.class);
            startActivity(intent);
        } ));

        btnListView.setOnClickListener((view ->{
            Intent intent = new Intent(Home.this, list_view.class);
            startActivity(intent);
        } ));
        Log.d("AAA", "onCreate main");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("AAA", "onStart main");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("AAA", "onRestart main");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("AAA", "onResume main");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("AAA", "onPause main");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("AAA", "onStop main");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("AAA", "onDestroy main");
    }

}
