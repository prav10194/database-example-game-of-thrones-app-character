package com.example.database1;
import quotes.Start;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.appengers.database1.R;
import com.example.database1.MainActivity;
public class Data extends Activity implements OnClickListener{

	
	  SQLiteDatabase db;
	  static TextView tv;
	  static String name;
	static String alias;
	static String character;
	static String continued,character2,character4;
	static String played;
	  static String introduction;
	
	
	TextView t1,t2,t4,t5,t7;
	TextView t8,t10,t11;
	 ImageView im1;
	  ImageView im2;
	  ImageView im4;
	  ImageView im5;
	  AutoCompleteTextView et4;
	  String[] androidBooks = 
		  {
			  "Jaime Lannister",
		  "Cersei Lannister",
		  "Tyrion Lannister",
		  "Tywin Lannister",
		  "Joffrey Baratheon",
		  "Myrcella Baratheon",
		  "Tommen Baratheon",
		  "Margaery Tyrell",
		  "Kevan Lannister",
		  "Joanna Lannister",
		  "Lancel Lannister",
		  "Willem Lannister",
		  "Martyn Lannister",
		  "Janei Lannister",
		  "Damon Lannister",
		  "Tybolt Lannister",
		  "Gerold Lannister",
		  "Tytos Lannister",
		  "Dorna Swyft",
		  "Genna Lannister",
		  "Emmon Frey",
		  "Tygett Lannister",
		  "Darlessa Marbrand",
		  "Gerion Lannister",
		  "Stafford Lannister",
		  "Ermesande Hayford",
		  "Tyrek Lannister",
		  "Joy Hill",
		 "Jon Snow","Robb Stark","Jeyne Westerling","Sansa Stark","Arya Stark","Bran Stark","Rickon Stark","Brandon Stark","Eddard Stark","Catelyn Tully","Lyanna Stark","Benjen Stark","Rickard Stark","Edwyle Stark","Brandon Stark (Old Nan)","Willam Stark","Artos Stark","Barra","Bella","Gendry","Mya Stone",
		 "Edric Storm","Shireen Baratheon","Renly Baratheon","Selyse Florent","Stannis Baratheon","Rhaelle Targaryen","Steffon Baratheon","Melisandre","Davos Seaworth", "Oberyn Martell","Olenna Redwyne(Tyrell)","Ellaria Sand","Podrick Payne","Grand Maester Pycelle","Qyburn","Gregor Clegane","Daario Naharis","Missandei","Mance Rayder","Lysa Tully","Ygritte","Hound - Sandor Clegane","Theon Greyjoy","Petyr Baelish","Varys","Bronn","Shae","Jorah Mormont","Joyeuse Erenford","Hot Pie","Others","Craster","Gilly","Rast","Osha","Walder Frey","Balon Greyjoy","Meryn Trant","Anya Waynwood","Leaf","Brienne of Tarth","Tormund","Grenn","Yohn Royce","Khal Drogo","Khal Jhaqo","Khalasar","Pypar","Meera Reed","Hodor","Styr","Three-Eyed Raven","Jojan Reed",
		  };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	       getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	           WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.layout11);
		//TextView tv1=MainActivity.tv.getText().;
		t1=(TextView)findViewById(R.id.textView22);
		t1.setText(MainActivity.introduction);
	t2=(TextView)findViewById(R.id.textView2);
		t4=(TextView)findViewById(R.id.textView4);
		t5=(TextView)findViewById(R.id.textView6);
		t7=(TextView)findViewById(R.id.data11);
		t8=(TextView)findViewById(R.id.textView7);
		//t10=(TextView)findViewById(R.id.textView8);
		//t11=(TextView)findViewById(R.id.textView9);
	
	t2.setText(MainActivity.alias);
	t4.setText(MainActivity.character);
	t5.setText(MainActivity.played);
	t7.setText(MainActivity.name);
	t8.setText(MainActivity.continued);
	//t10.setText(MainActivity.character2);
	//t11.setText(MainActivity.character4);
	getWindow().setSoftInputMode(
		      WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

	 tv=(TextView)findViewById(R.id.t1);
	 et4 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
	   ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.mylist,androidBooks); //Important code
AutoCompleteTextView acTextView = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
acTextView.setThreshold(1);
acTextView.setAdapter(adapter);
im1=(ImageView)findViewById(R.id.search1);
im1.setOnClickListener(this);
im2=(ImageView)findViewById(R.id.forward);
im2.setOnClickListener(this);
im4=(ImageView)findViewById(R.id.copy1);
im4.setOnClickListener(this);
im5=(ImageView)findViewById(R.id.rss1111);
im5.setOnClickListener(this);


et4.setOnEditorActionListener(new EditText.OnEditorActionListener()
{

	@Override
	public boolean onEditorAction(TextView arg0, int arg1, KeyEvent arg2) {
		// TODO Auto-generated method stub
		 if(arg1 == EditorInfo.IME_ACTION_DONE)
            {
                func1();
                return true;
            }
		return false;
	}

});


