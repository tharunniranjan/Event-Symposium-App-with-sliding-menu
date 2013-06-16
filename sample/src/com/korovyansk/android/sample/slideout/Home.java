package com.korovyansk.android.sample.slideout;

import android.annotation.TargetApi;
import android.content.Intent;

import android.graphics.PixelFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;


import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.github.espiandev.showcaseview.ShowcaseView;

import com.korovyansk.android.slideout.SlideoutActivity;

@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
public class Home extends SherlockActivity implements OnClickListener, ShowcaseView.OnShowcaseEventListener {
	int firsttime = 0;
	ImageView iv, iv2;
	ImageButton ibCyber, ibOpc, ibWin8, ibIsta, ibWeb, ibMega, ibBdata;
	ShowcaseView sv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getWindow().setFormat(PixelFormat.RGBA_8888);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_DITHER);
		setContentView(R.layout.home);
		getActionBar().setHomeButtonEnabled(true);
		ShowcaseView.ConfigOptions mOptions = new ShowcaseView.ConfigOptions();
		mOptions.hideOnClickOutside = true;
		sv = ShowcaseView.insertShowcaseView(50, 50, this,
				"WELCOME TO ITRIX 2013!", "Click on the logo to see the menu ",
				mOptions);
		
		sv.pointTo(40, 50);
		sv.setOnShowcaseEventListener(this);


		iv = (ImageView) findViewById(R.id.ivPoster);
		ibCyber = (ImageButton) findViewById(R.id.ivCyber);
		ibOpc = (ImageButton) findViewById(R.id.ivOPC);
		ibWin8 = (ImageButton) findViewById(R.id.ivWin8);
		ibIsta = (ImageButton) findViewById(R.id.ivFooter);
		ibWeb = (ImageButton) findViewById(R.id.ivWeb);
		ibMega = (ImageButton) findViewById(R.id.ivMega);
		ibBdata = (ImageButton) findViewById(R.id.ivbdata);
		// iv2 =(ImageView) findViewById(R.id.ivSponsors);
		ibCyber.setOnClickListener(this);
		ibOpc.setOnClickListener(this);
		ibWin8.setOnClickListener(this);
		ibIsta.setOnClickListener(this);
		ibBdata.setOnClickListener(this);
		ibWeb.setOnClickListener(this);
		ibMega.setOnClickListener(this);
		
		final int[] imageArray3 = { R.drawable.banner, R.drawable.eventdate,
				R.drawable.img1, R.drawable.img2, R.drawable.img3,
				R.drawable.img4 };
		final Animation inAnimation = AnimationUtils
				.makeInAnimation(this, true);
		final Animation outAnimation = AnimationUtils.makeOutAnimation(this,
				true);
		// final Animation fade= AnimationUtils.
		// public static void ImageViewAnimatedChange(Context , final ImageView
		// );

		final Handler handler = new Handler();
		Runnable runnable = new Runnable() {
			int i = 0;

			public void run() {
				// iv2.setImageResource(imageArray[j]);
				// dddiv2.startAnimation(inAnimation);
				iv.setImageResource(imageArray3[i]);
				iv.startAnimation(inAnimation);

				// ImageViewAnimatedChange(this,iv,imageArray[i]);

				i++;
				
				if (i > imageArray3.length - 1) {
					i = 0;
				}
				

				handler.postDelayed(this, 3000); // for interval...
				// iv.startAnimation(outAnimation);
			}

		};
		iv.startAnimation(outAnimation);
		handler.postDelayed(runnable, 50); // for initial delay..

	}

	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == android.R.id.home) {

			int width = (int) TypedValue.applyDimension(
					TypedValue.COMPLEX_UNIT_DIP, 30, getResources()
							.getDisplayMetrics());

			SlideoutActivity.prepare(this, R.id.home, width);
			startActivity(new Intent(this, MenuActivity.class));
			overridePendingTransition(0, 0);
		}
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.ivCyber:
			Intent cb = new Intent(this, DatabaseAct.class);
			cb.putExtra("PASS", 12);
			startActivity(cb);
			break;
		case R.id.ivOPC:
			Intent o1 = new Intent(this, DatabaseAct.class);
			o1.putExtra("PASS", 5);
			startActivity(o1);
			break;
		case R.id.ivFooter:
			Intent ista = new Intent(this, About.class);

			startActivity(ista);
			break;
		case R.id.ivWin8:
			Intent w8 = new Intent(this, DatabaseAct.class);
			w8.putExtra("PASS", 13);
			startActivity(w8);
			break;
		case R.id.ivMega:
			Intent me = new Intent(this, DatabaseAct.class);
			me.putExtra("PASS", 9);
			startActivity(me);
			break;
		case R.id.ivWeb:
			Intent wp = new Intent(this, DatabaseAct.class);
			wp.putExtra("PASS", 8);
			startActivity(wp);
			break;
		case R.id.ivbdata:
			Intent bd = new Intent(this, DatabaseAct.class);
			bd.putExtra("PASS", 11);
			startActivity(bd);
			break;

		}
	}

	@Override
	public void onShowcaseViewHide(ShowcaseView showcaseView) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onShowcaseViewShow(ShowcaseView s) {
		// TODO Auto-generated method stub
		//showcaseView.animateGesture(0,0,200,0).start();
		
		
	}
}
