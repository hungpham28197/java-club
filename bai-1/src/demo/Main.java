package demo;

public class Main {
    public static String temp;

    public static void add(int a) {
        // copy bien a, vao trong ham se lam viec voi copy a
        a = 123;
        System.out.println("Ben trong ham: " + a);
    }

    public int sub(int a, int b) {
        return a - b;
    }
//
//    public static String change(String s) {
//        s = "test";
//        System.out.println("Ben trong ham: " + s);
//    }

    public static void changeArr(String[] s) {
        s[0] = "test";
        System.out.println("Ben trong ham: " + s[0]);
    }

    public static void changeArr(int[] arr) {
        arr[0] = 100;
        System.out.println(arr);

        System.out.println("Ben trong ham: " + arr[0]);
    }

    public static void demo(String text) {

        //java > 9
        int rs = switch (text) {
            case "A", "B", "C" -> 10;
            case "D", "E", "F" -> 20;
            default -> 0;
        };
        System.out.println(rs);
    }
    public static void main(String[] args) {
//        System.out.println("Hello world");
//        System.out.printf("%s %d %f", "Asd", 1, 12.3f);

//        //Các kiểu dữ liệu hay dùng
//        int a = 1;
//        int x = 3;
//
//        long b = 100000;
//
//        float c = 12.32f;
//        double d = 423.123;
//        double y = (double) a / x;
//        System.out.println();

        //BigDecimal bigDecimal = new BigDecimal(120000000);
//
//        String s = "Test";
//        char cc = s.charAt(1);

//        String s = "abcd";
//        char s2 = s.charAt(0);
//        System.out.println(s2);
//        char s3 = s.charAt(1);
//        System.out.println(s3);
//        String s1 = s + "sda" + "ads" + "cvcvc" + "aa";
//        System.out.println(s1);
//        String s = "abc";
//        String[] arrString = new String[1];
//        arrString[0] = "abc";
//        //change();
//        changeArr(arrString);
//        System.out.println(arrString[0]);
//        int a = 1;
//        add(a);
//        System.out.println("Ben ngoai ham: " + a);

//        int[] arr = {1, 3, 5, 6};
//        System.out.println(arr);
//        changeArr(arr);
//        //System.out.println("Ben ngoai ham: " + arr[0]);
//
//        System.out.println("----------------------");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Ben ngoai ham: " + i + " " + arr[i]);
//        }

//        int[] arr = {1, 3, 5, 6};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 0;
//        }
//
////        System.out.println("--------------------");
//        for(int v : arr) {
//            //TODO logic
//            System.out.println("Truoc thay doi trong ham:" + v);
//            v = 0;
//            System.out.println("Sau thay doi trong ham:" + v);
//        }


//        for (int i = 0; i < arr.length; i++) {
//
//            System.out.println(arr[i]);
//        }

        //tu java > 9
//        var a = "sdsad";
//        System.out.println(a);

       demo("A");
    }
}