//create database if not already exist
db= openOrCreateDatabase("Mydb", MODE_PRIVATE, null);
		


	}
	
	 @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	       MenuInflater mi=  getMenuInflater();
	       mi.inflate(R.menu.cool_menu, menu); 
	       return true;
	    }
	   
	   public boolean onOptionsItemSelected(MenuItem item) {
			// TODO Auto-generated method stub
		
			
			
			switch(item.getItemId()){	
		case R.id.aboutUs:
			  
			Intent i2=new Intent("android.intent.action.ABOUTUS");
			startActivity(i2);
				break;
				
			case R.id.share:
				//create the send intent  
				Intent shareIntent =   
				 new Intent(android.content.Intent.ACTION_SEND);  
				  
				//set the type  
				shareIntent.setType("text/plain");  
				  
				//add a subject  
				shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,   
						 "Take a look at Game of thrones encyclopedia: ");  
						  
						//build the body of the message to be shared  
						String shareMessage = " https://play.google.com/store/apps/details?id=com.appengers.database1";  
						    
				//add the message  
				shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,   
				 shareMessage);  
				  
				//start the chooser for sharing  
				startActivity(Intent.createChooser(shareIntent,   
				 "Share the app via"));  
				
				break;
				
			case R.id.information:
				Intent i=new Intent("android.intent.action.INFORMATION5");
				startActivity(i);
				break;
				
			case R.id.quotes:
				Intent myIntent = new Intent(Data.this, Start.class);
				Data.this.startActivity(myIntent);
			//	System.exit(0);
				break;
				
			case R.id.exit:
				System.exit(0);
				break;
		}
		return false;
		}
	   
	   
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch(v.getId())
			{
			case R.id.forward:
				this.openOptionsMenu();
				break;
				
			
			case R.id.search1:
				String x=et4.getText().toString();
				Cursor c=db.rawQuery("select * from mytable7 where name='"+ x +"'", null);
				tv.setText("");
				if (c.getCount()==0)
				{
					 Toast.makeText(getApplicationContext(), "No value found", Toast.LENGTH_SHORT).show();
				}
				else
				{
				
				   //move cursor to first position
				   c.moveToFirst();
				   //fetch all data one by one
				   do
				   {
				    //we can use c.getString(0) here
				    //or we can get data using column index
				    name=c.getString(c.getColumnIndex("name"));
				    alias=c.getString(1);
				    introduction=c.getString(2);
				    character=c.getString(3);
				    continued=c.getString(4);
				    played=c.getString(5);
				    t1.setText(introduction);
				    t2.setText(alias);
					t4.setText(character);
					t5.setText(played);
					t7.setText(name);
					t8.setText(continued);
					MainActivity.name=name;
					MainActivity.alias=alias;
					MainActivity.introduction=introduction;
					MainActivity.character=character;
					MainActivity.continued=continued;
					MainActivity.played=played;
					  //tv.setText(name);
				    //display on text view
				   // tv.append("Name:"+name+" and SurName:"+surname+"Desc: "+description+"\n");
				    //move next position until end of the data
				   }while(c.moveToNext());
				   getWindow().setSoftInputMode(
						      WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
				  
				}
					
				break;
				
			case R.id.copy1:
				
				android.text.ClipboardManager clipboard = (android.text.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
				clipboard.setText("Name: "+MainActivity.name+"\nIntroduction: "+MainActivity.introduction+"\nAlias: "+MainActivity.alias+"\nCharacter: "+MainActivity.character+"\nContinued: "+MainActivity.continued+"\nPlayed By:"+MainActivity.played);
	            Toast.makeText(getApplicationContext(), "Text Copied To Clipboard", Toast.LENGTH_SHORT).show();
				break;
				
			case R.id.rss1111:
				Intent shareIntent =   
				 new Intent(android.content.Intent.ACTION_SEND);  
				  
				//set the type  
				shareIntent.setType("text/plain");  
				  
				//add a subject  
				shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,   
				 "Information on: "+MainActivity.name);  
				  
				//build the body of the message to be shared  
				String shareMessage = "\nIntroduction: "+MainActivity.introduction+"\nAlias: "+MainActivity.alias+"\nCharacter: "+MainActivity.character+"\nContinued: "+MainActivity.continued+"\nPlayed By:"+MainActivity.played;
				  
				//add the message  
				shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,   
				 shareMessage);  
				  
				//start the chooser for sharing  
				startActivity(Intent.createChooser(shareIntent,   
				 "Share the character via"));  
				
				break;
				
		}
			}

		void func1()
		{
			String x=et4.getText().toString();
			Cursor c=db.rawQuery("select * from mytable7 where name='"+ x +"'", null);
			tv.setText("");
			if (c.getCount()==0)
			{
				 Toast.makeText(getApplicationContext(), "No value found", Toast.LENGTH_SHORT).show();
			}
			else
			{
			   //move cursor to first position
			   c.moveToFirst();
			   //fetch all data one by one
			   do
			   {
			    //we can use c.getString(0) here
			    //or we can get data using column index
			    name=c.getString(c.getColumnIndex("name"));
			    alias=c.getString(1);
			    introduction=c.getString(2);
			    character=c.getString(3);
			    continued=c.getString(4);
			    played=c.getString(5);
			    //display on text view
			   // tv.append("Name:"+name+" and SurName:"+surname+"Desc: "+description+"\n");
			    //move next position until end of the data
			   }while(c.moveToNext());
			  
			Intent i2=new Intent("android.intent.action.DATA");
			startActivity(i2);
			}
		}
}
