package ThucHanh2;

import java.util.*;
import java.time.*;
import java.time.format.*;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        HashMap<String, TheLoai> cacTheLoai = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            TheLoai theLoai = new TheLoai(i, sc.nextLine());
            cacTheLoai.put(theLoai.getMa(), theLoai);
        }

        ArrayList<Phim> danhSach = new ArrayList<>();

        for (int i = 1; i <= m; i++) {
            String maTheLoai = sc.next();
            String ngay = sc.next();
            String dong = sc.nextLine().trim();

            String ten;
            int soTap;

            if (dong.isEmpty()) {
                // Dang 4 dong: ma the loai, ngay, ten, so tap.
                ten = sc.nextLine();
                soTap = Integer.parseInt(sc.nextLine().trim());
            } else {
                // Dang 1 dong: ma ngay ten phim soTap.
                // Tach so tap o cuoi dong, phan truoc la ten phim.
                int viTri = dong.length() - 1;

                while (!Character.isWhitespace(dong.charAt(viTri))) {
                    viTri--;
                }

                ten = dong.substring(0, viTri).trim();
                soTap = Integer.parseInt(dong.substring(viTri + 1));
            }

            TheLoai theLoai = cacTheLoai.get(maTheLoai);
            Phim phim = new Phim(i, theLoai, ngay, ten, soTap);

            danhSach.add(phim);
        }

        Collections.sort(danhSach);

        for (Phim phim : danhSach) {
            System.out.println(phim);
        }

        sc.close();
    }
}

class TheLoai {
    private String ma;
    private String ten;

    public TheLoai(int stt, String ten) {
        this.ma = String.format("TL%03d", stt);
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }
}

class Phim implements Comparable<Phim> {
    private String ma;
    private String ten;
    private TheLoai theLoai;
    private LocalDate ngayKhoiChieu;
    private int soTap;

    private static final DateTimeFormatter DINH_DANG =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Phim(int stt, TheLoai theLoai, String ngay,
                String ten, int soTap) {

        this.ma = String.format("P%03d", stt);
        this.theLoai = theLoai;
        this.ngayKhoiChieu = LocalDate.parse(ngay, DINH_DANG);
        this.ten = ten;
        this.soTap = soTap;
    }

    @Override
    public int compareTo(Phim khac) {
        // Ngay khoi chieu tang dan.
        int kq = ngayKhoiChieu.compareTo(khac.ngayKhoiChieu);

        if (kq != 0) {
            return kq;
        }

        // Neu trung ngay, so sanh ten phim tang dan.
        kq = ten.compareTo(khac.ten);

        if (kq != 0) {
            return kq;
        }

        // Neu trung ca ngay va ten, so tap giam dan.
        return Integer.compare(khac.soTap, soTap);
    }

    @Override
    public String toString() {
        return ma + " " + theLoai.getTen() + " "
                + ngayKhoiChieu.format(DINH_DANG) + " "
                + ten + " " + soTap;
    }
}
