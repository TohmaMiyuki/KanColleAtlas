package com.example.kancolleatlas.adapter;

import java.util.ArrayList;

import com.example.kancolleatlas.R;
import com.example.kancolleatlas.data.Ship;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ShipClassAdapter extends MyBaseAdapter<Ship> {

	public ShipClassAdapter(Context context, ArrayList<Ship> dataList) {
		super(context, dataList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public View getView(int position, View arg1, ViewGroup arg2) {
		View view = inflater.inflate(R.layout.shipclassalone, null);

		
		TextView nameTextView = (TextView) view.findViewById(R.id.shipName_sc);
		nameTextView.setText(dataList.get(position).getshipName());

		TextView typeTextView = (TextView) view.findViewById(R.id.shipType_sc);
		typeTextView.setText(dataList.get(position).getshipType());
		
		
		return view;
	}

	@Override
	protected void rowSelected(Ship song, int index) {
		// TODO Auto-generated method stub
		
	}

}
