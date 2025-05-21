public class BmiService {//создал класс
    public double calculate(int m, int h) {//Определил метод, задал параметр

        //ИМТ = масса тела (кг) / рост² (м²)
        return Math.round((double)m/((double)h*(double)h/10000) * 100.0) / 100.0; //m / ((int)hh*(int)hh);

    }
}
