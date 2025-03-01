public class BmiService {

    public int calculate(int height, int weight) {

        double indexHeight = ((height * 0.01) * (height * 0.01));
        double index = weight / indexHeight;
        return (int) index;
    }
}


