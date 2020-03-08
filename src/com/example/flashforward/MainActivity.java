package com.example.flashforward;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

@SuppressLint("NewApi")
public class MainActivity extends FragmentActivity {
	Button flash_button;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);
	    flash_button = (Button) findViewById(R.id.startFlash);
	    flash_button.setOnClickListener(flash_handler);
//	    TextView textView = (TextView) findViewById(R.id.datetime);
//	    textView.setTextSize(40);
//	    textView.setText("hello world");
	}
	  
	View.OnClickListener flash_handler = new View.OnClickListener() {
	    public void onClick(View v) {
        	Intent intent = new Intent(getApplicationContext(), PhotoIntentActivity.class);
        	startActivity(intent);
        }
	};
	  
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }
    
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.action_camera:
	        	Intent cam_intent = new Intent(this, PhotoIntentActivity.class);
	        	startActivity(cam_intent);  
	            return true;
	        case R.id.action_settings:
	        	Intent pref_intent = new Intent(this, SettingsActivity.class);
	        	startActivity(pref_intent);  
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}    
}
