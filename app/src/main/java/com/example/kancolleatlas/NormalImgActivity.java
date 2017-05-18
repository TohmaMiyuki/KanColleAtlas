package com.example.kancolleatlas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class NormalImgActivity extends Activity {
	
	private ImageButton normal;
	Intent it;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.normalimg);
		
		Bundle bundle = this.getIntent().getExtras();
        int img = bundle.getInt("img");
        
        normal = (ImageButton)findViewById(R.id.normalImg);
        normal.setImageDrawable(getResources().getDrawable(img));

		normal.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				NormalImgActivity.this.setResult(RESULT_OK, it);
				NormalImgActivity.this.finish();

			}
		});

	}
	
	
	
	
	
}
