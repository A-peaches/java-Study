package Test;

public class SmartPhone {

    String modelName;
    String os;
    int releaseYear;
    int batterySize;
    String USBType;


    public SmartPhone(String modelName, String os, int releaseYear, int batterySize,
                      String USBType) {
        this.modelName = modelName;
        this.os = os;
        this.releaseYear = releaseYear;
        this.batterySize = batterySize;
        this.USBType = USBType;
    }

    public void printInfo() {
        System.out.println("모델명 : " + modelName + " \n"
        + "운영체제 : " + os + "\n"
        + "출시년도 : " + releaseYear + "\n"
        + "배터리용량 : " + batterySize + "\n"
        + "USB타입 : "  + USBType );

    }
}
