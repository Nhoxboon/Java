package GGV;

import java.util.List;
import java.util.Scanner;

public class Test_findGV {
    public static void dogetGV(String donVi, int soCT) {
        XLGV xl = new XLGV();
        List<Giangvien> giangviens = xl.getGV(donVi, soCT);
        for (Giangvien gv : giangviens) {
            System.out.println("MaDD: " + gv.getMaDD() + ", HoTen: " + gv.getHoTen() + ", DonVi: " + gv.getDonVi() + ", GioiTinh: " + gv.getGioiTinh() + ", SoCT: " + gv.getSoCT() + ", XetThuong: " + gv.xetThuong());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap don vi cong tac: ");
        String donVi = scanner.nextLine();
        System.out.print("Nhap so cong trinh: ");
        int soCT = scanner.nextInt();
        dogetGV(donVi, soCT);
    }
}