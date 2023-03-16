package rikkei.academy;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = Math.PI *radius*radius;
        double primerter = Math.PI * 2* radius;
        double volume = primerter *2 + 2* baseArea;
        return volume;
    }
}
