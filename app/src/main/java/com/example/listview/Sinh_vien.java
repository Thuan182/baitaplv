package com.example.listview;

import android.widget.ImageView;

public class Sinh_vien {
    public String HoTen;
    public Integer NamSinh;
    public ImageView anh;

    public Sinh_vien(String hoTen, Integer namSinh, ImageView anh) {
        HoTen = hoTen;
        NamSinh = namSinh;
        this.anh = anh;
    }
}
