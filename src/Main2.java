import java.sql.SQLOutput;

public class Main2 {


    public static void main(String[] args) {

        int a = 2;
        int b = 5;



      String[] arr = new String[3];

      arr[0] = "Raz";
      arr[1] = "2";
      arr[2] = "3";


//        for (int i = 0; i < 3; i++) {
//             a++;
//            System.out.println("a "+ a);
//
//            for (int j = 0; j < 4; j++) {
//                System.out.println("b " + b);
//                if(j >1){
//                    continue;
//                }
//
//                b++;
//
//            }
//        }
//        for (int i = 0; i < 1000; i++) {
//            if(a > b){
//                System.out.println("a > b");
//                break;
//            }else{
//                a++;
//                System.out.println("b > a");
//            }
//        }


    }

    public static void test(int a ){
        for (int i = 0; i < 10000000; i++) {
            a++;
            System.out.println(a);
            if(a > 5){
             return;
            }
        }
    }
}
