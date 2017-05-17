package com.example.kancolleatlas;


import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.example.kancolleatlas.adapter.ShipClassAdapter;
import com.example.kancolleatlas.data.Ship;


public class ShipClassActivity extends Activity {

		private ListView sclist;
		private ArrayList<Ship> data;
//		private String shipJsonStr;
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.shipclass);
							
			
			Bundle bundle = this.getIntent().getExtras();
	        int id = bundle.getInt("id");
	        if(id == 0){ initBBData(); }
	        else if(id == 1){ initBBVData(); }
	        else if(id == 2){ initCVData(); }
	        else if(id == 3){ initACVData(); }
	        else if(id == 4){ initCVLData(); }
	        else if(id == 5){ initAVData(); }
	        else if(id == 6){ initCAData(); }
	        else if(id == 7){ initCFData(); }
	        else if(id == 8){ initCLData(); }
	        else if(id == 9){ initCLTData(); }	        
	        else if(id ==10){ initPCLData(); }
	        else if(id ==11){ initDDData(); }
	        else if(id ==12){ initSSData(); }
	        else if(id ==13){ initOTHERData(); }

	        	        
	        initView();
	        initHandler();
	        
		}

		

		private void initHandler() {
			sclist.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					
					Intent it = new Intent();
					
					Bundle bundle=new Bundle();		            					
		            Ship ship = data.get(arg2);
		            bundle.putString("name", ship.getshipName());
					bundle.putInt("img", ship.getshipImg());
					bundle.putInt("position", arg2);		            
					it.putExtras(bundle);					
					
					it.setClass(ShipClassActivity.this, ShipNameActivity.class);
					startActivity(it);
				}
			});
		}

		private void initView() {		
			sclist = (ListView) findViewById(R.id.shipClass_lv);
			ShipClassAdapter adapter = new ShipClassAdapter(this, data);
			sclist.setAdapter(adapter);
		}

		private void initBBData() {
			data = new ArrayList<Ship>();
			data.add(new Ship("大和", "大和型一號艦", R.drawable.yamato));
			data.add(new Ship("武藏", "大和型二號艦", R.drawable.musashi));
			data.add(new Ship("長門", "長門型一號艦", R.drawable.nagato));
			data.add(new Ship("陸奧", "長門型二號艦", R.drawable.mutsu));
			data.add(new Ship("金剛", "金剛型一號艦", R.drawable.kongo2));
			data.add(new Ship("比叡", "金剛型二號艦", R.drawable.hie2));
			data.add(new Ship("榛名", "金剛型三號艦", R.drawable.haruna2));
			data.add(new Ship("霧島", "金剛型四號艦", R.drawable.kirishima2));
			data.add(new Ship("Bismarck", "Bismarck級一號艦", R.drawable.bismarck3));
			data.add(new Ship("Italia", "Italia級一號艦", R.drawable.italia));
			data.add(new Ship("Roma", "Italia級二號艦", R.drawable.roma));			
		}
		
		private void initBBVData() {
			data = new ArrayList<Ship>();
			data.add(new Ship("伊勢", "伊勢型一號艦", R.drawable.ise));
			data.add(new Ship("日向", "伊勢型二號艦", R.drawable.hyuuga));
			data.add(new Ship("扶桑", "扶桑型一號艦", R.drawable.fusou2));
			data.add(new Ship("山城", "扶桑型二號艦", R.drawable.yamashiro2));
		}
		
		private void initCVData() {
			data = new ArrayList<Ship>();
			data.add(new Ship("加賀", "加賀型一號艦", R.drawable.kaga));
			data.add(new Ship("赤城", "赤城型一號艦", R.drawable.akagi));
			data.add(new Ship("蒼龍", "蒼龍型一號艦", R.drawable.souryuu2));
			data.add(new Ship("飛龍", "飛龍型一號艦", R.drawable.hiryuu2));
			data.add(new Ship("翔鶴", "翔鶴型一號艦", R.drawable.shokaku));
			data.add(new Ship("瑞鶴", "翔鶴型二號艦", R.drawable.zuikaku));
			data.add(new Ship("雲龍", "雲龍型一號艦", R.drawable.unryuu));
			data.add(new Ship("天城", "雲龍型二號艦", R.drawable.amagi));
			data.add(new Ship("葛城", "雲龍型三號艦", R.drawable.katsuragi));
		}
		

		private void initACVData() {
			data = new ArrayList<Ship>();
			data.add(new Ship("大鳳", "大鳳型一號艦", R.drawable.taihou));
		}
		
		private void initCVLData() {
			data = new ArrayList<Ship>();
			data.add(new Ship("鳳翔", "鳳翔型一號艦", R.drawable.houshou));
			data.add(new Ship("龍驤", "龍驤型一號艦", R.drawable.ryuujou2));
			data.add(new Ship("祥鳳", "祥鳳型一號艦", R.drawable.shouhou));
			data.add(new Ship("瑞鳳", "祥鳳型二號艦", R.drawable.zuihou));
			data.add(new Ship("飛鷹", "飛鷹型一號艦", R.drawable.hiyou));
			data.add(new Ship("隼鷹", "飛鷹型二號艦", R.drawable.junyou2));			
		}
		
		private void initAVData() {
			data = new ArrayList<Ship>();
			data.add(new Ship("千歲甲", "千歲型一號艦", R.drawable.chitose));
			data.add(new Ship("千代田甲", "千歲型一號艦", R.drawable.chiyoda));
			data.add(new Ship("秋津洲", "秋津洲型一號艦", R.drawable.akitsushima));
		}		
		
		private void initCAData() {
			data = new ArrayList<Ship>();
			data.add(new Ship("古鷹", "古鷹型一號艦", R.drawable.furutaka2));
			data.add(new Ship("加古", "古鷹型二號艦", R.drawable.kako2));
			data.add(new Ship("青葉", "青葉型一號艦", R.drawable.aoba));
			data.add(new Ship("衣笠", "衣笠型一號艦", R.drawable.kinugasa2));
			data.add(new Ship("妙高", "妙高型一號艦", R.drawable.myoukou2));
			data.add(new Ship("那智", "妙高型二號艦", R.drawable.nachi2));
			data.add(new Ship("足柄", "妙高型三號艦", R.drawable.ashigara2));
			data.add(new Ship("羽黑", "妙高型四號艦", R.drawable.haguro2));
			data.add(new Ship("高雄", "高雄型一號艦", R.drawable.takao));
			data.add(new Ship("愛宕", "高雄型二號艦", R.drawable.atago));
			data.add(new Ship("摩耶", "高雄型三號艦", R.drawable.maya2));
			data.add(new Ship("鳥海", "高雄型四號艦", R.drawable.chokai2));
			data.add(new Ship("Prinz Eugen", "Admiral Hipper級三號艦", R.drawable.prinz_eugen));
		}
		
		private void initCFData() {
			data = new ArrayList<Ship>();
			data.add(new Ship("最上", "最上型一號艦", R.drawable.mogami));
			data.add(new Ship("三隈", "最上型二號艦", R.drawable.mikuma));
			data.add(new Ship("鈴谷", "最上型三號艦", R.drawable.suzuya));
			data.add(new Ship("熊野", "最上型四號艦", R.drawable.kumano));
			data.add(new Ship("利根", "利根型一號艦", R.drawable.tone2));
			data.add(new Ship("筑摩", "利根型二號艦", R.drawable.chikuma2));			
		}
		
		private void initCLData() {
			data = new ArrayList<Ship>();
			data.add(new Ship("天龍", "天龍型一號艦", R.drawable.tenryuu));
			data.add(new Ship("龍田", "天龍型二號艦", R.drawable.tatsuta));
			data.add(new Ship("球磨", "球磨型一號艦", R.drawable.kuma));
			data.add(new Ship("多磨", "球磨型二號艦", R.drawable.tama));
			data.add(new Ship("長良", "長良型一號艦", R.drawable.nagara));
			data.add(new Ship("五十鈴", "長良型二號艦", R.drawable.isuzu2));
			data.add(new Ship("名取", "長良型三號艦", R.drawable.natori));
			data.add(new Ship("由良", "長良型四號艦", R.drawable.yura));
			data.add(new Ship("鬼怒", "長良型五號艦", R.drawable.kinu));
			data.add(new Ship("阿武隈", "長良型六號艦", R.drawable.abukuma2));
			data.add(new Ship("夕張", "夕張型一號艦", R.drawable.yuubari));
			data.add(new Ship("大淀", "大淀型一號艦", R.drawable.ooyodo));
			data.add(new Ship("川內", "川內型一號艦", R.drawable.sendai2));
			data.add(new Ship("神通", "川內型二號艦", R.drawable.jintsuu2));
			data.add(new Ship("那珂", "川內型三號艦", R.drawable.naka2));
			data.add(new Ship("阿賀野", "阿賀野型一號艦", R.drawable.agano));
			data.add(new Ship("能代", "阿賀野型二號艦", R.drawable.noshiro));
			data.add(new Ship("矢矧", "阿賀野型三號艦", R.drawable.yahagi));
			data.add(new Ship("酒匂", "阿賀野型四號艦", R.drawable.sakawa));						
		}
		
		private void initCLTData() {
			data = new ArrayList<Ship>();
			data.add(new Ship("北上", "球磨型三號艦", R.drawable.kitakami2));
			data.add(new Ship("大井", "球磨型四號艦", R.drawable.ooi2));	
			data.add(new Ship("木曾", "球磨型五號艦", R.drawable.kiso2));		
		}
		
		private void initPCLData() {
			data = new ArrayList<Ship>();
			data.add(new Ship("香取", "香取型一號艦", R.drawable.katori));			
		}

		private void initDDData() {
			data = new ArrayList<Ship>();
			data.add(new Ship("吹雪", "吹雪型一號艦", R.drawable.fubuki2));
			data.add(new Ship("叢雲", "吹雪型五號艦", R.drawable.murakumo2));
			data.add(new Ship("綾波", "綾波型一號艦", R.drawable.ayanami2));
			data.add(new Ship("潮", "綾波型十號艦", R.drawable.ushio2));
			data.add(new Ship("曉", "曉型一號艦", R.drawable.akatsuki2));
			data.add(new Ship("Верный", "曉型二號艦", R.drawable.bep));
			data.add(new Ship("初春", "初春型一號艦", R.drawable.hatsuharu2));
			data.add(new Ship("初霜", "初春型四號艦", R.drawable.hatsushimo2));
			data.add(new Ship("時雨", "白露型二號艦", R.drawable.shigure2));
			data.add(new Ship("夕立", "白露型四號艦", R.drawable.yuudaichi2));
			data.add(new Ship("雪風", "陽炎型八號艦", R.drawable.yukikaze));
			data.add(new Ship("島風", "島風型一號艦", R.drawable.shimakaze));
		}
		
		private void initSSData() {
			data = new ArrayList<Ship>();
			data.add(new Ship("伊168", "海大VI型一號艦", R.drawable.i168));
			data.add(new Ship("伊8", "巡潜３型一號艦", R.drawable.i8));
			data.add(new Ship("伊19", "巡潜乙型一號艦", R.drawable.i19));
			data.add(new Ship("伊58", "巡潜乙型改二一號艦", R.drawable.i58));
			data.add(new Ship("伊401", "潜特型一號艦", R.drawable.i401));
			data.add(new Ship("U-511", "UボlトIXC型一號艦", R.drawable.u511));
			data.add(new Ship("呂500", "呂号潜水艦一號艦", R.drawable.ro500));
			data.add(new Ship("まるゆ", "三式潜航輸送艇", R.drawable.maruyu));			
		}
		
		private void initOTHERData() {
			data = new ArrayList<Ship>();
			data.add(new Ship("あきつ丸", "特種船丙型一號艦", R.drawable.akitsumaru));
			data.add(new Ship("明石", "工作艦", R.drawable.akashi));
			data.add(new Ship("大鯨", "潛水母艦", R.drawable.taigei));		
		}


		
		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.main, menu);
			return true;
		}
}
