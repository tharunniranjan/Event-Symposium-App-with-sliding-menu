package com.korovyansk.android.sample.slideout;

import java.util.ArrayList;
import java.util.List;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.korovyansk.android.slideout.SlideoutActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.util.TypedValue;

import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;


 
@SuppressLint("NewApi")
public class WorkshopActivity extends SherlockActivity implements
        OnItemClickListener {
 
    public static final String[] titles = new String[] { 
            "CYBER FORENSICS", "WINDOWS 8 APP DEVELOPMENT", "BIG DATA" };
 
    public static final String[] descriptions = new String[] {
    	"Learn to Scan,Test,Hack and Secure your own systems!","Windows 8. Millions Of People. Your App.", 
            "Learn how such data is handled and analyzed and why this technology has taken the world by storm." };
 
    public static final Integer[] images = {
            R.drawable.cbbot, R.drawable.win8, R.drawable.bdatathumb};
 
    ListView listView;
    List<RowItem> rowItems;
 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eventlist);
        getActionBar().setHomeButtonEnabled(true);
        getWindow().setFormat(PixelFormat.RGBA_8888);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_DITHER);
        rowItems = new ArrayList<RowItem>();
        for (int i = 0; i < titles.length; i++) {
            RowItem item = new RowItem(images[i], titles[i], descriptions[i]);
            rowItems.add(item);
        }
 
        listView = (ListView) findViewById(R.id.list);
        CustomListViewAdapter adapter = new CustomListViewAdapter(this,
                R.layout.list_item, rowItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }
 
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
            long id) {
      
    	switch(position){
    	case 0:
    		//bigdata -11;position + 11
    		Intent cb = new Intent(this,DatabaseAct.class);
    		cb.putExtra("PASS",12);
    		startActivity(cb);
    		break;
    	case 1:
    		Intent w8 = new Intent(this,DatabaseAct.class);
    		w8.putExtra("PASS",13);
    		startActivity(w8);
    		//cyber-12
    		break;
    	case 2:
    		//wind 13
    		Intent bd = new Intent(this,DatabaseAct.class);
    		bd.putExtra("PASS", 11);
    		startActivity(bd);
    		break;
    			
    	}
    }
	//For sliding drawer
    public boolean onOptionsItemSelected(MenuItem item) {
		if(item.getItemId() == android.R.id.home){
			
			int width = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 20, getResources().getDisplayMetrics());
			
			SlideoutActivity.prepare(this, R.id.eventlist,width);
			startActivity(new Intent(this, MenuActivity.class));
			overridePendingTransition(0, 0);
		}
		return true;
	}
   
}