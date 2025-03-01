//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 172;
        int weight = 75;
        int index = service.calculate(height, weight);
        System.out.println(index);
    }
}