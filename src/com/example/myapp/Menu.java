package com.example.myapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity{

	
	String classes[]={"MainActivity","Splash","TextPlay","example2","example3","example4","example5","example6"};
	
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Menu.this,android.R.layout.simple_list_item_1,classes));
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		String cheese=classes[position];
		super.onListItemClick(l, v, position, id);
		Class ourClass = null;
		try {
			ourClass = Class.forName("com.example.myapp."+ cheese);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Intent ourIntent=new Intent(Menu.this,ourClass);
		startActivity(ourIntent);
	}
	

}
