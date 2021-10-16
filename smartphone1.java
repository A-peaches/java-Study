package Test;

public class smartphone1 extends Phone {

    String modelName;
    String os;
    int releaseYear;
    int batterySize;
    String USBType;
    String receiver;
    String mode;
    String message;
    String cameraMode;



    public smartphone1 (String modelName, String os, int releaseYear, int batterySize, String USBType) {
        this.modelName = modelName;
        this.os=os;
        this.releaseYear=releaseYear;
        this.batterySize=batterySize;
        this.USBType=USBType;

    }

    @Override
     void printinfo() {
        System.out.println( "모델명 : " + modelName + "\n운영체제 : " + os + "\n출시년도 : " + releaseYear +
                "\n배터리용량 : " + batterySize+"mAh" +"\nUSB타입 : " + USBType);

    }

    @Override
    void call(String receiver, String mode) {
        this.receiver=receiver;
        this.mode=mode;
        System.out.println(receiver+"에게 "+mode+"로 전화를 겁니다."+"\n블루투스 이어폰으로 통화가 자동 연결됩니다.");

    }

    @Override
    void sendMessage(String receiver, String message) {
        this.receiver=receiver;
        this.message=message;
        System.out.println(receiver+"님에게 '"+message+"'와 같이 메시지를 보냅니다."+
                "\nTip) 문자메시지 기본앱을 카카오톡으로 변경하실 수 있습니다.");

    }

    @Override
    void launchCamera(String cameraMode) {
        this.cameraMode=cameraMode;
        System.out.println("카메라앱을 실행합니다. 현재 "+cameraMode+"모드 입니다.");

    }

    @Override
    void exitCamera() {
        System.out.println("카메라앱을 종료합니다.");

    }

    @Override
    void notEnoughBattery() {
        System.out.println("핸드폰 배터리가 15% 미만입니다. 충전기를 꽂아주세요. .");

    }

    @Override
    public void update() {
        System.out.println("펌웨어 업데이트가 필요합니다. 새벽에 업데이트를 진행합니다.");
    }
}






