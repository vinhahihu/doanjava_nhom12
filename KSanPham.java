package qlkttmh;
import java.util.Scanner;
public class KSanPham  {
    private String nhaSX;
    private String ngayNhap;
    Scanner input = new Scanner(System.in);
    public KSanPham(){
    }
        public KSanPham(String nhaSX, String ngayNhap){
            this.nhaSX=nhaSX;
            this.ngayNhap=ngayNhap;                 
    }
    public String getNhaSX(){
        return nhaSX;
    }
    public void setNhaSX(String nhaSX){
        this.nhaSX=nhaSX;
    }
    public String getNgayNhap(){
        return ngayNhap;
    }
    public void setNgayNhap(String ngayNhap){
        this.ngayNhap=ngayNhap;
    }
    public void nhap() {
      
        System.out.print("Nhà sản xuất:  ");
        nhaSX = input.next();
        System.out.print("Ngày Nhập: ");
        ngayNhap = input.next();
    }
    public void xuat() {
        System.out.printf("|%-15s|%-15s|%-15s|",nhaSX,ngayNhap);
        
    }


}
