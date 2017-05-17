package com.example.kancolleatlas.adapter;

import java.util.ArrayList;

import com.example.kancolleatlas.R;
import com.example.kancolleatlas.data.Ship;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ShipTypeAdapter extends MyBaseAdapter<Ship> {

	public ShipTypeAdapter(Context context, ArrayList<Ship> dataList) {
		super(context, dataList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public View getView(int position, View arg1, ViewGroup arg2) {
		View view = inflater.inflate(R.layout.shiptypealone, null);

		
		Ship data = dataList.get(position);
		TextView nameTextView = (TextView) view.findViewById(R.id.shipName);
		nameTextView.setText(data.getshipName());
		
		TextView typeTextView = (TextView) view.findViewById(R.id.shipType);
		typeTextView.setText(data.getshipType());
		
		ImageView img = (ImageView) view.findViewById(R.id.type_img);
		if(position == 0){img.setImageResource(R.drawable.bbtype);}
		else if(position == 1){img.setImageResource(R.drawable.bbvtype);}
		else if(position == 2){img.setImageResource(R.drawable.cvtype);}
		else if(position == 3){img.setImageResource(R.drawable.acvtype);}
		else if(position == 4){img.setImageResource(R.drawable.cvltype);}
		else if(position == 5){img.setImageResource(R.drawable.avtype);}
		else if(position == 6){img.setImageResource(R.drawable.catype);}
		else if(position == 7){img.setImageResource(R.drawable.cftype);}
		else if(position == 8){img.setImageResource(R.drawable.cltype);}
		else if(position == 9){img.setImageResource(R.drawable.clttype);}
		else if(position ==10){img.setImageResource(R.drawable.pcltype);}
		else if(position ==11){img.setImageResource(R.drawable.ddtype);}
		else if(position ==12){img.setImageResource(R.drawable.sstype);}
		else if(position ==13){}
		
		return view;
	}

	@Override
	protected void rowSelected(Ship song, int index) {
		// TODO Auto-generated method stub
		
	}

}
