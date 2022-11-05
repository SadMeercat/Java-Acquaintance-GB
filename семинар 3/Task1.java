import java.awt.Point;
class Task1{
    public static boolean finded = false;
    private static void Wave(Point start, Point finish, int[][] map){
        System.out.println(PrintData(map));
        System.out.println(start.x + " " + start.y);
        if(start.x == finish.x && start.y == finish.y){
            finded = true;
            return;
        }
        if(!finded){
            if(start.y-1 >= 0 && map[start.y-1][start.x] == 0){//down
                map[start.y-1][start.x] = map[start.y][start.x] + 1;
                Wave(new Point(start.x,start.y-1), finish, map);
            }
            if(start.y+1 < map.length && map[start.y+1][start.x] == 0){//up
                map[start.y+1][start.x] = map[start.y][start.x] + 1;
                Wave(new Point(start.x,start.y+1), finish, map);
            }
            if(start.x-1 >= 0 && map[start.y][start.x-1] == 0){//left
                map[start.y][start.x-1] = map[start.y][start.x] + 1;
                Wave(new Point(start.x-1,start.y), finish, map);
            }
            if(start.x+1 < map[start.y].length && map[start.y][start.x+1] == 0){//right
                map[start.y][start.x+1] = map[start.y][start.x] + 1;
                Wave(new Point(start.x+1,start.y), finish, map);
            }
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
        map[startPoint.y][startPoint.x] = 1;
        Wave(startPoint, endPoint, map);
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