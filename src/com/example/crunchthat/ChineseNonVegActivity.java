package com.example.crunchthat;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class ChineseNonVegActivity extends Activity {
	Button b1,b2;
	CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
	StringBuffer sb;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chinese_non_veg);
		b1=(Button) findViewById(R.id.button1);
		b2=(Button) findViewById(R.id.button2);
		 c1=(CheckBox) findViewById(R.id.checkBox1);
		    c2=(CheckBox) findViewById(R.id.checkBox2);
		    c3=(CheckBox) findViewById(R.id.checkBox3);
		    c4=(CheckBox) findViewById(R.id.checkBox4);
		    c5=(CheckBox) findViewById(R.id.checkBox5);
		    c6=(CheckBox) findViewById(R.id.checkBox6);
		    c7=(CheckBox) findViewById(R.id.checkBox7);
		    c8=(CheckBox) findViewById(R.id.checkBox8);
		    c9=(CheckBox) findViewById(R.id.checkBox9);
		    c10=(CheckBox) findViewById(R.id.checkBox10);
		    
		   
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(ChineseNonVegActivity.this,CrunchActivity.class);
				startActivity(i);
				
			}
		});
b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stu

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
				if(c3.isChecked()){
					data=c3.getText().toString();
					sb.append(data);
				}
				if(c4.isChecked()){
					data=c4.getText().toString();
					sb.append(data);
				}
				if(c5.isChecked()){
					data=c5.getText().toString();
					sb.append(data);
				}
				if(c6.isChecked()){
					data=c6.getText().toString();
					sb.append(data);
				}
				if(c7.isChecked()){
					data=c7.getText().toString();
					sb.append(data);
				}
				if(c8.isChecked()){
					data=c8.getText().toString();
					sb.append(data);
				}
				if(c9.isChecked()){
					data=c9.getText().toString();
					sb.append(data);
				}
				if(c10.isChecked()){
					data=c10.getText().toString();
					sb.append(data);
				}
				Toast.makeText(ChineseNonVegActivity.this,"You Selected: "+String.valueOf(sb)+"\n",Toast.LENGTH_LONG).show();
					//startActivity(i);
			}
		});

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.chinese_non_veg, menu);
		return true;
	}

}
