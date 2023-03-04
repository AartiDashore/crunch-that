package com.example.crunchthat;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends Activity {
	EditText uid,pwd,name,contact,city;
    String ud,pw,nm,cn,ct;
    Button b,b1;
    Context c=this;
    
    
    
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign_up);
	
      uid= (EditText) findViewById(R.id.editText1);
        pwd= (EditText) findViewById(R.id.editText2);
        name= (EditText) findViewById(R.id.editText3);
        contact= (EditText) findViewById(R.id.editText4);
        city= (EditText) findViewById(R.id.editText5);
        b= (Button) findViewById(R.id.button1);
        b1= (Button) findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ud = uid.getText().toString();
                pw = pwd.getText().toString();
                nm = name.getText().toString();
                cn = contact.getText().toString();
                ct = city.getText().toString();
                if (ud.equals("") || pw.equals("") || nm.equals("") || cn.equals("") || ct.equals(""))
                { Toast.makeText(getApplicationContext(), "enter all details", Toast.LENGTH_LONG).show();}
                else {
                    DataBase dq = new DataBase(c);
                    dq.putuserdata(dq, ud, pw, nm, cn, ct);
                    Toast.makeText(SignUpActivity.this, "sucessfull created", Toast.LENGTH_LONG).show();
                }
            }
            });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p=new Intent(SignUpActivity.this,CrunchActivity.class);
                startActivity(p);
            }
        });
}


	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sign_up, menu);
		return true;
	}

}
