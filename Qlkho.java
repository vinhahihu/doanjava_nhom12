package qlkttmh;

import java.util.Scanner;

public class Qlkho {
  
    public static void main(String[] args) {
       ThoiTrangMuaHe b = new QuanAo();
       ThoiTrangMuaHe c = new PhuKien();
       b.getDonGia();
       b.getTenHang();
       b.getMaHang();
       b.getslTon();
       c.getDonGia();
       c.getMaHang();
       c.getslTon();
       c.getTenHang();
       try (Scanner sc = new Scanner(System.in)) {
        DSSanPham   dssp = new DSSanPham();
           int luaChon = 0;
          
           do{
                System.out.println("-----------MENU--------------");
                System.out.println("1.Thêm sản phẩm vào danh sách.\n"
                +"2. In danh sách sản phẩm ra màn hình.\n"
                +"3. Kiểm tra danh sách có rỗng không.\n"
                +"4. Lấy ra số lượng sản phẩm trong danh sách.\n"
                +"5. Làm rỗng danh sách sản phẩm .\n"
                +"6. Kiểm tra  sản phẩm có tồn tại trong danh sách hay không, dựa trên mã hàng.\n"
                +"7. Xóa một sản phẩm khỏi danh sách.\n"
                +"8. Tìm kiếm tất cả sản phẩm từ tên nhập từ bàn phím.\n"
                +"9. Xuất ra danh sách sản phẩm có giá từ cao đến thấp .\n"
                +"0. Thoát chương trình.\n");
                luaChon = sc.nextInt();
                sc.nextLine();
                if(luaChon==1){
                    System.out.println("Nhập mã hàng: ");String maHang = sc.nextLine();
                    System.out.println("Nhập tên hàng: ");String tenHang = sc.nextLine();
                    System.out.println("Nhập đơn giá: ");Double donGia = sc.nextDouble();
                    System.out.println("Nhập số lượng tồn: ");Long slTon = sc.nextLong();
                   ThoiTrangMuaHe n = new ThoiTrangMuaHe(maHang, tenHang, donGia, slTon);
                    dssp.themThoiTrangMuaHe(n);
                }else if(luaChon==2){
                    dssp.inDSSanPham();
                }else if(luaChon==3){
                    System.out.println("Danh sách rỗng: "+dssp.kiemTraDanhSachRong());
                }else if(luaChon==4){
                    System.out.println("Số Lượng hiện tại: "+dssp.laySoLuongSanPham());
                }else if(luaChon==5){
                    dssp.lamRongDanhSach();                                                                                                    
                }else if(luaChon==6){
                    System.out.println("Nhập mã hàng : "); String maHang = sc.nextLine();
                    ThoiTrangMuaHe sp = new  ThoiTrangMuaHe(maHang);
                    System.out.println("Kiểm tra sản phẩm có trong danh sách:"+dssp.kiemTraTonTai(sp));
                }else if(luaChon==7){
                    System.out.println("Nhập mã hàng : "); String maHang = sc.nextLine();
                    ThoiTrangMuaHe sp = new  ThoiTrangMuaHe(maHang);
                    System.out.println("Xóa sản phẩm  trong danh sách:"+dssp.xoaSanPham(sp));
                }else if(luaChon==8){
                    System.out.println("Nhập tên sản phẩm:");String tenHang = sc.nextLine();
                    System.out.println("Kết Quả tìm kiếm; ");
                    dssp.timSanPham(tenHang);
                }else if(luaChon==9){
                    dssp.sapXepSanPhamGiamDanTheoGia();
                    dssp.inDSSanPham();
                }

           }while(luaChon!=0);
    }   
   }
        
}

