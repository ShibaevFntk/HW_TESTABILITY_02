public class BmiService {//создал класс
    public int calculate(int mass, int height) {//Определил метод, задал параметр

        //ИМТ = масса тела (кг) / рост² (м²)
        return (int)((double)mass / ((double)height * (double)height /10000));

    }
}
