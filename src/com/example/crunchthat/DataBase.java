package com.example.crunchthat;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.crunchthat.Table.UserInfo;

public class DataBase extends SQLiteOpenHelper  {

	public static final int db_ver1=1;
	public String sql1="CREATE TABLE "+UserInfo.TABLE_NAME+"("+UserInfo.EMAIL_ID+" Text,"+UserInfo.USER_PASS+" Text,"+UserInfo.USER_NAME+" Text,"+UserInfo.USER_CONTACT+" Text,"+UserInfo.USER_ADDRESS+" Text,"+UserInfo.USER_CITY+" Text);";
	
	//public String sql="CREATE TABLE "+ManuInfo.TABLE_NAME+"("+ManuInfo.MANUFACTURER_ID+" Integer Primary Key Autoincrement,"+ManuInfo.MANUFACTURER+" Text);";
//	public String sql2="CREATE TABLE "+ModelInfo.TABLE_NAME+"("+ModelInfo.MANUFACTURER_ID+" Integer Primary Key Autoincrement,"+ManuInfo.MANUFACTURER+" Text,"+ModelInfo.MODEL+" Text,"+ModelInfo.MODEL_ID+" Text);";
	//public String sql3="CREATE TABLE "+SerInfo.TABLE_NAME+"("+SerInfo.SERVICE_ID+" Integer Primary Key Autoincrement,"+SerInfo.MODEL_ID+" Text,"+SerInfo.MODEL+" Text,"+SerInfo.SERVICE_NAME+" Text,"+SerInfo.DAYS_NEED+" Text,"+SerInfo.PRICE+" Text);";
	
	
	public DataBase(Context context) {
		super(context,UserInfo.DATABASE_NAME,null,db_ver1);
		Log.d("DataBase Operations","DataBase For User Created Successfully");
	}


	@Override
	public void onCreate(SQLiteDatabase sq) {
		sq.execSQL(sql1);
		Log.d("Database Operations","User Table created successfully");
		 	// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void putuserdata(DataBase dq, String uid, String uname, String pass, String city,String cno)
	{
		SQLiteDatabase sq=dq.getWritableDatabase();
		ContentValues cv=new ContentValues();
		
		
		cv.put(UserInfo.EMAIL_ID,uid);
		cv.put(UserInfo.USER_PASS,pass);
		cv.put(UserInfo.USER_NAME,uname);
		cv.put(UserInfo.USER_CONTACT,cno);
		cv.put(UserInfo.USER_CITY,city);
	
		long k=sq.insert(UserInfo.TABLE_NAME,null,cv);//data is inserted using insert long type of data is returned and captured in k variable
		Log.d("Database Operations","One Row Inserted Successfully in product table ");//data is assigned using putdata
	}
	
	
	
	public Cursor Login_verify(DataBase dq)//call to match the data from database
	{
		SQLiteDatabase sq=dq.getReadableDatabase();
		String[] c = {UserInfo.EMAIL_ID,UserInfo.USER_PASS};
		Cursor cs = sq.query(UserInfo.TABLE_NAME,c,null,null,null,null,null,null);//used for fetching the records from database
		
		return cs;
	}

}