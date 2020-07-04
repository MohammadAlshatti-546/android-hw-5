package com.example.cv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView Name = findViewById(R.id.Name);
        TextView Age = findViewById(R.id.Age);
        TextView Job = findViewById(R.id.Job);
        TextView Phone = findViewById(R.id.Phone);
        TextView Email = findViewById(R.id.Email);

        Bundle info =getIntent().getExtras();

        info.getString("his age");
        info.getString("his job");
        info.getString("his phone");
        info.getString("his email");
        String name = info.getString("his name");
        String age = info.getString("his age");
        String job = info.getString("his job");
        String phone = info.getString("his phone");
        String mail = info.getString("his email");
        Name.setText(name);
        Age.setText(age);
        Job.setText(job);
        Phone.setText(phone);
        Email.setText(mail);






    }
}