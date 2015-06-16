package com.blakestiller.empublite;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends ActionBarActivity {

    private Button button;
    private EditText edittext;
    private String TextVisible = "no";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button1);
        edittext = (EditText) findViewById(R.id.editText);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if(TextVisible == "no") {
                    TextVisible = "yes";
                    edittext.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(),
                            "EditText is VISIBLE Now", Toast.LENGTH_LONG).show();
                } else {
                    TextVisible = "no";
                    edittext.setVisibility(View.INVISIBLE);
                    Toast.makeText(getApplicationContext(),
                            "EditText is INVISIBLE Now", Toast.LENGTH_SHORT).show();
                } // End IF
            } // End onClick
        }); // End onClickListener
    } // End onCreate

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
