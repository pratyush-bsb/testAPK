package com.example.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Splash extends Activity{

	@Override
	protected void onCreate(Bundle abc) {
		// TODO Auto-generated method stub
		super.onCreate(abc);
		setContentView(R.layout.splash);
		
		Button b=(Button)findViewById(R.id.cal);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent openStartingPoint=new Intent("com.example.myapp.MENU");
				startActivity(openStartingPoint);	
				
			}
		});
				
	
		
	}

}
