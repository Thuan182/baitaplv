package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewsv;
    ArrayList<Sinh_vien> mangsv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewsv = (ListView) findViewById(R.id.listviewsv);
        mangsv = new ArrayList<Sinh_vien>();
        ImageView a1;
        mangsv.add(new Sinh_vien("Thiều Văn Thuận",2000,null   ));
        mangsv.add(new Sinh_vien("Trần Châu Thành",2001,null   ));
        mangsv.add(new Sinh_vien("Lê Trung Hoa",2000,null   ));
        mangsv.add(new Sinh_vien("Nguyễn Hữu Thành",2000,null   ));
        mangsv.add(new Sinh_vien("Lê Lợi",2000,null   ));
        sinhvien_Adapter adapter =new sinhvien_Adapter(
                MainActivity.this,
                R.layout.dong_sv,
                mangsv
        );
        listViewsv.setAdapter(adapter);

    }
}