package com.example.atry;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Main2Activity extends AppCompatActivity {
    TextView a,t;
    Button b;
    Main3Activity man = new Main3Activity();
    Button b1,b2,b3,b4,b5,b6;
    FirebaseDatabase Database = FirebaseDatabase.getInstance();
    DatabaseReference myref = Database.getReference("tryfirebaseproject-c7bb4");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
        a=(TextView)findViewById(R.id.tv);
        t=(TextView)findViewById(R.id.cn);
        b=(Button)findViewById(R.id.but);
        Bundle bundle = getIntent().getExtras();
        String s2 = bundle.getString("s1");
        myref = FirebaseDatabase.getInstance().getReference().child(s2);
        t.setText(s2);
        a.setMovementMethod(new ScrollingMovementMethod());
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        String s1 = dataSnapshot.child("type").getValue().toString();
                        a.setText("Type: "+s1+"\n\n");
                        String s3=dataSnapshot.child("founded").getValue().toString();
                        a.setText(a.getText()+"Founded: "+s3+"\n\n");
                        String s2=dataSnapshot.child("founder").getValue().toString();
                        a.setText(a.getText()+"Founder: "+s2+"\n\n");
                        String s4=dataSnapshot.child("head").getValue().toString();
                        a.setText(a.getText()+"Headquarters: "+s4+"\n\n");
                        String s5=dataSnapshot.child("industry").getValue().toString();
                        a.setText(a.getText()+"Industry: "+s5+"\n\n");
                        String s8=dataSnapshot.child("area").getValue().toString();
                        a.setText(a.getText()+"Area Served: "+s8+"\n\n");
                        String s6=dataSnapshot.child("emp").getValue().toString();
                        a.setText(a.getText()+"Employee count: "+s6+"\n\n");
                        String s7=dataSnapshot.child("web").getValue().toString();
                        a.setText(a.getText()+"Web: "+s7);

                  }
                  @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });

    }
}
