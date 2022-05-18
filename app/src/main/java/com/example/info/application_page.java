package com.example.info;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class application_page extends Activity {
    Button applicationBtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.application_page);

        Intent intent=getIntent();
        EditText deviceName=(EditText) findViewById(R.id.deviceName);

        deviceName.setText(intent.getStringExtra("이름"));

        applicationBtn=(Button) findViewById(R.id.applicationBtn);

        applicationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),application_status.class);
                startActivity(intent);
            }
        });

    }
}
