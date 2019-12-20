package com.topic7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.PrintStream;

public class AddWordActivity extends AppCompatActivity {

    EditText etTitle, etDefine;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_word);

        etTitle=findViewById(R.id.etTitle);
        etDefine=findViewById(R.id.etDefine);
        btnSave=findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
            }

            private void save() {
                try{
                    PrintStream printStream = new PrintStream()
                }
            }
        });
    }
}
