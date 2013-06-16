package com.korovyansk.android.sample.slideout;



import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database {

	private String ROW_NO = "SNO";
	private String NAME = "NAME";
	private String LOCATION = "LOCATION";
	private String TIME = "TIME";
	private String DESCRIPTION = "DESCRIPTION";
	private String PRIZE = "PRIZE";

	private String DATABASE_NAME = "EVENTS";
	private String DATABASE_TABLE = "LIST";
	private int DATABASE_VERSION = 1;

	private DbHelper ourHelper;
	private final Context ourContext;
	private SQLiteDatabase ourDatabase;

	class DbHelper extends SQLiteOpenHelper {

		public DbHelper(Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			db.execSQL("CREATE TABLE " + DATABASE_TABLE + " (" + ROW_NO
					+ " INTEGER PRIMARY KEY, " + NAME + " TEXT, "
					+ LOCATION + " TEXT, " + TIME + " TEXT, "
					+ DESCRIPTION + " TEXT, " + PRIZE + " TEXT);");
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE);
			onCreate(db);

		}

		public void del(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			db.execSQL("DELETE FROM " + DATABASE_TABLE);
		}

	}

	public Database(Context C) {
		ourContext = C;

	}

	public void open() {
		ourHelper = new DbHelper(ourContext);
		ourDatabase = ourHelper.getWritableDatabase();

	}

	public void close() {
		ourHelper.close();
	}

	public void createentry(int rno, String NAM, String LOCATIO, String TIM,
			String DESCRIPTIO) {
		ContentValues cv = new ContentValues();
		cv.put(ROW_NO, rno);
		cv.put(NAME, NAM);
		cv.put(LOCATION, LOCATIO);
		cv.put(TIME, TIM);
		cv.put(DESCRIPTION, DESCRIPTIO);
//		cv.put(PRIZE,PRIZ);
		ourDatabase.insert(DATABASE_TABLE, null, cv);

	}

	
	public String getName(int val) {
		String[] columns = { ROW_NO, NAME,LOCATION,TIME,DESCRIPTION,PRIZE };
		String name = "";
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, ROW_NO + "="
				+ val, null, null, null, null);
		for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
			if (c != null)
				name = name + c.getString(c.getColumnIndex(NAME)) + "\n";
		}
		return name;
	}
	public String getLocation(int val) {
		String[] columns = { ROW_NO, NAME,LOCATION,TIME,DESCRIPTION,PRIZE };
		String name = "";
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, ROW_NO + "="
				+ val, null, null, null, null);
		for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
			if (c != null)
				name = name + c.getString(c.getColumnIndex(LOCATION)) + "\n";
		}
		return name;
	}
	public String getTime(int val) {
		String[] columns = { ROW_NO, NAME,LOCATION,TIME,DESCRIPTION,PRIZE };
		String name = "";
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, ROW_NO + "="
				+ val, null, null, null, null);
		for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
			if (c != null)
				name = name + c.getString(c.getColumnIndex(TIME)) + "\n";
		}
		return name;
	}
	public String getDesc(int val) {
		String[] columns = { ROW_NO, NAME,LOCATION,TIME,DESCRIPTION,PRIZE };
		String name = "";
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, ROW_NO + "="
				+ val, null, null, null, null);
		for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
			if (c != null)
				name = name + c.getString(c.getColumnIndex(DESCRIPTION)) + "\n";
		}
		return name;
	}
	public String getPRIZE(int val) {
		String[] columns = { ROW_NO, NAME,LOCATION,TIME,DESCRIPTION,PRIZE };
		String name = "";
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, ROW_NO + "="
				+ val, null, null, null, null);
		for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
			if (c != null)
				name = name + c.getString(c.getColumnIndex(PRIZE)) + "\n";
		}
		return name;
	}

	
}
