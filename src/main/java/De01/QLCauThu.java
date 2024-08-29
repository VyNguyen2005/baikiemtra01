/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De01;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
/**
 *
 * @author ADMIN
 */
public class QLCauThu {
    ArrayList<CauThu> dsCauThu = new ArrayList<>();
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    public QLCauThu() {
        dsCauThu.add(new CauThu(10, "Nguyen Van A", 2000, 1000000, 500000, 100000));
        dsCauThu.add(new CauThu(11, "Ha Thi N", 2005, 5000000, 100000, 100000));
        dsCauThu.add(new CauThu(12, "Nguyen Hoang P", 2000, 7000000, 500000, 100000));
        dsCauThu.add(new CauThu(13, "Mai Van K", 2001, 8000000, 100000, 300000));
        dsCauThu.add(new CauThu(14, "Nguyen Van E", 2002, 7000000, 100000, 300000));
        dsCauThu.add(new CauThu(15, "Van Ngoc F", 1999, 3000000, 100000, 100000));
        dsCauThu.add(new CauThu(16, "Ha Thi J", 2006, 8000000, 100000, 300000));
        dsCauThu.add(new CauThu(17, "Ly Thi B", 2005, 6000000, 200000, 400000));
        dsCauThu.add(new CauThu(18, "Le Ngoc R", 2003, 1000000, 200000, 500000));
        dsCauThu.add(new CauThu(19, "Nguyen Van C", 2001, 4000000, 600000, 200000));
        dsCauThu.add(new CauThu(20, "Tu Van Q", 1990, 8000000, 100000, 300000));
        dsCauThu.add(new CauThu(21, "Tran Van W", 2007, 5000000, 400000, 100000));  
    }
    public void ThemCauThu(){
        String tieptuc ="";
        do {            
            System.out.println("Thuc hien them moi cau thu vao CLB Bong da TPHCM");
            System.out.print("Nhap so ao: ");
            int soao = sc1.nextInt();
            System.out.print("Nhap ho ten: ");
            String hoten = sc2.nextLine();
            System.out.print("Nhap nam sinh: ");
            int namsinh = sc1.nextInt();
            System.out.print("Nhap luong cung: ");
            int luongcung = sc1.nextInt();
            System.out.print("Nhap tien thuong: ");
            int tienthuong = sc1.nextInt();
            System.out.print("Nhap tien phat: ");
            int tienphat = sc1.nextInt();
            
            boolean exists = false;
            for (CauThu cauThu : dsCauThu) {
                if(cauThu.getSoao() == (soao)){
                    exists = true;
                    break;
                }
            }
            
            if(exists){
                System.out.println("Cau thu voi so ao " + soao + " da ton tai. Ban khong the them moi. Vui long thu lai.");
                continue;
            }
            else{
                dsCauThu.add(new CauThu(soao, hoten, namsinh, luongcung, tienthuong, tienphat));
                System.out.println("Them moi cau thu thanh cong.");
            }
            
            System.out.print("Ban muon tiep tuc them moi cau thu(y/n): ");
            tieptuc = sc2.nextLine();
        } while (tieptuc.equalsIgnoreCase("y"));
    }
    public void XuatVaTinhTongLuong() {
        double sumTienLuong = 0;
        for (CauThu cauthu : dsCauThu) {
            System.out.println(cauthu.toString());
            sumTienLuong += cauthu.LuongThucLanh();
        }
        
        DecimalFormat df = new DecimalFormat("#,###.00");
        String formattedSum = df.format(sumTienLuong);
        System.out.println("Tong tien luong CLB phai tra cho cau thu: " + formattedSum);
    }
    public ArrayList<CauThu> TimKiem(){
        ArrayList<CauThu> cacCauThuLuongCaoNhat = new ArrayList<>();
        if (dsCauThu.isEmpty()) {
            return cacCauThuLuongCaoNhat; 
        }
        
        CauThu cauThuDauTien = dsCauThu.get(0);
        int luongCaoNhat = cauThuDauTien.LuongThucLanh();
        
        for (int i = 1; i < dsCauThu.size(); i++) {
            CauThu cauThu = dsCauThu.get(i);
            if (cauThu.getLuongcung() > luongCaoNhat) {
                luongCaoNhat = cauThu.LuongThucLanh();
            }
        }
        
        for (int i = 0; i < dsCauThu.size(); i++) {
            CauThu cauThu = dsCauThu.get(i);
            if (cauThu.LuongThucLanh() == luongCaoNhat) {
                cacCauThuLuongCaoNhat.add(cauThu);
            }
        }
        
        return cacCauThuLuongCaoNhat;
    }
    
    public void SapXepLuongThuclanhTang(){
        Comparator<CauThu> tieuchi  = (c1, c2) -> Double.compare(c1.LuongThucLanh(), c2.LuongThucLanh());
        Collections.sort(dsCauThu, tieuchi);
        for (CauThu cauthu : dsCauThu) {
            System.out.println(cauthu);
        }
    }
    
    public void TinhLuongCungTrungBinh(){
        int index = 0;
        double avg;
        int sumLuongCung = 0;
        for (CauThu cauThu : dsCauThu) {
            index++;
            sumLuongCung += cauThu.getLuongcung();
        }
        avg = sumLuongCung / index;
        System.out.println("Luong cung trung binh cua cac cau thu trong doi bong: " +avg);
    }
}
