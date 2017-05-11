package com.mobileappscompany.training.ninterac2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText eT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eT = (EditText) findViewById(R.id.editText);

    }

    public void onSomething(View view) {

        String s = eT.getText().toString();

        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("K", s);

        startActivityForResult(i,747);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 747){
            if( resultCode == RESULT_OK){
                String s = data.getStringExtra("K2");
                eT.setText(s);
            }
        }

    }
}
