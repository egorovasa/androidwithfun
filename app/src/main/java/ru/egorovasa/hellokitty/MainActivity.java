package ru.egorovasa.hellokitty;

import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConstraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        mInfoTextView = (TextView) findViewById(R.id.textView);

        Button yellowButton = (Button) findViewById(R.id.buttonYellow);
        Button redButton = (Button) findViewById(R.id.buttonRed);
        Button greenButton = (Button) findViewById(R.id.buttonGreen);

        yellowButton.setOnClickListener(this);
        redButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);

       /* yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInfoTextView.setText(R.string.Yellow);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellowColor));
            }
        });*/
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonRed:
                mInfoTextView.setText((R.string.Red));
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));
                break;
            case R.id.buttonYellow:
                mInfoTextView.setText(R.string.Yellow);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor));
                break;
            case R.id.buttonGreen:
                mInfoTextView.setText(R.string.Green);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
                break;
        }
    }

/*    public void onRedButtonClick(View view) {
        mInfoTextView.setText(R.string.Red);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));
    }

    public void onGreenButtonClick(View view) {
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
        mInfoTextView.setText(R.string.Green);
    }*/

}
