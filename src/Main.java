import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {
        int priceInPenny;
        int mile;
        int conditionForMileInPenny;

        priceInPenny = 1000000_20;
        conditionForMileInPenny = 2000;
        mile = (int) (priceInPenny / conditionForMileInPenny);
        System.out.println("Количество миль: " + mile);
    }
}
