package com.example.crunchthat;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class IndianFoodActivity extends Activity {
	
	Button veg,nonveg;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_indian_food);
		veg=(Button) findViewById(R.id.button1);
		nonveg=(Button) findViewById(R.id.button2);
		veg.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(IndianFoodActivity.this,IndianVegActivity.class);
				startActivity(i);
				
			}
		});
		nonveg.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(IndianFoodActivity.this,IndianNonVegActivity.class);
				startActivity(i);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.indian_food, menu);
		return true;
	}

}
