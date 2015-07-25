package quotes;

import java.util.Random;

import com.appengers.database1.R;

import quotes.SimpleGestureFilter.SimpleGestureListener;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityquotes extends Activity implements SimpleGestureListener{
    private SimpleGestureFilter detector;
    
	  SQLiteDatabase db;		
	  TextView t1,t2,t4;
	  TextView t5;
	  Cursor c;
	  int n=0;
	  String number,quote,name,episode;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quoteslayout1);
		  t1=(TextView)findViewById(R.id.quote);
	 	  t2=(TextView)findViewById(R.id.name);
	 	  //t4=(TextView)findViewById(R.id.episode);
	 	 t5=(TextView)findViewById(R.id.number);
		 db= openOrCreateDatabase("Mydb", MODE_PRIVATE, null);
		   //create new table if not already exist




		 db.execSQL("create table if not exists mytable10(number varchar, name varchar, quote varchar)");
			 //db.execSQL("create table if not exists mytable10(number varchar, name varchar, quote varchar)");
			
			 db.execSQL("insert into mytable10 values(1,'-Cersei Lannister','When you play the game of thrones, you win or you die. There is no middle ground.')");
			 db.execSQL("insert into mytable10 values(2,'-Eddard Stark','Winter is coming.')");
			 db.execSQL("insert into mytable10 values(3,'-Tyrion Lannister','A Lannister always pays his debts.')");
			 db.execSQL("insert into mytable10 values(4,'-Ygritte','You know nothing, Jon Snow.')");
			 db.execSQL("insert into mytable10 values(5,'-Melisandre','The night is dark and full of terrors.')");
			 db.execSQL("insert into mytable10 values(6,'-Robert Barathean',' I am simply asking you to run my kingdom while I eat, drink, and whore myself into an early grave.')");
			 db.execSQL("insert into mytable10 values(7,'-Hodor',' Hodor!')");
			 db.execSQL("insert into mytable10 values(8,'-Tyrion Lannister',' Let me tell you something, Bastard. Never forget what you are, the rest of the world will not. Wear it like armor and it can never be used to hurt you.')");
			 db.execSQL("insert into mytable10 values(9,'-Eddard Stark: [to Jaime Lannister]',' I do not fight in tournaments because when I fight a man for real, I do not want him to know what I can do.')");
			 db.execSQL("insert into mytable10 values(10,'-Magister Illyrio Mopatis ','A Dothraki wedding without at least three deaths is considered a dull affair.')");
			 db.execSQL("insert into mytable10 values(11,'-Jaime Lannister ','The things I do for love...[Jaime pushes Bran from the window]')");
			 db.execSQL("insert into mytable10 values(12,'-Eddard Stark',' The man who passes the sentence should swing the sword.')");
			 db.execSQL("insert into mytable10 values(13,'-Magister Illyrio Mopatis','The Dothraki are not known for their punctuality.')");
			 db.execSQL("insert into mytable10 values(14,'-Tyrion Lannister ','Trial by combat, deciding a mans guilt or innocence in the eyes of the gods by having two other men hack each other to pieces. It tells you something about the gods.')");
			 db.execSQL("insert into mytable10 values(15,'-Tyrion Lannister','I will hurt you for this. A day will come when your joy will turn to ashes and you will know the debt is paid')");
			 db.execSQL("insert into mytable10 values(16,'-Tyrion Lannister','It is not easy being drunk all the time. If it were easy, everyone would do it.')");
			 db.execSQL("insert into mytable10 values(17,'-Tyrion Lannister','It is hard to put a leash on a dog once you have put a crown on its head')");
			 db.execSQL("insert into mytable10 values(18,'-Tyrion Lannister[to Oberyn]','If you want justice, you have come to the wrong place.')");
			 db.execSQL("insert into mytable10 values(19,'-Tyrion Lannister','The King is a lost cause, it is the rest of us I am worried about.')");
			 db.execSQL("insert into mytable10 values(20,'-Tyrion Lannister','When you tear out a mans tongue, you are not proving him a liar, you are only telling the world that you fear what he might say.')");
			 db.execSQL("insert into mytable10 values(21,'-Jaime Lannister','Has anyone ever told you are as boring as you are ugly?')");
			 db.execSQL("insert into mytable10 values(22,'-Robb Stark','I asked him, How can a man be brave if he is afraid? That is the only time a man can be brave, he told me.')");
			 db.execSQL("insert into mytable10 values(23,'-Stannis','They will bend the knee or I will destroy them.')");
			 db.execSQL("insert into mytable10 values(24,'-Cersei Lannister','Power is power.')");
			 db.execSQL("insert into mytable10 values(25,'-Grand Maester Pycelle','A dying mind is a demented mind, Lord Stark. For all the weight they are given, last words are usually as significant as first words.')");
			 db.execSQL("insert into mytable10 values(26,'-Tyrion Lannister','Ooo, I am monster. Perhaps you should speak to me more softly then. Monsters are dangerous and just now kings are dying like flies.')");
			 db.execSQL("insert into mytable10 values(27,'-Petyr Baelish (Littlefinger)','Money buys a mans silence for a time. A bolt in the heart buys it forever. ')");
			 db.execSQL("insert into mytable10 values(28,'-Meera Reed','Some people will always need help. That does not mean they are not worth helping.')");
			 db.execSQL("insert into mytable10 values(29,'-Syrio','There is only one God, and his name is death. And there is only one thing we say to death: Not today.')");
			 db.execSQL("insert into mytable10 values(30,'-Cersei Lannister','Some day you will sit on the throne and the truth will be what you make it.')");
			 db.execSQL("insert into mytable10 values(31,'-Oberyn Martell','Tell your father I am here — and tell him the Lannisters are not the only ones who pay their debts.')");
			 db.execSQL("insert into mytable10 values(32,'-Oberyn Martell','Bastards are born of passion, are not they? We do not despise them in Dorne')");
			 db.execSQL("insert into mytable10 values(33,'-Oberyn Martell','May I tell you a secret? You are not a golden lion. You are just a pink little man who is far too slow on the draw.')");
			 db.execSQL("insert into mytable10 values(34,'-Oberyn Martell','It is rare to meet a Lannister who shares my enthusiasm for dead Lannisters.')");
			 db.execSQL("insert into mytable10 values(35,'-Oberyn Martell','Elia Martell of Dorne. You raped her, you murdered her. You killed her children.')");
			 db.execSQL("insert into mytable10 values(36,'-Oberyn Martell','Today is not the day I die. ')");
			 db.execSQL("insert into mytable10 values(37,'-Tywin Lannister','Explain to me how it is more honorable to kill ten thousand men in war than ten at a dinner.')");
			 db.execSQL("insert into mytable10 values(38,'-Jorah Mormont','Rhaegar fought valiantly, Rhaegar fought nobly, Rhaegar fought honorably. And Rhaegar died.')");
			 db.execSQL("insert into mytable10 values(39,'-Tywin Lannister','Some battles are won with swords and spears, others with quills and ravens')");
			 db.execSQL("insert into mytable10 values(40,'-Jon Snow','Stick them with the pointy end.')");
			 db.execSQL("insert into mytable10 values(41,'-Lyanna Stark','Promise me, Ned')");
			 db.execSQL("insert into mytable10 values(42,'-Varys','A very small man can cast a very large shadow.')");
			 db.execSQL("insert into mytable10 values(43,'-Melisandre','There is power in a king’s blood,”')");
			 db.execSQL("insert into mytable10 values(44,'-Khaleesi','I will take what is mine with fire and blood.')");
			 db.execSQL("insert into mytable10 values(45,'-Petyr Baelish (Littlefinger)','A man with no motive is a man no one suspects. Always keep your foes confused.')");
			 db.execSQL("insert into mytable10 values(46,'-Petyr Baelish (Littlefinger)','If war is arithmetic mathematicians would be ruling the world.')");
			 db.execSQL("insert into mytable10 values(47,'-Jaime Lannister','By what right does the wolf judge the lion? By what right!')");
			 db.execSQL("insert into mytable10 values(48,'-Cersei Lannister','A true man does what he will, not what he must.')");
			 db.execSQL("insert into mytable10 values(49,'-Cersei Lannister','The next time you call me sister again, I will have you strangled in your sleep.')");
			 db.execSQL("insert into mytable10 values(50,'-Jojen Reed','A reader lives a thousand lives before he dies. The man who never reads lives only one.')");
			 
			 db.execSQL("insert into mytable10 values(51,'-Syrio','Fear cuts deeper than swords.')");
			 db.execSQL("insert into mytable10 values(52,'-Cersei','Start trying to work out who deserves what and before long you will spend the rest of your days weeping for each and every person in the world.')");
			 db.execSQL("insert into mytable10 values(53,'-Sansa Stark','I am not afraid of the pain after what Joffrey’s done to me.')");
			 db.execSQL("insert into mytable10 values(54,'-Tywin','You are being consulted at this very moment, your Grace')");
			 db.execSQL("insert into mytable10 values(55,'-The Faceless Men','Valar morghulis')");
			 db.execSQL("insert into mytable10 values(56,'-Tyrion','Everything is better with some wine in the belly')");
			 db.execSQL("insert into mytable10 values(57,'-Jaime Lannister','We do not get to choose who we love.')");
			 db.execSQL("insert into mytable10 values(58,'-Jojan Reed','A reader lives a thousand lives before he dies. The man who never reads lives only one.')");
			 db.execSQL("insert into mytable10 values(59,'-The Hound','You are a talker, listening to a talker makes me thirsty, and hungry')");
			 db.execSQL("insert into mytable10 values(60,'-Melisandre','Shadows are slaves to the light')");
			 db.execSQL("insert into mytable10 values(61,'-Jaime','Robert will choose a new hand of the kingdom to do his job while he is out fucking boars or hunting whores... or is it the other way around?')");
			 db.execSQL("insert into mytable10 values(62,'-Royce','Do the dead frighten you?')");
			 db.execSQL("insert into mytable10 values(63,'-Tyrion','Would it be excessive of me to ask you to save my life twice in a week?')");
			 db.execSQL("insert into mytable10 values(64,'','Sansa: What about the king? Hound: He can die just fine on his own.')");
			 db.execSQL("insert into mytable10 values(65,'-Tyrion Lannister','You have forgotten the most important thing about whores. You do not buy them, you only rent them.')");
			 db.execSQL("insert into mytable10 values(66,'-Stannis','They will bend the knee or I will destroy them.')");
			 db.execSQL("insert into mytable10 values(67,'-Mance','Are you capable of that, Jon Snow? Killing a man in his own tent when he is just offered you peace? Is that what the Night’s Watch is? Is that what you are?')");
			 db.execSQL("insert into mytable10 values(68,'-Fennesz ','The young may rejoice in the new world you have built for them, but for those of us too old to change, there is only fear and squalor')");
			 db.execSQL("insert into mytable10 values(69,'-The Hound','Going at it alone, you would not last a day out there.')");
			 db.execSQL("insert into mytable10 values(70,'-Tywin','Yes, but you refused to die. I respect that. Even admire it. You fight for what is yours.')");
			 db.execSQL("insert into mytable10 values(71,'-Jaime','You won. One fewer brother. You must be proud of yourself. There is really nothing you would not do, is there?')");
			 db.execSQL("insert into mytable10 values(72,'-Cersei','I am not interested in hearing another one of your smug stories about the time you won. This isn’t going to be one of those times.')");
			 db.execSQL("insert into mytable10 values(73,'-Ygritte','If we die we will die, but first we will live.')");
			 db.execSQL("insert into mytable10 values(74,'-Tywin','A lion does not concern himself with the opinions of a sheep.')");
			 db.execSQL("insert into mytable10 values(75,'-Tywin','Any man who must say I am the king is no true king')");
			 db.execSQL("insert into mytable10 values(76,'-Daenerys','Zaldrīzes buzdari iksos daor. (A dragon is not a slave.)')");

		 // Detect touched area 
         detector = new SimpleGestureFilter(this,this);
         c=db.rawQuery("select * from mytable10", null);
	      c.moveToFirst();
	      number=c.getString(0);
	      name=c.getString(1);
	 	 quote=c.getString(2);
	 	//episode=c.getString(3);
	 	 
	 	 t1.setText(quote);
	 	 t2.setText(name);
	 	//t4.setText(episode);
	 	 t5.setText(number+"- 76");
	 	Toast.makeText(this, "Swipe left or right to view the previous or next quote", Toast.LENGTH_LONG).show();
	 	
	

	 
		
		ImageView share=(ImageView)findViewById(R.id.share);
		share.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent shareIntent =   
						 new Intent(android.content.Intent.ACTION_SEND);  
						  
						//set the type  
						shareIntent.setType("text/plain");  
						  
						//add a subject  
						shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,   
						 "Game of thrones quote: ");  
						  
						//build the body of the message to be shared  
						String shareMessage = quote+" \n"+name;  
						  
						//add the message  
						shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,   
						 shareMessage);  
						  
						//start the chooser for sharing  
						startActivity(Intent.createChooser(shareIntent,   
						 "Share the quote via"));  
			}
	});
	 	
	 	ImageView quote10=(ImageView)findViewById(R.id.quote10);
		quote10.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				onSwipe(SimpleGestureFilter.SWIPE_DOWN);
			}
	});
	
	}	
	
	public void change()
	{
		 Cursor c=db.rawQuery("select * from mytable10", null);
		 
	      c.moveToNext();
		
			
		 
	      String number=c.getString(0);
	      String name=c.getString(1);
	 	 String quote=c.getString(2);
	 	// String episode=c.getString(3);
	 	 
		 t1.setText(quote);
	 	 t2.setText(name);
	 	 //t4.setText(episode);
	 	 t5.setText(number);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

	
	
	
	public boolean dispatchTouchEvent(MotionEvent me){
        // Call onTouchEvent of SimpleGestureFilter class
         this.detector.onTouchEvent(me);
       return super.dispatchTouchEvent(me);
    }
    @Override
     public void onSwipe(int direction) {
      String str = "";
      
 	 Cursor c=db.rawQuery("select * from mytable10", null);
	 c.moveToPosition(n);
		 
      switch (direction) {
      
      case SimpleGestureFilter.SWIPE_LEFT :
      if(n==76)
    	  Toast.makeText(this, "Can't go to next quote", Toast.LENGTH_SHORT).show();
      else
      {
      n++;
      c.moveToPosition(n);
      }


     break;
      case SimpleGestureFilter.SWIPE_RIGHT :
      if(n==0)
    	  Toast.makeText(this, "Can't go to previous quote", Toast.LENGTH_SHORT).show();
      else
      {
      n--;
      c.moveToPosition(n);
      }
    	  
      break;
      case SimpleGestureFilter.SWIPE_DOWN :
      Random randomGenerator = new Random();
      int randomInt = randomGenerator.nextInt(76);
      n=randomInt;
      c.moveToPosition(n);
                                                     break;
      case SimpleGestureFilter.SWIPE_UP :    str = "Swipe Up";
                                                     break;
      
      }

      number=c.getString(0);
      name=c.getString(1);
 	 quote=c.getString(2);
 	// episode=c.getString(3);
 	 
	 t1.setText(quote);
 	 t2.setText(name);
 	 //t4.setText(episode);
 	 t5.setText(number+" - 76");
     }
      
     @Override
     public void onDoubleTap() {
    		android.text.ClipboardManager clipboard = (android.text.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
			clipboard.setText(quote+" \n"+name);
            Toast.makeText(getApplicationContext(), "Text Copied To Clipboard", Toast.LENGTH_SHORT).show();
	
      
     }
          
  }
	

