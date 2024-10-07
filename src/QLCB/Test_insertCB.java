package QLCB;

import java.util.Scanner;

public class Test_insertCB {
    public static void doInsertCB(CanBo canBo) {
        QLCB qlcb = new QLCB();
        if (qlcb.insertCB(canBo)) {
            System.out.println("Thêm thành công");
        } else {
            System.out.println("Thêm không thành công");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tài khoản: ");
        String soTK = scanner.nextLine();

        System.out.print("Nhập họ tên: ");
        String hoTen = scanner.nextLine();

        System.out.print("Nhập giới tính: ");
        String GT = scanner.nextLine();

        System.out.print("Nhập địa chỉ: ");
        String diachi = scanner.nextLine();

        System.out.print("Nhập lương: ");
        float luong = scanner.nextFloat();

        CanBo canBo = new CanBo(soTK, hoTen, GT, diachi, luong);
        doInsertCB(canBo);
    }
}