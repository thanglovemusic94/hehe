package vidu2;



import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Sort {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("tao", "chuoi", "mit");
//        Collections.sort(l, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });

        /*
        in ra man hinh cac phan tu
         */
        l.forEach((t) -> {
            System.out.println(t);
        });

        /*
        in ra man hinh cac phan tu va co sap xep
         */
        l.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        //hoac
//        Collections.sort(l, (o1, o2) -> {
//            return o1.compareTo(o2);
//        });
        l.forEach((t)->{
            System.out.println(t);
        });

//        for (String x : l) {
//            System.out.println(x);
//        }

    }

//    @FunctionalInterface
//    public interface Consumer<T> {
//
//        // Phương thức chấp nhận một tham số đầu vào
//        // và không trả về gì cả.
//        void accept(T t);
//
//    }
}


