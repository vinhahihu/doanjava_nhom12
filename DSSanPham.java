package qlkttmh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DSSanPham {
    private ArrayList<ThoiTrangMuaHe>danhSach;
    
    public DSSanPham(){
        this.danhSach = new ArrayList<ThoiTrangMuaHe>();
    }
    public DSSanPham(ArrayList<ThoiTrangMuaHe>danhSach){
        this.danhSach = danhSach;
    }
    public void themThoiTrangMuaHe(ThoiTrangMuaHe sp){
        this.danhSach.add(sp);
    }
    public void inDSSanPham(){
        for (ThoiTrangMuaHe thoiTrangMuaHe : danhSach) {
            System.out.println(thoiTrangMuaHe);
        }
    }
    public boolean kiemTraDanhSachRong(){
        return this.danhSach.isEmpty();
    }
    public int laySoLuongSanPham(){
        return this.danhSach.size();
    }
    public void lamRongDanhSach(){
        this.danhSach.removeAll(danhSach);
    }
    public boolean kiemTraTonTai(ThoiTrangMuaHe sp){
        return this.danhSach.contains(sp);
    }
    public boolean xoaSanPham(ThoiTrangMuaHe sp){
        return this.danhSach.remove(sp);
    }
    public void timSanPham(String ten){
        for (ThoiTrangMuaHe thoiTrangMuaHe : danhSach ){
            if(thoiTrangMuaHe.getTenHang().indexOf(ten)>=0){
                System.out.println(thoiTrangMuaHe);
            }
        }
    }
    public void sapXepSanPhamGiamDanTheoGia(){
        Collections.sort(this.danhSach, new Comparator<ThoiTrangMuaHe>() {

            @Override
            public int compare(ThoiTrangMuaHe spo1, ThoiTrangMuaHe spo2) {
                if(spo1.getDonGia()<spo2.getDonGia()){
                    return 1;
                }else if(spo1.getDonGia()>spo2.getDonGia()){
                    return -1;
                }else{
                    return 0;
                }
                
               
                }
            
        });
    }
}
    
