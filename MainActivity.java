package com.example.new_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;
    String[] days = {"sunday", "monday", "tuesday", "wednesday", "thus", "friday", "saturday"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,days);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                Toast.makeText(getApplicationContext(), "sunday is selected", Toast.LENGTH_LONG).show();
            case 1:
                Toast.makeText(getApplicationContext(), "monday is selected", Toast.LENGTH_LONG).show();
            case 2:
                Toast.makeText(getApplicationContext(), "tuesday is selected", Toast.LENGTH_LONG).show();
            case 3:
                Toast.makeText(getApplicationContext(), "wed is selected", Toast.LENGTH_LONG).show();
            case 4:
                Toast.makeText(getApplicationContext(), "thus is selected", Toast.LENGTH_LONG).show();
            case 5:
                Toast.makeText(getApplicationContext(), "fri is selected", Toast.LENGTH_LONG).show();
            case 6:
                Toast.makeText(getApplicationContext(), "sat is selected", Toast.LENGTH_LONG).show();
            default:
                Toast.makeText(getApplicationContext(), "please selected", Toast.LENGTH_LONG).show();
        }
    }
}
