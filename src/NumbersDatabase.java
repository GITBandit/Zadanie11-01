import java.util.*;

public class NumbersDatabase {

    public TreeSet<Integer> createNumbersList(){

        TreeSet<Integer> newNumbersList = new TreeSet<>();
        Random random = new Random();

        for(int i = 0; i < 50; i++){
            newNumbersList.add(random.nextInt(100));
        }

        return newNumbersList;
    }

    public int getBiggest(TreeSet<Integer> set){
        return set.last();
    }

    public int getSmallest(TreeSet<Integer> set){
        return set.first();
    }

    public double getAverage (TreeSet<Integer> set){
        int noOfNumbers = 0;
        int sum = 0;
        for (Integer num : set) {
            sum += num;
            noOfNumbers++;
        }
        return sum/noOfNumbers;
    }

    public List<Integer> aboveAverage(TreeSet<Integer> set){
        double average = getAverage(set);
        List<Integer> numsAboveAverage = new ArrayList<>();
        for (Integer num : set) {
            if(num > average){
                numsAboveAverage.add(num);
            }
        }
        return numsAboveAverage;

    }

    public void print(String string,Object object){
        System.out.println(string + object);
    }

}
