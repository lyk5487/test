package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnClickListener {

	private Button button;
	private ImageView imageView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button) findViewById(R.id.button_main);
		button.setOnClickListener(this);
		imageView = (ImageView) findViewById(R.id.imageview_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		
		// i change sth 1
		// i change sth 2
		
		
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.button_main:
				imageView.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bottom2top));
				break;

			default:
				break;
		}
	}

}
