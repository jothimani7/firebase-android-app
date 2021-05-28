package com.example.atry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,fd,fr,h,a,em,w,i;
    Button b1,b2;
    DatabaseReference myref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.com);
        e2=(EditText)findViewById(R.id.type);
        fd=(EditText)findViewById(R.id.founded);
        fr=(EditText)findViewById(R.id.founder);
        h=(EditText)findViewById(R.id.head);
        i=(EditText)findViewById(R.id.industry);
        a=(EditText)findViewById(R.id.area);
        w=(EditText)findViewById(R.id.web);
        em=(EditText)findViewById(R.id.emp);
        b1=(Button)findViewById(R.id.click);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString();
                myref= FirebaseDatabase.getInstance().getReference(s1);
                String s2 = e2.getText().toString();
                String s3 = i.getText().toString();
                String s4 = fr.getText().toString();
                String s5 = fd.getText().toString();
                String s6 = h.getText().toString();
                String s7 = a.getText().toString();
                String s8 = em.getText().toString();
                String s9 = w.getText().toString();
                Details det=new Details(s2,s3,s4,s5,s6,s7,s8,s9);
                myref.setValue(det);
            }
        });
        b2=(Button)findViewById(R.id.view);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

    }
}
