/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De01;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {

    static QLCauThu quanly = new QLCauThu();

    public static void main(String[] args) {
        int luachon;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("CHUONG TRINH QUAN LY THANH TOAN TIEN LUONG HANG THANG CHO CAC CAU THU");
            System.out.println("---------------------------------------------");
            System.out.println("1. Them moi cau thu");
            System.out.println("2. Xuat thong tin danh sach cac cau thu (so ao, ho ten, tuoi va luong thuc lanh) va tong tien\n"
                    + "luong CLB phai tra cho cau thu.");
            System.out.println("3. Tim kiem cac cau thu co luong thuc lanh cao nhat.");
            System.out.println("4. Sap xep danh sach cau thu theo luong thuc lanh tang dan.");
            System.out.println("5. Tinh luong cung trung binh cua cac cau thu trong doi bong.");
            System.out.println("6. Ket thuc");
            System.out.println("---------------------------------------------");
            System.out.print("Nhap lua chon cua ban(1-6): ");
            luachon = sc.nextInt();
            switch (luachon) {
                case 1:
                    quanly.ThemCauThu();
                    break;
                case 2:
                    System.out.println("Danh sach cac cau thu");
                    quanly.XuatVaTinhTongLuong();
                    break;
                case 3:
                    System.out.println("Danh sach cac cau thu co luong thuc lanh cao nhat");
                    System.out.println(quanly.TimKiem());
                    break;
                case 4:
                    System.out.println("Danh sach sau khi sap xep theo luong thuc lanh tang dan");
                    quanly.SapXepLuongThuclanhTang();
                    break;
                case 5:
                    quanly.TinhLuongCungTrungBinh();
                    break;
                case 6:
                    System.out.println("Ket thuc chuong trinh!");
                    break;
                default:
                    System.out.println("Khong tim thay lua chon phu hop. Vui long chon lai");
                    continue;
            }
        } while (luachon != 6);
    }
}
