package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class sinhvien_Adapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<Sinh_vien> arraysinhvien;
    public sinhvien_Adapter(Context context, int layout, List<Sinh_vien> sinh_vienList){
        myContext= context;
        myLayout= layout;
        arraysinhvien= sinh_vienList;

    }

    @Override
    public int getCount() {
        return arraysinhvien.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater) myContext.getSystemService(myContext.LAYOUT_INFLATER_SERVICE);
        convertView= inflater.inflate(myLayout,null);
        TextView textView =(TextView) convertView.findViewById(R.id.textViewten);
        textView.setText(arraysinhvien.get(position).HoTen);
        TextView textView1=(TextView) convertView.findViewById(R.id.textViewnamsinh);
        textView1.setText(String.valueOf(arraysinhvien.get(position).NamSinh));
        
        return convertView;
    }
}
