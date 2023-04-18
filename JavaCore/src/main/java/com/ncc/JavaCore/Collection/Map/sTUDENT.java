package com.ncc.JavaCore.Collection.Map;

import java.util.ArrayList;

public class sTUDENT {
    private int tUOI;
    private String Ngaysinh;
    private String ten;

    public sTUDENT(int tUOI, String Ngaysinh, String ten) {
        this.tUOI = tUOI;
        this.Ngaysinh = Ngaysinh;
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "sTUDENT{" +
                "tUOI=" + tUOI +
                ", Ngaysinh='" + Ngaysinh + '\'' +
                ", ten='" + ten + '\'' +
                '}';
    }
}
