package com.example.kancolleatlas;

import com.example.kancolleatlas.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.content.Intent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;


public class MainActivity extends Activity {
	
	private ImageButton startImg;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        
        //twitter嵌入
      	initTwitter();
      	
      	//點圖進圖艦
      	initAltas();
        
	}
	
	private void initTwitter() {
		WebView myWebView = (WebView) findViewById(R.id.webView);
		myWebView.setWebViewClient(new MyWebViewClient());
		myWebView.getSettings().setJavaScriptEnabled(true); 
        myWebView.requestFocus();
        //開啟本地html權限
        WebSettings settings = myWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        myWebView.loadUrl("file:///android_asset/webViewTwitter.html");
        //直接開webview的失敗錯法
        //myWebView.loadUrl("https://twitter.com/KanColle_STAFF");
        
        // 擷取twitter的js code
        //<a class="twitter-timeline"  href="https://twitter.com/KanColle_STAFF" data-widget-id="674473195655696384">@KanColle_STAFF 發送的推文</a><script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);}}(document,"script","twitter-wjs");</script>		
	}
	
	//點start換頁
	private void initAltas() {
		startImg = (ImageButton) findViewById(R.id.img_start);	
		startImg.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				Intent it = new Intent();
				it.setClass(MainActivity.this, ShipTypeActivity.class);
				startActivity(it);
			}
		});	
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	//webview設定
	private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
	
	
	
}
