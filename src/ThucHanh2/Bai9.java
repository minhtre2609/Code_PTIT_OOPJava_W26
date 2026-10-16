package ThucHanh2;

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;

public class Bai9 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MUAHANG.in"));

        int n = Integer.parseInt(sc.nextLine().trim());
        HashMap<String, SanPham> cacSanPham = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine();
            long gia = Long.parseLong(sc.nextLine().trim());
            int thoiHan = Integer.parseInt(sc.nextLine().trim());

            SanPham sp = new SanPham(ma, ten, gia, thoiHan);
            cacSanPham.put(ma, sp);
        }

        int m = Integer.parseInt(sc.nextLine().trim());
        ArrayList<KhachHang> danhSach = new ArrayList<>();

        for (int i = 1; i <= m; i++) {
            String ten = sc.nextLine();
            String diaChi = sc.nextLine();
            String maSanPham = sc.nextLine().trim();
            int soLuong = Integer.parseInt(sc.nextLine().trim());
            String ngayMua = sc.nextLine().trim();

            SanPham sp = cacSanPham.get(maSanPham);

            KhachHang kh = new KhachHang(
                    i, ten, diaChi, sp, soLuong, ngayMua);

            danhSach.add(kh);
        }

        Collections.sort(danhSach);

        for (KhachHang kh : danhSach) {
            System.out.println(kh);
        }

        sc.close();
    }
}

class SanPham {
    private String ma;
    private String ten;
    private long gia;
    private int thoiHanBaoHanh;

    public SanPham(String ma, String ten, long gia,
                   int thoiHanBaoHanh) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.thoiHanBaoHanh = thoiHanBaoHanh;
    }

    public String getMa() {
        return ma;
    }

    public long getGia() {
        return gia;
    }

    public int getThoiHanBaoHanh() {
        return thoiHanBaoHanh;
    }
}

class KhachHang implements Comparable<KhachHang> {
    private String ma;
    private String ten;
    private String diaChi;
    private SanPham sanPham;
    private long tongTien;
    private LocalDate ngayHetHan;

    private static final DateTimeFormatter DINH_DANG =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public KhachHang(int stt, String ten, String diaChi,
                     SanPham sanPham, int soLuong, String ngayMua) {
        this.ma = String.format("KH%02d", stt);
        this.ten = ten;
        this.diaChi = diaChi;
        this.sanPham = sanPham;
        this.tongTien = sanPham.getGia() * soLuong;

        LocalDate ngay = LocalDate.parse(ngayMua, DINH_DANG);

        this.ngayHetHan =
                ngay.plusMonths(sanPham.getThoiHanBaoHanh());
    }

    @Override
    public int compareTo(KhachHang khac) {
        int kq = ngayHetHan.compareTo(khac.ngayHetHan);

        if (kq != 0) {
            return kq;
        }

        return ma.compareTo(khac.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + diaChi + " "
                + sanPham.getMa() + " " + tongTien + " "
                + ngayHetHan.format(DINH_DANG);
    }
}
