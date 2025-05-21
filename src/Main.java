public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 187;//в сантиметрах избежим дробей при вводе параметров
        int weight = 98;//в килограммах

        double bmIndex = service.calculate(weight,height);
        System.out.println(bmIndex);

    }
}