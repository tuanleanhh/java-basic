package java_interface.Example;

public class Bai72SoSanhChucNang2Implement {
    /* So sánh                  Comparebale                         Comparator
        1. implement        Bản thân là 1 lớp thực thể          Lớp độc lập với lớp thực thể
        2. Phương thức      compareTo(Object o):int             compare(Object o1,Object o2):int
        3. Chức năng        so sánh hai đối tượng cùng lớp      so sánh hai đối tượng cùng lớp ở
                            trong bản thân lớp                  một lớp độc lập khác
        4. Tiêu chí:        So sánh thuộc tính đơn chỉ sử       So sánh thuộc tính đơn chỉ sử dụng được
                            dụng được với một thuộc tính        với một thuộc tính nhưng có thể phân tách
                                                                thành nhiều lớp

        5. Các bước         Collections.sort(tên ds)            Collection.sort(tên ds, đối tượng thể hiện
            thực hiện                                                           của comparator);


     */
}
