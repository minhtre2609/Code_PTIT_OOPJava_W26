package ThucHanh2;

import java.io.*;
import java.util.*;

public class Bai10 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));

        int n = Integer.parseInt(sc.nextLine().trim());

        ArrayList<SinhVien> danhSach = new ArrayList<>();
        HashMap<String, SinhVien> cacSinhVien = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine();
            String lop = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            String soDienThoai = sc.nextLine().trim();
            String gioiTinh = sc.nextLine().trim();

            SinhVien sv = new SinhVien(
                    ma, ten, lop, email, soDienThoai, gioiTinh);

            danhSach.add(sv);
            cacSinhVien.put(ma, sv);
        }

        sc.close();

        // Doc thong tin dang ky size ao.
        sc = new Scanner(new File("DANGKY.in"));

        while (sc.hasNext()) {
            String ma = sc.next();
            String size = sc.next();

            cacSinhVien.get(ma).setSize(size);
        }

        sc.close();

        // Sap xep theo ma sinh vien.
        Collections.sort(danhSach);

        // Doc va xu ly tung truy van.
        sc = new Scanner(new File("TRUYVAN.in"));

        int q = sc.nextInt();

        while (q-- > 0) {
            String gioiTinh = sc.next();
            String size = sc.next();

            System.out.println(
                    "DANH SACH SINH VIEN "
                            + gioiTinh.toUpperCase(Locale.ROOT)
                            + " DANG KY SIZE " + size);

            for (SinhVien sv : danhSach) {
                if (sv.phuHop(gioiTinh, size)) {
                    System.out.println(sv);
                }
            }
        }

        sc.close();
    }
}

class SinhVien implements Comparable<SinhVien> {
    private String ma;
    private String ten;
    private String lop;
    private String email;
    private String soDienThoai;
    private String gioiTinh;
    private String size;

    public SinhVien(String ma, String ten, String lop,
                    String email, String soDienThoai,
                    String gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.gioiTinh = gioiTinh;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean phuHop(String gioiTinh, String size) {
        return this.gioiTinh.equals(gioiTinh)
                && size.equals(this.size);
    }

    @Override
    public int compareTo(SinhVien khac) {
        return ma.compareTo(khac.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " "
                + email + " " + soDienThoai;
    }
}
