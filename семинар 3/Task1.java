import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
class Task1{
    public static boolean finded = false;
    private static void Wave(List<Point> points, Point finish, int[][] map){
        List<Point> newPoints = new ArrayList<>();
        System.out.println(PrintData(map));
        for (int i = 0; i < points.size(); i++) {
            Point tmpPoint = points.get(i);
            if(tmpPoint.x == finish.x && tmpPoint.y == finish.y){
                finded = true;
                break;
            }
            if(tmpPoint.y-1 >= 0 && map[tmpPoint.y-1][tmpPoint.x] == 0){//down
                map[tmpPoint.y-1][tmpPoint.x] = map[tmpPoint.y][tmpPoint.x] + 1;
                newPoints.add(new Point(tmpPoint.x, tmpPoint.y-1));
                //Wave(new Point(start.x,start.y-1), finish, map);
            }
            if(tmpPoint.y+1 < map.length && map[tmpPoint.y+1][tmpPoint.x] == 0){//up
                map[tmpPoint.y+1][tmpPoint.x] = map[tmpPoint.y][tmpPoint.x] + 1;
                newPoints.add(new Point(tmpPoint.x, tmpPoint.y+1));
                //Wave(new Point(start.x,start.y+1), finish, map);
            }
            if(tmpPoint.x-1 >= 0 && map[tmpPoint.y][tmpPoint.x-1] == 0){//left
                map[tmpPoint.y][tmpPoint.x-1] = map[tmpPoint.y][tmpPoint.x] + 1;
                newPoints.add(new Point(tmpPoint.x-1, tmpPoint.y));
                //Wave(new Point(start.x-1,start.y), finish, map);
            }
            if(tmpPoint.x+1 < map[tmpPoint.y].length && map[tmpPoint.y][tmpPoint.x+1] == 0){//right
                map[tmpPoint.y][tmpPoint.x+1] = map[tmpPoint.y][tmpPoint.x] + 1;
                newPoints.add(new Point(tmpPoint.x+1, tmpPoint.y));
                //Wave(new Point(start.x+1,start.y), finish, map);
            }
        }
        if(!finded){
            Wave(newPoints, finish, map);
        }
        else{
            return;
        }
    }
    public static void main(String[] args) {
        int[][] map = {
            {-1,-1, 0, 0, 0},
            {-1, 0, 0,-1,0},
            {0, 0, 0, 0, 0},
            {-1,-1,-1,-1,0},
            {0, 0, 0, 0, 0}
        };
        Point startPoint = new Point(2,0);
        Point endPoint = new Point(3,4);
        List<Point> tmp = new ArrayList<>();
        tmp.add(startPoint);
        map[startPoint.y][startPoint.x] = 1;
        Wave(tmp, endPoint, map);
    }
    public static String PrintData(int[][] data){
        String result = "";
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                result += Integer.toString(data[i][j]) + "\t";
            }
            result += "\n";
        }
        return result;
    }
}