package com.example.myapp;

import android.R.color;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class TextPlay extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text);
		
		Button checkCmd=(Button)findViewById(R.id.bResults);
		final ToggleButton passTog=(ToggleButton)findViewById(R.id.tbPassword);
		final EditText input=(EditText)findViewById(R.id.etCommands);
		final TextView display=(TextView)findViewById(R.id.tvResults);
		passTog.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(passTog.isChecked())
				{
					input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
				}
				
				else
				{
					input.setInputType(InputType.TYPE_CLASS_TEXT);
				}
				
				
			}
					
		});
		
		checkCmd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String check=input.getText()+"";
				display.setText(check);
				if(check.contentEquals("left"))
				{
					display.setGravity(Gravity.LEFT);
					display.setText(check);
					
			 	}
				else if(check.contentEquals("right"))
						{
					display.setText(check);
					display.setGravity(Gravity.RIGHT);
					
						}
				else if(check.contentEquals("center"))
						{
					display.setText(check);
					display.setGravity(Gravity.CENTER);
				
						}
				else if(check.contentEquals("blue"))
				{		
					display.setText(check);
			display.setBackgroundColor(color.holo_blue_bright);
			display.setTextColor(Color.BLUE);
				}
				else
				{
				
					display.setTextColor(Color.BLACK);
					display.setBackgroundColor(color.white);
					
				}
				{
					
				}
			}
		});
		
	}}
