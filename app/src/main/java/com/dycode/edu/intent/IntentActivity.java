package com.dycode.edu.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentActivity extends AppCompatActivity {
    public static final String EXTRA_DATA = "EXTRA_DATA";

    private EditText editText;
    private Button btnSenData;
    private View button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        editText = findViewById(R.id.editText);
        btnSenData = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = editText.getText().toString();
                Intent intent = new Intent(IntentActivity.this, TargetActivity.class);
                intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });
    }
}