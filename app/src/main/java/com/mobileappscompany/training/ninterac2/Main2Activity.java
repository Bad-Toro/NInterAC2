package com.mobileappscompany.training.ninterac2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText eT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        eT = (EditText) findViewById(R.id.editText);

        Intent i = getIntent();

        String s = i.getStringExtra("K");
        eT.setText(s);

    }

    public void onSomething(View view) {

        String s = eT.getText().toString();
        Intent i = new Intent();
        i.putExtra("K2", s);
        setResult(RESULT_OK, i);
        finish();

    }
}
