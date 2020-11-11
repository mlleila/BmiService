public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        long result = service.calculate(45, 1.75);
        System.out.println("Индекс массы тела: " + result);
    }
}

