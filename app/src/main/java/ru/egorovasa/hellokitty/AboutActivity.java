package ru.egorovasa.hellokitty;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        String user, gift, sender;
        user = getIntent().getExtras().getString("username");
        gift = getIntent().getExtras().getString("gift");
        sender = getIntent().getExtras().getString("sender");
        TextView infoTextView = (TextView) findViewById(R.id.textView2);
        infoTextView.setText(user + ", вам передали " + gift + " " + sender);
    }
}