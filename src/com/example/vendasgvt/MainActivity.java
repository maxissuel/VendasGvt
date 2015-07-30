/**@author maxissuel
 * */
package com.example.vendasgvt;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	
	ConectaLocal tv, telefonia, banda;
	Spinner spnTv, spnBanda, spnTel;
	TextView txtvalor1, txtvalor2, txtvalor3;
	CheckBox check1,check2,check3,check4,check5,check6;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
//		tv = new ConectaLocal(this, "TV");
//		telefonia = new ConectaLocal(this, "TELEFONIA");
//		banda = new ConectaLocal(this, "BANDA");
		
		ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.telefonia,android.R.layout.simple_spinner_item);
		ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.banda,android.R.layout.simple_spinner_item);
		ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.tv,android.R.layout.simple_spinner_item);
		
		spnTel = (Spinner)findViewById(R.id.spnTel);
		spnTel.setAdapter(adapter1);
		spnBanda = (Spinner)findViewById(R.id.spnBanda);
		spnBanda.setAdapter(adapter2);
		spnTv = (Spinner)findViewById(R.id.spnTv);
		spnTv.setAdapter(adapter3);
		
		txtvalor1 = (TextView)findViewById(R.id.txtvalor1);
		
		check1 = (CheckBox)findViewById(R.id.checkBox1);
		check1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				atualizaPreco();
				
			}
		});
		check2 = (CheckBox)findViewById(R.id.checkBox2);
		check2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				atualizaPreco();
				
			}
		});
		check3 = (CheckBox)findViewById(R.id.checkBox3);
		check3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				atualizaPreco();
				
			}
		});
		check4 = (CheckBox)findViewById(R.id.checkBox4);
		check4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				atualizaPreco();
				
			}
		});
		check5 = (CheckBox)findViewById(R.id.checkBox5);
		check5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				atualizaPreco();
				
			}
		});
		check6 = (CheckBox)findViewById(R.id.checkBox6);
		check6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				atualizaPreco();
				
			}
		});
	}
	
	public void atualizaPreco(){
		txtvalor1.setText("123");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
