package com.example.crunchthat;

import android.provider.BaseColumns;

public class Table {
	
	public Table()
	{
		
	}
	public static abstract class UserInfo implements BaseColumns
	{
		public static final String EMAIL_ID="emailid";
		public static final String USER_PASS="pass";
		public static final String USER_NAME="name";
		public static final String USER_CONTACT="contact";
		public static final String USER_ADDRESS="address";
		public static final String USER_CITY="city";
		public static final String DATABASE_NAME="crunchthat.db";
		public static final String TABLE_NAME="customer";
	}
	
	public static abstract class Category implements BaseColumns
	{
		public static final String CAT_ID="catid";
		public static final String CAT_NAME="catname";
		public static final String DATABASE_NAME="crunchthat.db";
	    public static final String TABLE_NAME="category";
	}
	public static abstract class Food implements BaseColumns
	{
		public static final String FOOD_ID="foodid";
		public static final String CAT_ID="catid";
		public static final String FOOD_NAME="foodname";
		public static final String RATE="rate";
		public static final String DATABASE_NAME="crunchthat.db";
		public static final String TABLE_NAME="food";
	}
		
	public static abstract class Book implements BaseColumns
	{
		public static final String BOOK_ID="bookid";
		public static final String EMAIL_ID="emailid";
		public static final String FITEM1="fitem1";
		public static final String FITEM2="fitem2";
		public static final String FITEM3="fitem3";
		public static final String FITEM4="fitem4";
		public static final String FOOD_DATE="food_date";
		public static final String DATABASE_NAME="crunchthat.db";
		public static final String TABLE_NAME="book";
	}
	
	public static abstract class Payment implements BaseColumns
	{
		public static final String EMAIL_ID="emailid";
		public static final String TOTAL="total";
		public static final String COD="cod";
		public static final String PAID="paid";
		
		public static final String DATABASE_NAME="crunchthat.db";
		public static final String TABLE_NAME="payment";
	}

}