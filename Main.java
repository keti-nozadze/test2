package HelloWorld;

public class Main {
//1-მეთოდი
    public static void main(String[] args) {
      int num_1 = 24;
      String str = "მარტის ოფიციალური გაცვლითი კურსი";
      char chr = '$';
      char chr_1 = '=';
      float num_2 = 3.3343f;
	  System.out.println(num_1 + " " + str + " " + chr + "" + chr_1 + "" + num_2);
    }

   //2-მეთოდი
/*
 *გავიგოთ ნაშთი საკრედიტო ბარათზე თანხის შეტანა გატანით

 * */
    public static void test_1(String[] args) {
        int num_1 = 1800;//თავდაპირველი ნაშთი
        int num_2 = 800;//22 მარტის ათვისება
        int num_3 = num_1-num_2;//ნაშთი ათვისების მერე
        int num_4 = 100;//ჩარიცხვა ანგარიშზე 24 მარტს
        int num_5 = num_3+num_4;//ნაშთი ჩარიცხვის მერე
        System.out.println(num_3);
        System.out.println(num_5);

    }

//3-მეთოდი
    public static void test_2(String[] args) {

        boolean num_1 = true;
        boolean num_2 = false;

        System.out.println(num_1||num_2);
        System.out.println("num_1 && num_2 = " + (num_1 && num_2));
        System.out.println("!num_1 = " +!num_1);
    }

//4-მეთოდი
    public static void test_3(String[] args) {
        String str = "chemi dabadebis tselia";
        int num_1 = 1989;
        char chr_2 = ',';
        String str_1 = "chemi asakia";
        int num_2 = 2021;
        int num_3 = num_2-num_1;
        char chr_3 = '.';
        System.out.println(str + " " + num_1 + "" + chr_2 + " " + str_1+ " " + num_3 + "" + chr_3);


    }
}

