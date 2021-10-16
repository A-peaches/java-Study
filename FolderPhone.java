package Test;

public class FolderPhone extends Phone{

    String modelName;
    int releaseYear;
    String isDMB;
    String receiver;
    String mode;
    String message;
    String cameraMode;



    public FolderPhone (String modelName, int releaseYear, String isDMB) {
        this.modelName = modelName;
        this.releaseYear = releaseYear;
        this.isDMB = isDMB;
    }

        @Override
    void printinfo() {
            System.out.println("모델명 : "+modelName+"\n 출시년도 : "+releaseYear+"\n DMB지원 : "+isDMB);
    }

    @Override
    void call(String receiver, String mode) {
        this.receiver=receiver;
        this.mode=mode;
        System.out.println("전화중 ..");

    }

    @Override
    void sendMessage(String receiver, String message) {
        this.receiver=receiver;
        this.message=message;
        System.out.println("메시지를 송부합니다. 80자 이상이면 MMS로 전환됩니다.");
    }

    @Override
    void launchCamera(String cameraMode) {
        this.cameraMode=cameraMode;
        System.out.println("카메라를 시작합니다. 카메라전환은 불가합니다.");

    }

    @Override
    void exitCamera() {
        System.out.println("카메라를 종료합니다.");
    }

    @Override
    void notEnoughBattery() {
        System.out.println("배터리가 부족합니다.");

    }

    @Override
    public void folder() {
        System.out.println("핸드폰을 접어 자동으로 절전모드로 전환됩니다.");
    }
}
