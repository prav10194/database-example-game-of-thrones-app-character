package com.example.database1;

import com.appengers.database1.R;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class TabBarActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        intent = new Intent().setClass(this, Tab1Activity.class);
        spec = tabHost.newTabSpec("Lannister").setIndicator("Lannister")
                      .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, Tab2Activity.class);
        spec = tabHost.newTabSpec("Baratheon").setIndicator("Baratheon")
                      .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, Tab4Activity.class);
        spec = tabHost.newTabSpec("Stark").setIndicator("Stark")
                      .setContent(intent);
        tabHost.addTab(spec);
        
        intent = new Intent().setClass(this, Tab8Activity.class);
        spec = tabHost.newTabSpec("Martell").setIndicator("Martell")
                      .setContent(intent);
        tabHost.addTab(spec);
        
        intent = new Intent().setClass(this, Tab14Activity.class);
        spec = tabHost.newTabSpec("Tully").setIndicator("Tully")
                      .setContent(intent);
        tabHost.addTab(spec);
        
        intent = new Intent().setClass(this, Tab5Activity.class);
        spec = tabHost.newTabSpec("Targaryen").setIndicator("Targaryen")
                      .setContent(intent);
        tabHost.addTab(spec);
        
        intent = new Intent().setClass(this, Tab11Activity.class);
        spec = tabHost.newTabSpec("Bolton").setIndicator("Bolton")
                      .setContent(intent);
        tabHost.addTab(spec);
        
        intent = new Intent().setClass(this, Tab10Activity.class);
        spec = tabHost.newTabSpec("Greyjoy").setIndicator("Greyjoy")
                      .setContent(intent);
        tabHost.addTab(spec);
        
        intent = new Intent().setClass(this, Tab16Activity.class);
        spec = tabHost.newTabSpec("Frey").setIndicator("Frey")
                      .setContent(intent);
        tabHost.addTab(spec);
        
        intent = new Intent().setClass(this, Tab7Activity.class);
        spec = tabHost.newTabSpec("Tyrell").setIndicator("Tyrell")
                      .setContent(intent);
        tabHost.addTab(spec);

       
    }
}