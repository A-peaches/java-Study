package Test;

//ver 0.5

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        smartphone1 s1 = new smartphone1("Galaxy s21","Andrioid",2021,4100,"C");
        FolderPhone s2 = new FolderPhone("Corby F",2010,"true");

        System.out.println("안녕하세요. 인하 핸드폰 매장입니다. \n" +
                "핸드폰을 선택해주세요. \n" +
                "1. Galaxy s21 / 2. Corby F");

        switch (sc.nextInt()) {
            case 1 :
                s1.printinfo();
                s1.call("오일남","영상통화");
                s1.sendMessage("오일남","우린 깐부잖아");
                s1.launchCamera("파노라마");
                s1.exitCamera();
                s1.notEnoughBattery();
                s1.update();
                break;

            case 2 :
                s2.printinfo();
                s2.call("오일남","영상통화");
                s2.sendMessage("오일남","우린 깐부잖아");
                s2.launchCamera("파노라마");
                s2.exitCamera();
                s2.notEnoughBattery();
                s2.folder();
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

