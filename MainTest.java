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

