package com.example.labor32;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ViewHobbiesActivity extends AppCompatActivity {

    DatabaseHelper db;
    ListView listView;
    ArrayAdapter myAdapter;
    ArrayList<String> hobbies=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_hobbies);
        listView=findViewById(R.id.listView);

        db=new DatabaseHelper(this);

        writeNotes((ArrayList<Note>) db.getAllNotes());
    }

    public void writeNotes(ArrayList<Note> notes){
        for(int i=0; i<notes.size(); i++){
            hobbies.add(notes.get(i).getNote());
        }

        myAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_activated_1 ,hobbies);
        listView.setAdapter(myAdapter);
    }
}
