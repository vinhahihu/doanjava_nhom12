package qlkttmh;
import java.util.Scanner;
public class PhuKien extends ThoiTrangMuaHe {
    private String ngaySX;
    private String nhaCungCap;
    
    public PhuKien(){
    }
        public PhuKien(String ngaySX, String nhaCungCap){
            this.ngaySX=ngaySX;
            this.nhaCungCap=nhaCungCap;                 
    }
    public String getNgaySX(){
        return ngaySX;
    }
    public void setNgaySX(String ngaySX){
        this.ngaySX=ngaySX;
    }
    public String getNhaCungCap(){
        return nhaCungCap;
    }
    public void setNhaCungCap(String nhaCungCap){
        this.nhaCungCap=nhaCungCap;
    }
    @Override
    public void nhap() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ngày Sản Xuất: ");
            ngaySX = sc.next();
            System.out.print("Nhà Cung Cấp: ");
            nhaCungCap = sc.next();
        }
    }
    @Override
    public void xuat() {
        System.out.println("\n{ngaySX: "+ getNgaySX()+",nhaCungCap: " + getNhaCungCap()+"}");
        
    }
}