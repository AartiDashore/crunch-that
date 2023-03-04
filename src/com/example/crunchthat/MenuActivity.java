package com.example.crunchthat;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MenuActivity extends Activity {
	 Button indian,chinese,italian,coke;
	  

		

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        indian=(Button) findViewById(R.id.button1);
		chinese=(Button) findViewById(R.id.button2);
		italian=(Button) findViewById(R.id.button3);
		coke=(Button) findViewById(R.id.button4);
		
		indian.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(MenuActivity.this,IndianFoodActivity.class);
				startActivity(i);
				}
		});
		chinese.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(MenuActivity.this,ChineseActivity.class);
				startActivity(i);
			}
		});
		italian.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(MenuActivity.this,ItalianActivity.class);
				startActivity(i);
				
				
			}
		});
		coke.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(MenuActivity.this,CokeActivity.class);
				startActivity(i);
				
			}
		});

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    
}
