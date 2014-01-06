package com.Episteme.episteme_proj1_davidc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity 
{
	private Button buttonSend;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
	}
	
	private void init()
	{
		buttonSend = (Button) findViewById(R.id.button_send);
		buttonSend.setOnClickListener(new buttonSendOnClickListener());
	}
	
	private class buttonSendOnClickListener implements OnClickListener
	{
		@Override
		public void onClick(View arg0) 
		{
			Intent intent = new Intent(MainActivity.this, SecondActivity.class);
			startActivity(intent);
		}
	}
}
