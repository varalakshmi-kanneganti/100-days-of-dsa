package Strings;
public class ShortestPath {
    public static void main(String args[]){
        String path = "NSEENNW";
        int x = 0; int y = 0;
        for(int i =0; i<path.length()-1;i++){
            char dir = path.charAt(i);
            if(dir == 'N'){
                y++;
            }else if (dir == 'S'){
                y--;
            }else if(dir == 'W'){
                x--;
            }else if(dir == 'E'){
                x++;
            }
        }    
            int x2 = x*x;
            int y2 = y*y;
            double distance = Math.sqrt(x2+y2);
            System.out.println("Final position: (" + x + "," + y + ")");
            System.out.println("Distance : "+ distance);
    }
}
