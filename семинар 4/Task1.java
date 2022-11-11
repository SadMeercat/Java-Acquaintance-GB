import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Task1{
    
    public static List<Integer> QuicSort(List<Integer> arr){
        if (arr.size()<2){
            return arr;
        }

        int pivot = arr.get(0);
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();
        //Генерируем левую и правые части
        for (int i = 1; i < arr.size(); i++) {
            if(arr.get(i) < pivot){
                left.add(arr.get(i));
            }
            else{
                right.add(arr.get(i));
            }
        }
        //Склейка
        List<Integer> tmp = new ArrayList<>();
        tmp.addAll(QuicSort(left));
        tmp.add(pivot);
        tmp.addAll(QuicSort(right));
        return tmp;
    }
    
    public static void main(String[] args) {
        int n = 10;
        List<Integer> myArr = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            myArr.add(rnd.nextInt(-10, 10));
        }
        System.out.println("Исходынй массив:");
        System.out.println(myArr);
        System.out.println(QuicSort(myArr));
    }
}
