package Test;

//ver 0.5

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartPhone s1 = new SmartPhone("Galaxy s21","Android",2021,4100,"C");
        SmartPhone s2 = new SmartPhone("Iphone XS","IOS",2018,2658,"8pin");
        SmartPhone s3 = new SmartPhone("V50 ThinQ","Android",2019,4000,"C");

        System.out.println("안녕하세요. 인하 핸드폰 매장입니다. \n" +
                "핸드폰을 선택해주세요. \n" +
                "1. Galaxy s21 / 2. IPhone XS / 3. V50 thinQ");

        switch (sc.nextInt()) {
            case 1 :
                s1.printInfo();
                break;

            case 2 :
                s2.printInfo();
                break;

            case 3:
                s3.printInfo();
                break;
            default :
                System.out.println("잘못된 번호입니다.");
        }
    }
}

/*
// ver 0.2

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        {
            System.out.println("모델명을 적어주세요.");

            Scanner sc = new Scanner(System.in);

            String modelName = sc.nextLine();

            System.out.println("색상을 적어주세요.");

            String color = sc.nextLine();

            System.out.println( "저는 " + modelName + " 핸드폰을 사고 싶고, "+ color + " 색상을 가지고 싶어요!");
        }
    }
}




// ver 0.1
/*
public class MainTest {
    public static void main(String[] args) {
        {
            String modelName = "Galaxy Z Fold 3";
            String color = "Lavender";


            System.out.println("저는 " + modelName + " 핸드폰을 사고 싶고, " + color + " 색상을 가지고 싶어요!");
        }
    }
}
 */

