package com.example.uts_owen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    public void onClick(View view) {
        // TODO Auto-generated method stub
        Intent pindah = new Intent(DetailActivity.this, MainActivity.class);
        startActivity(pindah);
        //menghubungkan antar activity dengan intent
    }


    String name;
    TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        name = intent.getStringExtra("nama");
        txtName = findViewById(R.id.textViewName);
        txtName.setText(name);
    }

}
