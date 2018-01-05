import java.util.Set;
import java.util.TreeSet;

public class NumbersApp {

    public static void main(String[] args) {

        NumbersDatabase numbersDatabase = new NumbersDatabase();

        TreeSet<Integer> numbersSet =  numbersDatabase.createNumbersList();

        System.out.println(numbersSet.toString());

        numbersDatabase.print("Największa liczba to : ", numbersDatabase.getBiggest(numbersSet));

        numbersDatabase.print("Najmniejsza liczba to : ", numbersDatabase.getSmallest(numbersSet));

        numbersDatabase.print("Srednia to : ", numbersDatabase.getAverage(numbersSet));

        numbersDatabase.print("Liczby powyżej średniej to : ", numbersDatabase.aboveAverage(numbersSet));



    }
}
