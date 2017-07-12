package com.doersweb.basiccontactinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView name, email, phone;
    Button editButon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (TextView) findViewById(R.id.name);
        email = (TextView) findViewById(R.id.email);
        phone = (TextView) findViewById(R.id.phone);

        editButon = (Button) findViewById(R.id.editContact);

        if(getIntent()!=null){
            name.setText(getIntent().getStringExtra("name"));
            email.setText(getIntent().getStringExtra("email"));
            phone.setText(getIntent().getStringExtra("phone"));
        }

        editButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EditContactActivity.class);
                startActivity(intent);
            }
        });


    }
}
