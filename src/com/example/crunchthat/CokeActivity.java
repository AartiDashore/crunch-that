package com.example.crunchthat;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;

public class CokeActivity extends Activity {
	Button b1,b2;
	CheckBox c1,c2;
	StringBuffer sb;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_coke);
		b1=(Button) findViewById(R.id.button2);
		b2=(Button) findViewById(R.id.button1);
		c1=(CheckBox) findViewById(R.id.checkBox1);
	    c2=(CheckBox) findViewById(R.id.checkBox2);
	 
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(CokeActivity.this,CrunchActivity.class);
				startActivity(i);
				
			}
		});
b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stud

				String data;
				sb=new StringBuffer();
				if(c1.isChecked()){
					data=c1.getText().toString();
					sb.append(data);
				}
				if(c2.isChecked()){
					data=c2.getText().toString();
					sb.append(data);
				}

		
	}
});
	}
}

