package Lab09.task2;

public class TapChi extends AnPham {
    private String tenTapChi;

    public TapChi(String tieuDe, int soTrang, int namXuatBan, String tacGia, int giaTien, String tenTapChi) {
        super(tieuDe, soTrang, namXuatBan, tacGia, giaTien);
        this.tenTapChi = tenTapChi;
    }
    
}
