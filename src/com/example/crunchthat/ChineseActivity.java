package com.example.crunchthat;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ChineseActivity extends Activity {
	Button cveg,cnonveg;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chinese);
		cveg=(Button) findViewById(R.id.button1);
		cnonveg=(Button) findViewById(R.id.button2);
		
		cveg.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(ChineseActivity.this,ChineseVegActivity.class);
				startActivity(i);
				
			}
		});
		cnonveg.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(ChineseActivity.this,ChineseNonVegActivity.class);
				startActivity(i);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.chinese, menu);
		return true;
	}

}
