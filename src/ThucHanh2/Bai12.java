package ThucHanh2;

import java.io.*;
import java.util.*;

public class Bai12 {
    public static void main(String[] args) throws Exception {
        // Doc danh sach mon hoc.
        Scanner sc = new Scanner(new File("MONHOC.in"));

        int n = sc.nextInt();
        sc.nextLine();

        HashMap<String, String> tenMonHoc = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String maMon = sc.next();
            String tenMon = sc.nextLine().trim();

            tenMonHoc.put(maMon, tenMon);
        }

        sc.close();

        // Doc danh sach giang vien.
        sc = new Scanner(new File("GIANGVIEN.in"));

        int m = sc.nextInt();
        sc.nextLine();

        ArrayList<GiangVien> danhSach = new ArrayList<>();
        HashMap<String, GiangVien> cacGiangVien = new HashMap<>();

        for (int i = 0; i < m; i++) {
            String ma = sc.next();
            String ten = sc.nextLine().trim();

            GiangVien gv = new GiangVien(ma, ten);

            danhSach.add(gv);
            cacGiangVien.put(ma, gv);
        }

        sc.close();

        // Doc gio chuan cua cac lop hoc phan.
        sc = new Scanner(new File("GIOCHUAN.in"));
        sc.useLocale(Locale.US);

        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            String maGiangVien = sc.next();
            String maMonHoc = sc.next();
            double gio = sc.nextDouble();

            cacGiangVien.get(maGiangVien).congGio(gio);
        }

        sc.close();

        // Giu nguyen thu tu giang vien nhap vao.
        for (GiangVien gv : danhSach) {
            System.out.println(gv);
        }
    }
}

class GiangVien {
    private String ma;
    private String ten;
    private double tongGio;

    public GiangVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
        this.tongGio = 0;
    }

    public void congGio(double gio) {
        tongGio += gio;
    }

    @Override
    public String toString() {
        return ten + " "
                + String.format(Locale.US, "%.2f", tongGio);
    }
}
