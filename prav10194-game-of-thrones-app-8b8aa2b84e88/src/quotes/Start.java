package quotes;


import com.appengers.database1.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class Start extends Activity{


	private ProgressBar probar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		 requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	            WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.quoteslayout);
	
	
		
		Thread timer=new Thread(){
		public void run(){
			
			try{
				sleep(4000);
				
			} 
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			finally{
				
				Intent myIntent = new Intent(Start.this, MainActivityquotes.class);
				Start.this.startActivity(myIntent);

				
			}
		}
	};
	timer.start();
	}
	
@Override
protected void onPause(){
	super.onPause();
	finish();
}
}