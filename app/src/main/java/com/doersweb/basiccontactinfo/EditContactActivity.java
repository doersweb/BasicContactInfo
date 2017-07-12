package com.doersweb.basiccontactinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditContactActivity extends AppCompatActivity {


    EditText name, email, phone;
    Button updateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_contact);

        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        phone = (EditText) findViewById(R.id.phone);

        updateButton = (Button) findViewById(R.id.updateContact);
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = name.getText().toString().trim();
                String e = email.getText().toString().trim();
                String p = phone.getText().toString().trim();

                if(n.length() >0 && e.length()>0 && p.length()>0){
                    Intent intent = new Intent(EditContactActivity.this, MainActivity.class);
                    intent.putExtra("name",n);
                    intent.putExtra("email", e);
                    intent.putExtra("phone",p);
                    startActivity(intent);
                }

            }
        });

    }
}
