package Test;

public abstract class Phone {

    abstract void printinfo();
    abstract void call(String receiver, String mode);
    abstract void sendMessage(String receiver, String message);
    abstract void launchCamera(String cameraMode);
    abstract void exitCamera();
    abstract void notEnoughBattery();

    public void update() {
    }

    public void folder() {
    }

}
