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

    private Button button; // Create button Variable of type Button
    private EditText edittext; // Create edittext Variable of type EditText
    private String TextVisible = "no"; // Create TextVisible Variable of type String


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Access the Button by it's ID button1
        button = (Button) findViewById(R.id.button1);
        // Access the EditText by it;s ID ediText
        edittext = (EditText) findViewById(R.id.editText);
        // Setup the button OnClick Listener
        button.setOnClickListener(new OnClickListener() {

            @Override
            // Create public method onClick Handler
            public void onClick(View arg0) {
                // The EditText is INVISIBLE to start with
                // the "visibility" attribute in the properties of "ediText"
                // is set INVISIBLE
                if(TextVisible == "no") {
                    // Set TextVisible Variable to "yes"
                    TextVisible = "yes";
                    // Set VISIBILTY to VISIBLE
                    edittext.setVisibility(View.VISIBLE);
                    // Create and show TOAST Message
                    // to tell the user that it is VISIBLE now
                    Toast.makeText(getApplicationContext(),
                            "EditText is VISIBLE Now", Toast.LENGTH_LONG).show();
                } else {
                    // Set TextVisible Variable to "no"
                    TextVisible = "no";
                    // Set VISIBILTY to INVISIBLE
                    edittext.setVisibility(View.INVISIBLE);
                    // Create and show TOAST Message
                    // to tell the user that it is VISIBLE now
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
