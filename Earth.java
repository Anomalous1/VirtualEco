import javafx.print.PageLayout;

/**
 * Created by VJ on 4/5/15.
 */
public class Earth {
    public int planeSize = 32;
    public int carnivoreAmount = 3;
    public int herbivoreAmount = 20;
    public int plantAmount = 50;
    public int obstacleAmount = 100;
    public int cycle = 30;
    public char symbol = 'E';


    private int x;
    private int y;

    public Earth(){
        this.x=(int)(Math.random()*32);
        this.y=(int)(Math.random()*32);
    }

    public void printSymbol(){
        System.out.print(this.symbol);
    }

    public char getSymbol(){
        return this.symbol;
    }



    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
/*    public void printXY(){
        System.out.println(this.x + "," + this.y);
    }*/
    public void checkAll() {
        System.out.println("(" + this.getX() + "," + this.getY() + ")");
    }

    public char[][] plane(Earth check){

        char[][] plane = new char[planeSize][planeSize];
        Carnivore C = new Carnivore();
        Herbivore H = new Herbivore();
        Plant P = new Plant();
        Obstacle O = new Obstacle();
        int counter=0,i,j;
        while(counter<carnivoreAmount&&counter<plantAmount&&counter<herbivoreAmount&&counter<obstacleAmount){
            //put objects in plane
//use loop to make sure no repeats, then set i and j according to objects' x,ys
            for (i = 0; i < planeSize; i++) {
                for (j = 0; j < planeSize; j++) {



            while(j==getX() && i==getY()){//while coordinates equal, repeat
                //need to find a different location
                setX((int)(Math.random()*32));
                setY((int)(Math.random()*32));
            }
            plane[C.getX()][C.getY()]=C.getSymbol();//basically set x,y and symbol to point on plane

            while(check.getX()==getX() && check.getY()==getY()){//while coordinates equal, repeat
                //need to find a different location
                setX((int)(Math.random()*32));
                setY((int)(Math.random()*32));
            }
            plane[H.getX()][H.getY()]=H.getSymbol();

            while(check.getX()==getX() && check.getY()==getY()){//while coordinates equal, repeat
                //need to find a different location
                setX((int)(Math.random()*32));
                setY((int)(Math.random()*32));
            }
            plane[P.getX()][P.getY()]=P.getSymbol();

            while(check.getX()==getX() && check.getY()==getY()){//while coordinates equal, repeat
                //need to find a different location
                setX((int)(Math.random()*32));
                setY((int)(Math.random()*32));
            }
            plane[O.getX()][O.getY()]=O.getSymbol();

                }
            }

        }



        return plane;
    }

}

