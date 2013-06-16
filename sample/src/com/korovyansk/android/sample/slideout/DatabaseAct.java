package com.korovyansk.android.sample.slideout;



import com.actionbarsherlock.view.MenuItem;
import com.korovyansk.android.slideout.SlideoutActivity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;

import android.widget.ImageView;
import android.widget.TextView;

@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
public class DatabaseAct extends Activity {

	TextView textName, textDescription, textLocation, textTime;
	ImageView iv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.eventdetails);
		 getActionBar().setHomeButtonEnabled(true);
		Intent i = getIntent();
		int val = i.getIntExtra("PASS", 0);
		final int []imageArray={R.drawable.ds,R.drawable.raidf,R.drawable.enigma,R.drawable.scripit,R.drawable.cb,R.drawable.debug1,R.drawable.quiz,R.drawable.web,R.drawable.mega,R.drawable.proto,R.drawable.img3,R.drawable.img2,R.drawable.img1};
		iv= (ImageView) findViewById(R.id.imageView1);
		textName = (TextView) findViewById(R.id.textName);
		textDescription = (TextView) findViewById(R.id.textDescription);
		textTime = (TextView) findViewById(R.id.textTime);
		//textLocation = (TextView) findViewById(R.id.textLocation);
		Database db;
		db = new Database(this);
		db.open();
		db.createentry(
				1,
				"Data Structs",
				null,
				"March 1",
				"Want to appraise the knowledge you have on Data Structures?\n\nYou think you need to meliorate the understanding you have on the subject?\n\nWell, this the germane place for you to discover, explore and empower your cognition in efficient data management.\n\nIt is better to have 100 functions operate on one data structure than 10 functions on 10 data structures. - Alan J. Perlis\n\nPrize: Will be announced later.");
		db.createentry(
				2,
				"RAID",
				null,
				"March 1",
				"Every day is an irreversible Transaction. No rollbacks. No fall backs. Only Flashbacks.\n\nImagine Life without Intelligence\n\nImagine Computing without a Computer\n\nImagine Social Networking without a Network\n\nData without a Storage mechanism - Unimaginable!\n\nGet Ready to RAID the deep mines of data housing and put your skills to the test!!\n\nData is what distinguishes the dilettante from the artist. - George V. Higgins\n\nPrize: Will be announced.");
		db.createentry(
				3,
				"Enigma",
				null,
				"March 1",
				"This event stands to showcase your inner quintessential MATH GEEK.\n\nThe event Enigma identifies the people with inductive reasoning aptitude by testing the participants on their Problem tackling and solving skills. The ingenuity of the participant is tested here.\n\nThe road to victory consists of simple mathematical puzzles, brain teasers and general aptitude.\n\nCome show off your math skills at ENIGMA!");
		db.createentry(
				4,
				"Script IT",
				null,
				"March 1",
				"Script IT is the onsite application development marathon where we do not restrict participants to a single platform.They can use their skills and extend their capabilities to develop a productive application related to the theme given on the spot.This event is a competitive arena to compete with fellow developers and showcase your talents. ");
		db.createentry(
				5,
				"O(1)",
				null,
				"March 1",
				"The best programmers are not marginally better than merely good ones. They are an order-of-magnitude better, measured by whatever standard: conceptual creativity, speed, ingenuity of design, or problem-solving ability - Randall E. Stross\n\nAre you the typical geek passionate about coding?? Then welcome to Onsite Programming Contest of ITRIX 2013! We provide you a platform where the boundaries between possibility and impossibility blur. Come fight out one of the most challenging coding contest of the year!\n\nDon't worry if it doesn't work right. If everything did, you'd be out of a job. - Mosher's Law of Software Engineering");
		db.createentry(
				6,
				"Fix IT",
				null,
				"March 1",
				"The Event Fix IT! throws the spotlight on the participants ability to debug and test code. It aims at recognizing their hidden potential by testing their Technical skills. The participants of this contest are tested for both their perception and intuition in the areas of computer programming. It provides a beneficial platform for tomorrow's professionals to explore their debugging capabilities.\n\nIt's hard enough to find an error in your code when you're looking for it; it's even harder when you've assumed your code is error-free. - Steve McConnel");
		db.createentry(
				7,
				"ITRIX Quiz",
				null,
				"March 1",
				"If you are one of those people who are intrigued by the most random of facts, if you are someone who questions all that is around him, origins, etymologies, trivia, funda and whatnot, then the ITrix Gen Quiz awaits you. Can you beat the odds and rise to be a Quizzing superstar? ");
		db.createentry(
				8,
				"Web Prodigy",
				null,
				"March 1",
				"User Interface Design is a key factor that can affect product acceptance / rejection. Showcase your ability to create attractive websites in this event. All you need is a little know-how in HTML, CSS & Java Scripts. ");
		db.createentry(
				9,
				"Mega Event",
				null,
				"March 1",
				"Want to be crowned the Winner of Winners?!!\n\nThis is a NOT to be missed mega event of ITrix '13 that is an amalgamation of fun technical knickknacks , subtle brainteasers and bombarding ideas extending over 3 different rounds. The questions can range from ANYTHING AND EVERYTHING that comes under the banner Information Technology !!");
		db.createentry(
				10,
				"The Protocol",
				null,
				"March 1",
				" Need a platform to showcase your inner geek?!!\n\nThen The Protocol is just the place for you guys !!\n\nQuestions will be thrown from every single core concept of Computer science ( OS , Networks , Automata etc ). Get ready to shine through this event. Register soon and challenge yourself by asking the question ");
		db.createentry(
				11,
				"Big Data",
				null,
				"March 2",
				"Generation of over 2.5 quintillion bytes of data everyday makes on-hand processing complex and challenging. Analysis of large data sets, or big data, is becoming a crucial business requirement, underpinning new waves of growth and innovation. Leaders in every sector are now grappling with the implications of big data. Seemingly overnight, it has evolved from something that was the realm of a select number of data-savvy managers to an urgent business imperative that can give you the edge on your competitors. Learn how such data is handled and analyzed and why this technology has taken the world by storm.\n\nThis workshop, conducted by IBM, is suitable for executives, analysts and business professionals in any organization interested in leveraging data to make better decisions. Analysts will gain knowledge and tools for making smarter decisions and business professionals will emerge from the workshop with a solid grounding in business analytics and predictive analytics.\n\nStudent Workshop Fee: Rs.500 (4 hrs)\nCorporates Workshop Fee: Rs.800 (4 hrs)");
		db.createentry(
				12,
				"Cyber Forensics",
				null,
				"March 1",
				"If you think technology can solve your security problems, then you don't understand the problems and you don't understand the technology - Bruce Schneier\n\nStudent Workshop Fee: Rs.600 (8 hrs)\nCorporates Workshop Fee: Rs.900 (8 hrs)\n\nThe threats in usage of modern technology remain seriously under-appreciated by most. Wanna learn to navigate the maze of cyber security to its depths? Here we arm you with the knowledge and skill to do so\n\nAbout Tech Bharat Consulting\n\nTechBharat Consulting (Thakral Info Security Services) is an Accredited Training Centre for EC Council USA, who is a member-based organization that certifies individuals in various e-business and information security skills.It has solved many cases like Fake Profile Cases, Email Spoofing cases, Phishing case, Espionage cases, Credit Card fraud Cases, SMS Spoofing Case in association with many Security Agencies.\n\nAbout the workshop\n\nThis workshop demonstrates the latest ethical hacking and cyber forensics techniques by Tech Bharat Consulting.\n\nLearn to Scan,Test,Hack and Secure your own systems!\n\nLab Intensive Environment and Hands-On Experiments will give in-depth knowledge and practical experience with current essential security systems!\n\nAlong with knowledge, take away Ethical hacking and Cyber Forensics toolkit and Information Security Professional Certificate.");
		db.createentry(
				13,
				"Windows 8 App Development",
				null,
				"March 1",
				"WINDOWS 8. MILLIONS OF PEOPLE. YOUR APP.\n\nSeizing the opportunity is easier than you think.\n\nNow that Windows 8 is here, there's never been a better time to build apps. Right from the start to the finish, this workshop will provide what you need to make coding Windows 8 apps or games a snap. Find the tools, help, and support you need to create your app.\n\nStudent Workshop Fee: Rs.500 (4 hrs)\nCorporates Workshop Fee: Rs.800 (4 hrs)");
		
		db.close();
		db.open();
		textName.setText(db.getName(val));
		//textLocation.setText(db.getLocation(val));
		iv.setImageResource(imageArray[val-1]);
		textTime.setText(db.getTime(val));
		textDescription.setText(db.getDesc(val));
		db.close();
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		if(item.getItemId() == android.R.id.home){
			
			int width = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 30, getResources().getDisplayMetrics());
			
			SlideoutActivity.prepare(this, R.id.eventpage, width);
			startActivity(new Intent(this, MenuActivity.class));
			overridePendingTransition(0, 0);
		}
		return false;
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.eventdetails, menu);
		return true;
	}*/

}
