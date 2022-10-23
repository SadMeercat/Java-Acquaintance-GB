import java.util.ArrayList;
import java.util.Collections;


// Написать программу, показывающую последовательность действий для игры “Ханойская башня”
public class Task3 {
    public static ArrayList<ArrayList<Integer>> towers = new ArrayList<ArrayList<Integer>>();

    static void calc(int n, int i, int p, int v){//i - источник; p - приемник; v - вспомогательный
        if (n>0){
            calc(n-1, i, v, p);
            moving(i, p);
            calc(n-1, v, p, i);
        }
    }

    static void moving(int i, int p){
        System.out.println(i + "->" + p);
        towers.get(p-1).add(0, towers.get(i-1).get(0));
        towers.get(i-1).remove(0);
        printData();
    }

    static void printData(){
        //System.out.println(tower1);
        //tower1.remove(0);
        for (int i = 0; i < towers.size(); i++) {
            System.out.println("Башня "+ (i+1) + ": " + towers.get(i));   
        }

        System.out.println("------------------");
    }
    public static void main(String[] args) {
        int maxRingsCount = 3;
        ArrayList<Integer> tmpTower = new ArrayList<Integer>();
        for (int i = 1; i <= maxRingsCount; i++) {
            Collections.addAll(tmpTower, i);
        }
        Collections.addAll(towers, tmpTower, new ArrayList<Integer>(), new ArrayList<Integer>());
        calc(maxRingsCount, 1, 2, 3);
    }
}
