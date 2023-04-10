package qlkttmh;


import java.util.Objects;
import java.util.Scanner;

public class ThoiTrangMuaHe implements Comparable<ThoiTrangMuaHe> {
	private String maHang;
	private String tenHang;
	private double donGia;
	private long slTon;
	public ThoiTrangMuaHe(){
	}

public ThoiTrangMuaHe(String maHang, String tenHang, double donGia,long slTon){
	this.maHang=maHang;
	this.tenHang=tenHang;
	this.donGia=donGia;
        this.slTon=slTon;
}

public ThoiTrangMuaHe(String maHang) {
}

public String getMaHang(){
    return maHang;
}
public void setMaHang(String maHang){
    this.maHang=maHang;
}
public  String getTenHang(){
	return tenHang;
}
public void setTenHang(String tenHang) {
	this.tenHang=tenHang;
}
public double getDonGia() {
	return donGia;
}
public void setDonGia(double donGia) {
	this.donGia=donGia;
}
public long getslTon() {
	return slTon;
}
public void setslTon(long slTon) {
	this.slTon=slTon;
}
public void nhap(){
	try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Mã Sản Phẩm:    ");
		maHang=sc.nextLine();
		System.out.print("Tên Sản Phẩm:    ");
		tenHang=sc.nextLine();
		System.out.print("Giá:       ");
		donGia=Double.parseDouble(sc.nextLine());
		System.out.print("Số Lượng tồn:    ");
		slTon=sc.nextLong();
	}
}

public void xuat() {

	System.out.println("\n{maHang:"+ getMaHang() + ", tenHang:"+ getTenHang() +", donGia: "+ getDonGia()+", slTon:"+ getslTon()+"}");

}

@Override
public String toString() {
	return "ThoiTrangMuaHe{" + "maHang=" + maHang + ", tenHang=" + tenHang + ", donGia=" + donGia + ", slTon=" + slTon + '}';
}

@Override
public int compareTo(ThoiTrangMuaHe o) {
	return this.maHang.compareTo(o.maHang);
}

   

    @Override
public boolean equals(Object otherObj){
	if (this == otherObj)
			return true;
	if (otherObj == null)
			return	false;
	if (!(this.getClass() !=otherObj.getClass()))
			return true;
	ThoiTrangMuaHe other = (ThoiTrangMuaHe)otherObj;
	return Objects.equals(this.maHang,other.maHang);
}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.maHang);
        hash = 79 * hash + Objects.hashCode(this.tenHang);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.donGia) ^ (Double.doubleToLongBits(this.donGia) >>> 32));
        hash = 79 * hash + (int) (this.slTon ^ (this.slTon >>> 32));
        return hash;
    }

   
}