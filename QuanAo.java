package qlkttmh;
import java.util.Scanner;


public class QuanAo extends ThoiTrangMuaHe  {
    private String baoHanh;
    private String chatLieu;

    public QuanAo(){
    }
        public QuanAo(String baoHanh, String chatLieu){
            this.baoHanh=baoHanh;
            this. chatLieu= chatLieu;                 
    }
    public String getBaoHanh(){
        return baoHanh;
    }
    public void setBaoHanh(String baoHanh){
        this.baoHanh=baoHanh;
    }
    public String getChatLieu(){
        return chatLieu;
    }
    public void setChatLieu(String chatLieu){
        this.chatLieu=chatLieu;
    }
    @Override
    public void nhap() {
        try (Scanner sc = new Scanner(System.in)) {
            {
                System.out.println("Bảo Hành:        ");
                baoHanh=sc.nextLine();
                System.out.println("Chất Liệu:     ");
                chatLieu=sc.nextLine();
               
            }
        }
    }
    @Override
    public void xuat() {
        System.out.println("\n{baoHanh:"+ getBaoHanh() + ", chatLieu:"+ getChatLieu() +"}");
    }
}

