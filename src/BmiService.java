public class BmiService {
    public int calculate(double a, int b) {
        double index;
        index = (b / (Math.pow(a, 2)));
        return (int) index;
    }
}
