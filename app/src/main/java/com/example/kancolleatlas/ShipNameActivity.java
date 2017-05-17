package com.example.kancolleatlas;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.kancolleatlas.data.ShipJson;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class ShipNameActivity extends Activity {
	
	private String shipJsonStr;
	private ImageView shipImg;
	private ImageButton normal;
	private ImageButton broken;
//	private ArrayList<Ship> data;
	
	private int normalImg;
	private int brokenImg;
	
	private TextView hp;
	private TextView armor;
	private TextView fire;
	private TextView torpedo;
	private TextView aac;
	private TextView ass;
	private TextView luck;
	private TextView evasion;
	private TextView speed;
	private TextView range;
	private TextView seek;
	private TextView carry;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shipname);
//		 snlist = (ListView)this.findViewById(R.id.shipName);
//	     Bundle bundle = this.getIntent().getExtras();
//	     int id = bundle.getInt("id");
//       snlist.setText(id+"");
		
		
		
		Bundle bundle = this.getIntent().getExtras();
        //int id = bundle.getInt("id");
        int img = bundle.getInt("img");
	
		normal = (ImageButton)this.findViewById(R.id.normal_ib);
		broken = (ImageButton)this.findViewById(R.id.broken_ib);
        
        hp = (TextView)this.findViewById(R.id.hp_tv);
		armor = (TextView)this.findViewById(R.id.armor_tv);
		fire = (TextView)this.findViewById(R.id.fire_tv);
		torpedo = (TextView)this.findViewById(R.id.torpedo_tv);
		aac = (TextView)this.findViewById(R.id.aac_tv);
		ass = (TextView)this.findViewById(R.id.ass_tv);
		luck = (TextView)this.findViewById(R.id.luck_tv);
		evasion = (TextView)this.findViewById(R.id.evasion_tv);
		speed = (TextView)this.findViewById(R.id.speed_tv);
		range = (TextView)this.findViewById(R.id.range_tv);
		seek = (TextView)this.findViewById(R.id.seek_tv);
		carry = (TextView)this.findViewById(R.id.carry_tv);
		
		//解析json 開始
		
		BufferedReader br = null;
		try{
			InputStream is = getResources().openRawResource(R.raw.shipdata);
			InputStreamReader isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			StringBuilder sb = new StringBuilder();
			String str = br.readLine();
			while (str!=null) {
				sb.append(str+"\n");
				str = br.readLine();
				}
			shipJsonStr = sb.toString();
			}catch(Exception ex){
			
			}finally{
				if(br!=null){
					try {
						br.close();
					} catch (IOException e) {					
						e.printStackTrace();
					}
				}
			}
		
		//測試用
		//testText.setText(shipJsonStr);
		//Log.i("test", shipJsonStr);
		
		//使用gson解析json
		Gson gson = new Gson();
		//Type shipData = new TypeToken<ArrayList<ShipJson>>() {}.getType();
		ShipJson[] shipArr = gson.fromJson(shipJsonStr, ShipJson[].class);					
		shipImg = (ImageView)findViewById(R.id.shipImg);
		
		//解析json結束
		
		//BB
		if(img == R.drawable.yamato){setUi(shipArr,132,R.drawable.yamato, R.drawable.yamato_n ,R.drawable.yamato_b);}		
		else if(img == R.drawable.musashi){setUi(shipArr,144,R.drawable.musashi, R.drawable.musashi_n ,R.drawable.musashi_b);}		
		else if(img == R.drawable.nagato){setUi(shipArr,268,R.drawable.nagato, R.drawable.nagato_n ,R.drawable.nagato_b);}		
		else if(img == R.drawable.mutsu){setUi(shipArr,269,R.drawable.mutsu, R.drawable.mutsu_n ,R.drawable.mutsu_b);}		
		else if(img == R.drawable.kongo2){setUi(shipArr,145,R.drawable.kongo2, R.drawable.kongo2_n ,R.drawable.kongo2_b);}		
		else if(img == R.drawable.hie2){setUi(shipArr,146,R.drawable.hie2, R.drawable.hie2_n ,R.drawable.hie2_b);}		
		else if(img == R.drawable.haruna2){setUi(shipArr,147,R.drawable.haruna2, R.drawable.haruna2_n ,R.drawable.haruna2_b);}
		else if(img == R.drawable.kirishima2){setUi(shipArr,148,R.drawable.kirishima2, R.drawable.kirishima2_n ,R.drawable.kirishima2_b);}
		else if(img == R.drawable.bismarck3){setUi(shipArr,173,R.drawable.bismarck3, R.drawable.bismarck3_n ,R.drawable.bismarck3_b);}
		else if(img == R.drawable.italia){setUi(shipArr,379,R.drawable.italia, R.drawable.italia_n ,R.drawable.italia_b);}
		else if(img == R.drawable.roma){setUi(shipArr,380,R.drawable.roma, R.drawable.roma_n ,R.drawable.roma_b);}
		
		//BBV
		else if(img == R.drawable.fusou2){setUi(shipArr,351,R.drawable.fusou2, R.drawable.fusou2_n ,R.drawable.fusou2_b);}
		else if(img == R.drawable.yamashiro2){setUi(shipArr,352,R.drawable.yamashiro2, R.drawable.yamashiro2_n ,R.drawable.yamashiro2_b);}
		else if(img == R.drawable.ise){setUi(shipArr,78,R.drawable.ise, R.drawable.ise_n ,R.drawable.ise_b);}
		else if(img == R.drawable.hyuuga){setUi(shipArr,84,R.drawable.hyuuga, R.drawable.hyuuga_n ,R.drawable.hyuuga_b);}
		
		//CV
		else if(img == R.drawable.kaga){setUi(shipArr,271,R.drawable.kaga, R.drawable.kaga_n ,R.drawable.kaga_b);}
		else if(img == R.drawable.akagi){setUi(shipArr,270,R.drawable.akagi, R.drawable.akagi_n ,R.drawable.akagi_b);}
		else if(img == R.drawable.souryuu2){setUi(shipArr,192,R.drawable.souryuu2, R.drawable.souryuu2_n ,R.drawable.souryuu2_b);}
		else if(img == R.drawable.hiryuu2){setUi(shipArr,191,R.drawable.hiryuu2, R.drawable.hiryuu2_n ,R.drawable.hiryuu2_b);}
		else if(img == R.drawable.shokaku){setUi(shipArr,281,R.drawable.shokaku, R.drawable.shokaku_n ,R.drawable.shokaku_b);}
		else if(img == R.drawable.zuikaku){setUi(shipArr,108,R.drawable.zuikaku, R.drawable.zuikaku_n ,R.drawable.zuikaku_b);}
		else if(img == R.drawable.unryuu){setUi(shipArr,346,R.drawable.unryuu, R.drawable.unryuu_n ,R.drawable.unryuu_b);}
		else if(img == R.drawable.amagi){setUi(shipArr,367,R.drawable.amagi, R.drawable.amagi_n ,R.drawable.amagi_b);}
		else if(img == R.drawable.katsuragi){setUi(shipArr,368,R.drawable.katsuragi, R.drawable.katsuragi_n ,R.drawable.katsuragi_b);}
		
		//ACV
		else if(img == R.drawable.taihou){setUi(shipArr,152,R.drawable.taihou, R.drawable.taihou_n ,R.drawable.taihou_b);}
		
		//CVL
		else if(img == R.drawable.houshou){setUi(shipArr,278,R.drawable.houshou, R.drawable.houshou_n ,R.drawable.houshou_b);}
		else if(img == R.drawable.ryuujou2){setUi(shipArr,153,R.drawable.ryuujou2, R.drawable.ryuujou2_n ,R.drawable.ryuujou2_b);}
		else if(img == R.drawable.shouhou){setUi(shipArr,70,R.drawable.shouhou, R.drawable.shouhou_n ,R.drawable.shouhou_b);}
		else if(img == R.drawable.zuihou){setUi(shipArr,113,R.drawable.zuihou, R.drawable.zuihou_n ,R.drawable.zuihou_b);}
		else if(img == R.drawable.hiyou){setUi(shipArr,276,R.drawable.hiyou, R.drawable.hiyou_n ,R.drawable.hiyou_b);}
		else if(img == R.drawable.junyou2){setUi(shipArr,348,R.drawable.junyou2, R.drawable.junyou2_n ,R.drawable.junyou2_b);}
		
		//AV
		else if(img == R.drawable.chitose){setUi(shipArr,102,R.drawable.chitose, R.drawable.chitose_n ,R.drawable.chitose_b);}
		else if(img == R.drawable.chiyoda){setUi(shipArr,103,R.drawable.chiyoda, R.drawable.chiyoda_n ,R.drawable.chiyoda_b);}
		else if(img == R.drawable.akitsushima){setUi(shipArr,381,R.drawable.akitsushima, R.drawable.akitsushima_n ,R.drawable.akitsushima_b);}
		
		//CA
		else if(img == R.drawable.furutaka2){setUi(shipArr,356,R.drawable.furutaka2, R.drawable.furutaka2_n ,R.drawable.furutaka2_b);}
		else if(img == R.drawable.kako2){setUi(shipArr,357,R.drawable.kako2, R.drawable.kako2_n ,R.drawable.kako2_b);}
		else if(img == R.drawable.aoba){setUi(shipArr,257,R.drawable.aoba, R.drawable.aoba_n ,R.drawable.aoba_b);}
		else if(img == R.drawable.kinugasa2){setUi(shipArr,138,R.drawable.kinugasa2, R.drawable.kinugasa2_n ,R.drawable.kinugasa2_b);}
		else if(img == R.drawable.myoukou2){setUi(shipArr,309,R.drawable.myoukou2, R.drawable.myoukou2_n ,R.drawable.myoukou2_b);}
		else if(img == R.drawable.nachi2){setUi(shipArr,187,R.drawable.nachi2, R.drawable.nachi2_n ,R.drawable.nachi2_b);}
		else if(img == R.drawable.ashigara2){setUi(shipArr,188,R.drawable.ashigara2, R.drawable.ashigara2_n ,R.drawable.ashigara2_b);}
		else if(img == R.drawable.haguro2){setUi(shipArr,189,R.drawable.haguro2, R.drawable.haguro2_n ,R.drawable.haguro2_b);}
		else if(img == R.drawable.takao){setUi(shipArr,262,R.drawable.takao, R.drawable.takao_n ,R.drawable.takao_b);}
		else if(img == R.drawable.atago){setUi(shipArr,263,R.drawable.atago, R.drawable.atago_n ,R.drawable.atago_b);}
		else if(img == R.drawable.maya2){setUi(shipArr,366,R.drawable.maya2, R.drawable.maya2_n ,R.drawable.maya2_b);}
		else if(img == R.drawable.chokai2){setUi(shipArr,365,R.drawable.chokai2, R.drawable.chokai2_n ,R.drawable.chokai2_b);}
		else if(img == R.drawable.prinz_eugen){setUi(shipArr,172,R.drawable.prinz_eugen, R.drawable.prinz_eugen_n ,R.drawable.prinz_eugen_b);}
		
		//CF
		else if(img == R.drawable.mogami){setUi(shipArr,69,R.drawable.mogami, R.drawable.mogami_n ,R.drawable.mogami_b);}
		else if(img == R.drawable.mikuma){setUi(shipArr,117,R.drawable.mikuma, R.drawable.mikuma_n ,R.drawable.mikuma_b);}
		else if(img == R.drawable.suzuya){setUi(shipArr,125,R.drawable.suzuya, R.drawable.suzuya_n ,R.drawable.suzuya_b);}
		else if(img == R.drawable.kumano){setUi(shipArr,126,R.drawable.kumano, R.drawable.kumano_n ,R.drawable.kumano_b);}
		else if(img == R.drawable.tone2){setUi(shipArr,183,R.drawable.tone2, R.drawable.tone2_n ,R.drawable.tone2_b);}
		else if(img == R.drawable.chikuma2){setUi(shipArr,184,R.drawable.chikuma2, R.drawable.chikuma2_n ,R.drawable.chikuma2_b);}
		
		//CL
		else if(img == R.drawable.tenryuu){setUi(shipArr,206,R.drawable.tenryuu, R.drawable.tenryuu_n ,R.drawable.tenryuu_b);}
		else if(img == R.drawable.tatsuta){setUi(shipArr,207,R.drawable.tatsuta, R.drawable.tatsuta_n ,R.drawable.tatsuta_b);}
		else if(img == R.drawable.kuma){setUi(shipArr,208,R.drawable.kuma, R.drawable.kuma_n ,R.drawable.kuma_b);}
		else if(img == R.drawable.tama){setUi(shipArr,209,R.drawable.tama, R.drawable.tama_n ,R.drawable.tama_b);}
		else if(img == R.drawable.nagara){setUi(shipArr,211,R.drawable.nagara, R.drawable.nagara_n ,R.drawable.nagara_b);}
		else if(img == R.drawable.isuzu2){setUi(shipArr,212,R.drawable.isuzu2, R.drawable.isuzu2_n ,R.drawable.isuzu2_b);}
		else if(img == R.drawable.natori){setUi(shipArr,214,R.drawable.natori, R.drawable.natori_n ,R.drawable.natori_b);}
		else if(img == R.drawable.yura){setUi(shipArr,213,R.drawable.yura, R.drawable.yura_n ,R.drawable.yura_b);}
		else if(img == R.drawable.kinu){setUi(shipArr,282,R.drawable.kinu, R.drawable.kinu_n ,R.drawable.kinu_b);}
		else if(img == R.drawable.abukuma2){setUi(shipArr,193,R.drawable.abukuma2, R.drawable.abukuma2_n ,R.drawable.abukuma2_b);}
		else if(img == R.drawable.yuubari){setUi(shipArr,286,R.drawable.yuubari, R.drawable.yuubari_n ,R.drawable.yuubari_b);}
		else if(img == R.drawable.ooyodo){setUi(shipArr,311,R.drawable.ooyodo, R.drawable.ooyodo_n ,R.drawable.ooyodo_b);}
		else if(img == R.drawable.sendai2){setUi(shipArr,154,R.drawable.sendai2, R.drawable.sendai2_n ,R.drawable.sendai2_b);}
		else if(img == R.drawable.jintsuu2){setUi(shipArr,155,R.drawable.jintsuu2, R.drawable.jintsuu2_n ,R.drawable.jintsuu2_b);}
		else if(img == R.drawable.naka2){setUi(shipArr,156,R.drawable.naka2, R.drawable.naka2_n ,R.drawable.naka2_b);}
		else if(img == R.drawable.agano){setUi(shipArr,296,R.drawable.agano, R.drawable.agano_n ,R.drawable.agano_b);}
		else if(img == R.drawable.noshiro){setUi(shipArr,297,R.drawable.noshiro, R.drawable.noshiro_n ,R.drawable.noshiro_b);}
		else if(img == R.drawable.yahagi){setUi(shipArr,298,R.drawable.yahagi, R.drawable.yahagi_n ,R.drawable.yahagi_b);}
		else if(img == R.drawable.sakawa){setUi(shipArr,305,R.drawable.sakawa, R.drawable.sakawa_n ,R.drawable.sakawa_b);}
		
		//CLT
		else if(img == R.drawable.kitakami2){setUi(shipArr,115,R.drawable.kitakami2, R.drawable.kitakami2_n ,R.drawable.kitakami2_b);}
		else if(img == R.drawable.ooi2){setUi(shipArr,114,R.drawable.ooi2, R.drawable.ooi2_n ,R.drawable.ooi2_b);}
		else if(img == R.drawable.kiso2){setUi(shipArr,142,R.drawable.kiso2, R.drawable.kiso2_n ,R.drawable.kiso2_b);}
		
		//PCL
		else if(img == R.drawable.katori){setUi(shipArr,324,R.drawable.katori, R.drawable.katori_n ,R.drawable.katori_b);}
		
		
		//DD
		else if(img == R.drawable.fubuki2){setUi(shipArr,364,R.drawable.fubuki2, R.drawable.fubuki2_n ,R.drawable.fubuki2_b);}
		else if(img == R.drawable.murakumo2){setUi(shipArr,359,R.drawable.murakumo2, R.drawable.murakumo2_n ,R.drawable.murakumo2_b);}
		else if(img == R.drawable.ayanami2){setUi(shipArr,190,R.drawable.ayanami2, R.drawable.ayanami2_n ,R.drawable.ayanami2_b);}
		else if(img == R.drawable.ushio2){setUi(shipArr,347,R.drawable.ushio2, R.drawable.ushio2_n ,R.drawable.ushio2_b);}
		else if(img == R.drawable.akatsuki2){setUi(shipArr,374,R.drawable.akatsuki2, R.drawable.akatsuki2_n ,R.drawable.akatsuki2_b);}
		else if(img == R.drawable.bep){setUi(shipArr,143,R.drawable.bep, R.drawable.bep_n ,R.drawable.bep_b);}
		else if(img == R.drawable.hatsuharu2){setUi(shipArr,316,R.drawable.hatsuharu2, R.drawable.hatsuharu2_n ,R.drawable.hatsuharu2_b);}
		else if(img == R.drawable.hatsushimo2){setUi(shipArr,358,R.drawable.hatsushimo2, R.drawable.hatsushimo2_n ,R.drawable.hatsushimo2_b);}
		else if(img == R.drawable.shigure2){setUi(shipArr,141,R.drawable.shigure2, R.drawable.shigure2_n ,R.drawable.shigure2_b);}
		else if(img == R.drawable.yuudaichi2){setUi(shipArr,140,R.drawable.yuudaichi2, R.drawable.yuudaichi2_n ,R.drawable.yuudaichi2_b);}
		else if(img == R.drawable.yukikaze){setUi(shipArr,221,R.drawable.yukikaze, R.drawable.yukikaze_n ,R.drawable.yukikaze_b);}
		else if(img == R.drawable.shimakaze){setUi(shipArr,222,R.drawable.shimakaze, R.drawable.shimakaze_n ,R.drawable.shimakaze_b);}
		
		//SS
		else if(img == R.drawable.i168){setUi(shipArr,338,R.drawable.i168, R.drawable.i168_n ,R.drawable.i168_b);}
		else if(img == R.drawable.i8){setUi(shipArr,340,R.drawable.i8, R.drawable.i8_n ,R.drawable.i8_b);}
		else if(img == R.drawable.i19){setUi(shipArr,341,R.drawable.i19, R.drawable.i19_n ,R.drawable.i19_b);}
		else if(img == R.drawable.i58){setUi(shipArr,339,R.drawable.i58, R.drawable.i58_n ,R.drawable.i58_b);}
		else if(img == R.drawable.i401){setUi(shipArr,343,R.drawable.i401, R.drawable.i401_n ,R.drawable.i401_b);}
		else if(img == R.drawable.u511){setUi(shipArr,369,R.drawable.u511, R.drawable.u511_n ,R.drawable.u511_b);}
		else if(img == R.drawable.ro500){setUi(shipArr,373,R.drawable.ro500, R.drawable.ro500_n ,R.drawable.ro500_b);}
		else if(img == R.drawable.maruyu){setUi(shipArr,158,R.drawable.maruyu, R.drawable.maruyu_n ,R.drawable.maruyu_b);}
		
		//OTHER
		else if(img == R.drawable.akitsumaru){setUi(shipArr,161,R.drawable.akitsumaru, R.drawable.akitsumaru_n ,R.drawable.akitsumaru_b);}
		else if(img == R.drawable.akashi){setUi(shipArr,182,R.drawable.akashi, R.drawable.akashi_n ,R.drawable.akashi_b);}
		else if(img == R.drawable.taigei){setUi(shipArr,179,R.drawable.taigei, R.drawable.taige_n ,R.drawable.taige_b);}
				
		initImg();
		
	}

	private void setUi(ShipJson[] shipArr,int index,int ImageId, int normalId, int brokenId) {
		normalImg = normalId;
		brokenImg = brokenId;
		shipImg.setImageDrawable(getResources().getDrawable(ImageId));
		//normal.setImageDrawable(getResources().getDrawable(normalId));
		//broken.setImageDrawable(getResources().getDrawable(brokenId));
		hp.setText(shipArr[index].getHp());
		armor.setText(shipArr[index].getMax_armor());
		fire.setText(shipArr[index].getMax_fire());
		torpedo.setText(shipArr[index].getMax_torpedo());
		aac.setText(shipArr[index].getMax_aac());
		ass.setText(shipArr[index].getMax_ass());
		luck.setText(shipArr[index].getLuck() + "/" + shipArr[index].getMax_luck());
		evasion.setText(shipArr[index].getMax_evasion());
		speed.setText(shipArr[index].getSpeed());
		range.setText(shipArr[index].getRange());
		seek.setText(shipArr[index].getMax_seek());
		carry.setText(shipArr[index].getCarry());
	}
	
	
	private void initImg() {
		
		normal = (ImageButton) findViewById(R.id.normal_ib);	
		normal.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				Intent it = new Intent();
				it.setClass(ShipNameActivity.this, NormalImgActivity.class);
				
				//addImgData();
				Bundle bundle=new Bundle();
				bundle.putInt("img", normalImg);
				it.putExtras(bundle);
				
				startActivity(it);
			}
		});
		
		broken = (ImageButton) findViewById(R.id.broken_ib);	
		broken.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				Intent it = new Intent();
				it.setClass(ShipNameActivity.this, BrokenImgActivity.class);
				
				Bundle bundle=new Bundle();
				bundle.putInt("img", brokenImg);
				it.putExtras(bundle);
				
				startActivity(it);
			}
		});
		
	}
	
	
	
	
	
	
}
