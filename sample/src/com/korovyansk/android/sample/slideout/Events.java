package com.korovyansk.android.sample.slideout;

import java.util.ArrayList;
import java.util.List;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.korovyansk.android.slideout.SlideoutActivity;

import android.annotation.TargetApi;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;

import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;


 
@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
public class Events extends SherlockActivity implements
        OnItemClickListener {
 
    public static final String[] titles = new String[] { 
            "Data Struct", "Raid","The Protocol","Engima","Script IT","O(1)","FIX IT","Itrix Quiz","Web Prodigy","Mega Event" };
 
    public static final String[] descriptions = new String[] {
    	"Place for you to discover,explore and empower your cognition in efficient Data Management","Get ready to RAID the deep mines of data housing and put your skills to the test!", 
            "A platform to showcase your inner geek","Event to showcase your inner quintessential MATH GEEK","An onsite application development marathon","Come fight out one of the most challenging competition of the year!",
            "A beneficial platform for tomorrow's professionals to explore their debugging capabilities." ,"Can you beat the odds and rise to be a Quizzing superstar?",
            "Showcase your ability to create attractive websites in this event",
            "Want to be crowned the \"Winner of Winners\"?!! This is a NOT to be missed mega event of ITrix '13!"};
 
    public static final Integer[] images = {
            R.drawable.ds, R.drawable.raidf, R.drawable.proto, R.drawable.enigma,R.drawable.scripit,R.drawable.cb,R.drawable.debug1,R.drawable.quiz,R.drawable.web, R.drawable.mega};
 
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
       /* Toast toast = Toast.makeText(getApplicationContext(),
            "Item " + (position + 1) + ": " + rowItems.get(position),
            Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();*/
    	switch(position){
    	case 0:
    		Intent ds = new Intent(this,DatabaseAct.class);
    		ds.putExtra("PASS", position+1);
    		startActivity(ds);
    		break;
    	case 1:
    		//datastruct
    		Intent raid = new Intent(this,DatabaseAct.class);
    		raid.putExtra("PASS", position+1);
    		startActivity(raid);
    		break;
    	case 2:
    		//raid
    		Intent proto = new Intent(this,DatabaseAct.class);
    		proto.putExtra("PASS", position+8);
    		startActivity(proto);
    		break;
    	case 3:
    		//enigma
    		Intent enigma = new Intent(this,DatabaseAct.class);
    		enigma.putExtra("PASS", position);
    		startActivity(enigma);
    		break;
    	case 4:
    		Intent si = new Intent(this,DatabaseAct.class);
    		si.putExtra("PASS", position);
    		startActivity(si);
    		//scriptit
    		break;
    	case 5:
    		//o1
    		Intent o1 = new Intent(this,DatabaseAct.class);
    		o1.putExtra("PASS", position);
    		startActivity(o1);
    		break;
    	case 6:
    		//fixit;
    		Intent ft = new Intent(this,DatabaseAct.class);
    		ft.putExtra("PASS", position);
    		startActivity(ft);
    	case 7:
    		//quiz
    		Intent qz = new Intent(this,DatabaseAct.class);
    		qz.putExtra("PASS", position);
    		startActivity(qz);
    		break;
    	case 8:
    		//web
    		Intent wp = new Intent(this,DatabaseAct.class);
    		wp.putExtra("PASS", position);
    		startActivity(wp);
    		break;
    	case 9:
    		//mega
    		Intent me = new Intent(this,DatabaseAct.class);
    		me.putExtra("PASS", position);
    		startActivity(me);
    		break;
    		
    	/*case 10:
    		//protocol
    		Intent pr = new Intent(this,Database.class);
    		.putExtra("PASS", position);
    		break;*/
    			
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