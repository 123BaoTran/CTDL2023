package Lab09.task2;

public class AnPham {
   protected String tieuDe;
   protected int soTrang;
   protected int namXuatBan;
   protected String tacGia;
   protected int giaTien;
    public AnPham(String tieuDe, int soTrang, int namXuatBan, String tacGia, int giaTien) {
        this.tieuDe = tieuDe;
        this.soTrang = soTrang;
        this.namXuatBan = namXuatBan;
        this.tacGia = tacGia;
        this.giaTien = giaTien;
    }
    public static void main(String[] args) {
        AnPham sach1 = new AnPham("Sach1", 200, 2022, "TacGia1", 100);
        AnPham tapChi1 = new AnPham("TapChi1", 50, 2021, "TacGia2", 50);
        AnPham sach2 = new AnPham("Sach2", 150, 2020, "TacGia3", 120);
        AnPham tapChi2 = new AnPham("TapChi2", 60, 2019, "TacGia4", 70);
        AnPham sach3 = new AnPham("Sach3", 180, 2021, "TacGia5", 90);
    }
    
}
