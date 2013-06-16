package com.korovyansk.android.sample.slideout;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.korovyansk.android.slideout.SlideoutActivity;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.WindowManager;

@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
public class Contact extends SherlockActivity{
	
	@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        getWindow().setFormat(PixelFormat.RGBA_8888);
			getWindow().addFlags(WindowManager.LayoutParams.FLAG_DITHER);
	        setContentView(R.layout.contact);
	        getActionBar().setHomeButtonEnabled(true);
	        }
	 public boolean onOptionsItemSelected(MenuItem item) {
			if(item.getItemId() == android.R.id.home){
				
				int width = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 20, getResources().getDisplayMetrics());
				
				SlideoutActivity.prepare(this, R.id.contact,width);
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
