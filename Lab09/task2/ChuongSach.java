package Lab09.task2;

import java.util.ArrayList;
import java.util.List;

public class ChuongSach {
    String tieuDe;
    int soTrang;
    public ChuongSach(String tieuDe, int soTrang) {
        this.tieuDe = tieuDe;
        this.soTrang = soTrang;
    }
    /**
     * @param args
     * @return
     */
    public static List<ChuongSach> main(String[] args) {
        List<ChuongSach> dsChuongSach() {
            List<ChuongSach> dsChuongSach = new ArrayList<>();
            dsChuongSach.add(new ChuongSach("Chuong 1", 10));
            dsChuongSach.add(new ChuongSach("Chuong 2", 15));
            dsChuongSach.add(new ChuongSach("Chuong 3", 12));
            return dsChuongSach;
    }
    SachThamKhao sachThamKhao1 = new SachThamKhao("SachTK1", 250, 2022, "TacGiaTK1", 150, "LinhVuc1", dsChuongSach());
    SachThamKhao sachThamKhao2 = new SachThamKhao("SachTK2", 300, 2021, "TacGiaTK2", 180, "LinhVuc2", dsChuongSach());
    SachThamKhao sachThamKhao3 = new SachThamKhao("SachTK3", 200, 2023, "TacGiaTK3", 120, "LinhVuc3", dsChuongSach());
    SachThamKhao sachThamKhao4 = new SachThamKhao("SachTK4", 350, 2020, "TacGiaTK4", 200, "LinhVuc4", dsChuongSach());
    SachThamKhao sachThamKhao5 = new SachThamKhao("SachTK5", 180, 2024, "TacGiaTK5", 130, "LinhVuc5", dsChuongSach());

}
}
