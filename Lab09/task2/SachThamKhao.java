package Lab09.task2;

import java.util.List;

public class SachThamKhao extends AnPham {
    String linhVuc;
    List<ChuongSach> dsChuongSach;
    public SachThamKhao(String tieuDe, int soTrang, int namXuatBan, String tacGia, int giaTien, String linhVuc,
            List<ChuongSach> dsChuongSach) {
        super(tieuDe, soTrang, namXuatBan, tacGia, giaTien);
        this.linhVuc = linhVuc;
        this.dsChuongSach = dsChuongSach;
    }
    
    
}
