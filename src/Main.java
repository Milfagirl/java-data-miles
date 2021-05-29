public class Main {
    public static void main(String[] args) {
        int priceInPenny;
        int mile;
        int conditionForMileInPenny;

        priceInPenny = 200_20;
        conditionForMileInPenny = 2000;
        mile = priceInPenny / conditionForMileInPenny;
        System.out.println("Количество миль: " + mile);
    }
}
