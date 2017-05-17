package com.example.kancolleatlas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class BrokenImgActivity extends Activity {
	
	private ImageButton broken;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.brokenimg);
		
		Bundle bundle = this.getIntent().getExtras();
        int img = bundle.getInt("img");
        
        broken = (ImageButton)findViewById(R.id.brokenImg);
        broken.setImageDrawable(getResources().getDrawable(img));

		broken.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				BrokenImgActivity.this.setResult(RESULT_OK, intent);
				BrokenImgActivity.this.finish();

			}
		});


		
	}
	
}
