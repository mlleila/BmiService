public class BmiService {
    public long calculate(int weight, double height) {
        double bmi = weight / (height*2);
        long result = Math.round(bmi);
        return result;
    }
}
