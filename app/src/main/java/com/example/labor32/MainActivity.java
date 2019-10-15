package com.example.labor32;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText newHobbyTxt;
    Button addHobbyBtn;
    Button viewHobbiesBtn;
    User user;
    public DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newHobbyTxt=findViewById(R.id.hobbyInputTxt);
        addHobbyBtn=findViewById(R.id.addHobbyBtn);
        viewHobbiesBtn=findViewById(R.id.viewHobbiesBtn);
        user=new User();
        db=new DatabaseHelper(this);

        addHobbyBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                user.addHobby(newHobbyTxt.getText().toString());
                db.insertNote(newHobbyTxt.getText().toString());
            }
        });

        viewHobbiesBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity();
            }
        });

    }

    public void openActivity(){
        Intent intent=new Intent(this, ViewHobbiesActivity.class);
        startActivity(intent);
    }
}
