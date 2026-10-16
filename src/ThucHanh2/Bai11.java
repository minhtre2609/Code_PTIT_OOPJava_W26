package ThucHanh2;

import java.util.*;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<CongNhan> danhSach = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine();
            String gioVao = sc.nextLine().trim();
            String gioRa = sc.nextLine().trim();

            CongNhan cn = new CongNhan(ma, ten, gioVao, gioRa);
            danhSach.add(cn);
        }

        Collections.sort(danhSach);

        for (CongNhan cn : danhSach) {
            System.out.println(cn);
        }

        sc.close();
    }
}

class CongNhan implements Comparable<CongNhan> {
    private String ma;
    private String ten;
    private int soPhutLamViec;

    public CongNhan(String ma, String ten,
                    String gioVao, String gioRa) {
        this.ma = ma;
        this.ten = ten;

        this.soPhutLamViec =
                doiRaPhut(gioRa) - doiRaPhut(gioVao) - 60;
    }

    private int doiRaPhut(String thoiGian) {
        String[] a = thoiGian.split(":");

        int gio = Integer.parseInt(a[0]);
        int phut = Integer.parseInt(a[1]);

        return gio * 60 + phut;
    }

    @Override
    public int compareTo(CongNhan khac) {
        // Thoi gian lam viec giam dan.
        int kq = Integer.compare(
                khac.soPhutLamViec, soPhutLamViec);

        if (kq != 0) {
            return kq;
        }

        // Neu bang nhau, ma cong nhan tang dan.
        return ma.compareTo(khac.ma);
    }

    @Override
    public String toString() {
        int gio = soPhutLamViec / 60;
        int phut = soPhutLamViec % 60;

        String trangThai =
                soPhutLamViec >= 480 ? "DU" : "THIEU";

        return ma + " " + ten + " "
                + gio + " gio " + phut + " phut "
                + trangThai;
    }
}
