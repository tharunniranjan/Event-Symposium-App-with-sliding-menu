package com.korovyansk.android.sample.slideout;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MenuFragment extends ListFragment {

	String classes[]={ "   Home", "   Events", "   Workshops","   Contact","   About"};
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		setListAdapter(new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, classes));
		getListView().setCacheColorHint(0);
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		
		switch(position){
		case 0:
			Intent openHome= new Intent (getActivity().getApplicationContext(), Home.class);
			openHome.putExtra("Pass", 0);
			startActivity(openHome);
			
			//overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
			break;
		case 1:
			Intent openEvents = new Intent (getActivity().getApplicationContext(), Events.class);
			openEvents.putExtra("Pass", 1);
			startActivity(openEvents);
			
			break;
		case 2:
			Intent openWork = new Intent (getActivity().getApplicationContext(), WorkshopActivity.class);
			openWork.putExtra("Pass", 2);
			startActivity(openWork);
			break;	
		case 3:
			Intent openContact= new Intent (getActivity().getApplicationContext(), Contact.class);
			openContact.putExtra("Pass", 3);
			startActivity(openContact);
			break;
		case 4:
			Intent openAbout= new Intent (getActivity().getApplicationContext(), About.class);
			openAbout.putExtra("Pass", 4);
			startActivity(openAbout);
			break;
			
		}
		((MenuActivity)getActivity()).getSlideoutHelper().close();

	}

	
}
