package com.example.crunchthat;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CrunchActivity extends Activity {
	protected static final int REQUEST_CODE_ACTIVITYONE = 100;
	EditText uid,pass;
	Button si,su;
	String msg1;
	String display,userId,password;
	Context c= this;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_crunch);
		uid=(EditText) findViewById(R.id.editText1);
		pass=(EditText) findViewById(R.id.editText2);
		si=(Button) findViewById(R.id.button1);
		su=(Button) findViewById(R.id.button2);
		
		su.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				//Toast.makeText(getApplicationContext(), "Hello Khoosbaarti", Toast.LENGTH_LONG).show();
				Intent i=new Intent(CrunchActivity.this,SignUpActivity.class);
				startActivity(i);
		}
		});
		si.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				userId=uid.getText().toString();
				password=pass.getText().toString();
				
				if(userId.equals("") || password.equals("")){
					msg1="Username or password not entered";
					Toast.makeText(CrunchActivity.this, msg1, Toast.LENGTH_LONG).show();
				}
				else{
					msg1="Login Successfull";
					
					String nm="";
					DataBase dq = new DataBase(c);
					Cursor c1 = dq.Login_verify(dq);
					boolean stat=false;
					c1.moveToFirst();
					do{
						if(userId.equals(c1.getString(0)) && password.equals(c1.getString(1)))
						{
							stat=true;
						}
					}while(c1.moveToNext());
					
					if(stat)
					{
						Toast.makeText(getApplicationContext(), msg1, Toast.LENGTH_LONG).show();
						Intent i1 = new Intent(CrunchActivity.this,MenuActivity.class);
						startActivity(i1);
						finish();
					}
					else{
						Toast.makeText(getApplicationContext(), "Invalid userid or password", Toast.LENGTH_LONG).show();
					}
				}
		    }
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.crunch, menu);
		return true;
	}

}
