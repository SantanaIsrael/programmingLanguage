public class DataClient {
    public static void main(String[] args) {
        int result;
        Data data = new Data(23, 11, 2023);
        result = data.howManyDays(29, 05, 2024);
        System.out.println("Faltam: " + result + " dias");
    }
}