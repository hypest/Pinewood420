package org.hypest.pinewood420;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView countView = (TextView) findViewById(R.id.textView);

        final Button countUp = (Button) findViewById(R.id.button);
        countUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = count + 1;
                countView.setText("Count: " + count);
            }
        });
    }
}
