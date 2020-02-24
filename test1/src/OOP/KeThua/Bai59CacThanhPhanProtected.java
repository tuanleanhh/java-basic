package OOP.KeThua;

public class Bai59CacThanhPhanProtected {

    /*
       Các Thành phần protected: cho phép truy cập phạm vi trong cùngg 1 lớp, 1 gói hoặc 1 sơ đồ phân cấp(Ke thua)
       note: thành phần trường protected thường không được sử dụng, chỉ định nghĩa các phương thức là protected
            */
    public static void main(String[] args) {
        Personal personal = new Personal();
        // phuong thuc setFullName la protected
        personal.setFullName("ABC");
    }

}
