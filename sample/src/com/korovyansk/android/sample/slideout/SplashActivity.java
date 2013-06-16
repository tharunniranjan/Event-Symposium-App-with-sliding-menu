package com.korovyansk.android.sample.slideout;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Window;
import android.view.WindowManager;


public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.kogo);
		
		
        

    	Thread timer = new Thread(){
    		public void run(){
    			try{
    				sleep(3000);					
    			} catch (InterruptedException e){
    				e.printStackTrace();
    			}finally{
    				Intent openStartingPoint = new Intent("com.itrix.HOME");
    				startActivity(openStartingPoint);
    				overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    			}
    		}
    	};
    	timer.start();	
    }
	



	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
    
    
}