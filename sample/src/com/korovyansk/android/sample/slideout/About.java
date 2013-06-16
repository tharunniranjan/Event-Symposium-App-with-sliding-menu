package com.korovyansk.android.sample.slideout;



import android.content.Intent;
import android.graphics.PixelFormat;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.WindowManager;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;



import com.korovyansk.android.slideout.SlideoutActivity;


public class About extends SherlockActivity{
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFormat(PixelFormat.RGBA_8888);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_DITHER);
        setContentView(R.layout.aboutus);
      //  getActionBar().setHomeButtonEnabled(true);
        }
 public boolean onOptionsItemSelected(MenuItem item) {
		if(item.getItemId() == android.R.id.home){
			
			int width = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 20, getResources().getDisplayMetrics());
			
			SlideoutActivity.prepare(this, R.id.about,width);
			startActivity(new Intent(this, MenuActivity.class));
			overridePendingTransition(0, 0);
		}
		return true;
	}
 @Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
}
