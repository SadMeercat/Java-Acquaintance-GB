import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Реализовать алгоритм сортировки вставками
public class Task4 {
    static List<Integer> myArr = new ArrayList<>();

    static void calc(){
        for (int i = 1; i < myArr.size(); i++) {
            int j = i - 1;
            int tmpNum = myArr.get(i);
            while (j>=0 && myArr.get(j) > tmpNum){
                myArr.set(j+1,myArr.get(j));
                j -= 1;
            } 
            myArr.set(j+1,tmpNum);
            System.out.println(myArr + "\r\n--------------------");
        }
    }

    public static void main(String[] args) {
        int numbersCount = 10;
        for (int i = 1; i <= numbersCount; i++) {
            myArr.add(i);
        }
        
        Collections.shuffle(myArr);
        System.out.println("Исходный массив");
        System.out.println(myArr);
        calc();
    }
}
