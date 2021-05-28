package com.example.atry;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class Main3Activity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;
    String s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1);
        b1=(Button)findViewById(R.id.gl);
        b2=(Button)findViewById(R.id.ms);
        b3=(Button)findViewById(R.id.fb);
        b4=(Button)findViewById(R.id.zh);
        b5=(Button)findViewById(R.id.cg);
        b6=(Button)findViewById(R.id.in);
        b7=(Button)findViewById(R.id.wip);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = b1.getText().toString();
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("s1",s1);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = b2.getText().toString();
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("s1",s1);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = b3.getText().toString();
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("s1",s1);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = b4.getText().toString();
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("s1",s1);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = b5.getText().toString();
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("s1",s1);
                startActivity(intent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = b6.getText().toString();
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("s1",s1);
                startActivity(intent);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = b7.getText().toString();
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("s1",s1);
                startActivity(intent);
            }
        });
    }
}
