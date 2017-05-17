package com.example.kancolleatlas;

import com.example.kancolleatlas.adapter.ShipTypeAdapter;
import com.example.kancolleatlas.data.Ship;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import java.util.ArrayList;
import android.widget.AdapterView;
import android.widget.ListView;

public class ShipTypeActivity extends Activity {
	
	private ListView stlist;
	private ArrayList<Ship> data;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shiptype);
		initData();
		initView();
		initHandler();
	}

	private void initHandler() {
		
		stlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {

				Intent it = new Intent();
				Bundle bundle=new Bundle();
	            bundle.putInt("id", arg2);
	            it.putExtras(bundle);
				it.setClass(ShipTypeActivity.this, ShipClassActivity.class);
				startActivity(it);
			}
		});
	}

	private void initView() {
		stlist = (ListView) findViewById(R.id.shipType_lv);
		ShipTypeAdapter adapter = new ShipTypeAdapter(this, data);
		stlist.setAdapter(adapter);
	}

	private void initData() {
		data = new ArrayList<Ship>();
		data.add(new Ship("戰艦", "", 0));
		data.add(new Ship("航空戰艦", "", 0));
		data.add(new Ship("正規空母", "", 0));
		data.add(new Ship("裝甲空母", "", 0));
		data.add(new Ship("輕空母", "", 0));
		data.add(new Ship("水上機母艦", "", 0));
		data.add(new Ship("重巡洋艦", "", 0));
		data.add(new Ship("航空巡洋艦", "", 0));
		data.add(new Ship("輕巡洋艦", "", 0));
		data.add(new Ship("重雷裝巡洋艦", "", 0));
		data.add(new Ship("練習巡洋艦", "", 0));
		data.add(new Ship("驅逐艦", "", 0));
		data.add(new Ship("潛水艦", "", 0));
		data.add(new Ship("其他分類", "", 0));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
