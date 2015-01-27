package convFunc;

//Написать и протестировать функции преобразования:

public class ConFun {
    //целого чиста в строку
    String string(int intagr) {
        return String.valueOf(intagr);
    }

    //вещественного числа в строку
    String string(double d) {
        return String.valueOf(d);
    }

    // строки в целое число

    int intager(String string) {
        int i = 0;
        try {
            i = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return i;
    }

    // строки в вещественное число
    double dDouble(String string) {
        double i = 0;
        try {
            i = Double.parseDouble(string);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return i;
    }
}
