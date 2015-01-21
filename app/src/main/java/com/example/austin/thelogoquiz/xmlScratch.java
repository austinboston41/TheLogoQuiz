package com.example.austin.thelogoquiz;

import android.app.Activity;


import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class xmlScratch extends Activity {

    Button butSubmit;
    int i=0;
    TextView tvText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scratch_xml);
        tvText = (TextView) findViewById(R.id.textView);
        butSubmit = (Button) findViewById(R.id.button);
        butSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Resources res = getResources();
                    String[] arsScratch = res.getStringArray(R.array.Scratch);
                    tvText.setText(arsScratch[i]);
                    i++;
                }



        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
