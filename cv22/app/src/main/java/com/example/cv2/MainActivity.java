package com.example.cv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name = findViewById(R.id.name);
        final EditText age = findViewById(R.id.age);
        final EditText job = findViewById(R.id.job);
        final EditText phone = findViewById(R.id.phone);
        final EditText email = findViewById(R.id.email);
        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent a = new Intent(MainActivity.this,MainActivity2.class);
                a.putExtra("his name",name.getText().toString());
                a.putExtra("his age",age.getText().toString());
                a.putExtra("his job",job.getText().toString());
                a.putExtra("his phone",phone.getText().toString());
                a.putExtra("his email",email.getText().toString());
                startActivity(a);

            }
        });
    }

}