package ru.egorovasa.hellokitty;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        EditText userEditText = (EditText) findViewById(R.id.editTextUser);
        EditText giftEditText = (EditText) findViewById(R.id.editTextGift);
        EditText senderEditText = (EditText) findViewById(R.id.editSender);

        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        intent.putExtra("username", userEditText.getText().toString());
        intent.putExtra("gift", giftEditText.getText().toString());
        intent.putExtra("sender", senderEditText.getText().toString());
        startActivity(intent);
    }
}