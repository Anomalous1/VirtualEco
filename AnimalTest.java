import java.util.ArrayList;

/**
 * Created by VJ on 4/5/15.
 */
public class AnimalTest {

    public static void main(String[] args) {
        //ArrayList n = new ArrayList();
        //System.out.println(n.size());

        Earth [][] plane = new Earth[32][32];
        //put objects on plane
        int counter = 0;
        int carnivoreAmount = 3;
        int herbivoreAmount = 10;
        int plantAmount = 20;
        int obstacleAmount = 100;
        int restOfPlane = ((32*32) - (carnivoreAmount+herbivoreAmount+plantAmount+obstacleAmount));
        Animal C;
        Animal H;
        Plant P;
        Obstacle O;
        Plane Pl = new Plane();//just one object to fill the plane

        counter = carnivoreAmount;
        while(counter > 0){//goes through loop carnivoreAmount times
            C = new Carnivore();
            if(plane[C.getY()][C.getX()] == null) {
                plane[C.getY()][C.getX()] = C;//j is X, i is Y
            }
            else {
                ++counter;//no change, redo
            }
            --counter;
        }
        counter = herbivoreAmount;
        while(counter > 0){//goes through loop herbivoreAmount times
            H = new Herbivore();
            if(plane[H.getY()][H.getX()] == null) {
                plane[H.getY()][H.getX()] = H;//j is X, i is Y
            }
            else {
                ++counter;//no change, redo
            }
            --counter;
        }
        counter = plantAmount;
        while(counter > 0){//goes through loop plantAmount times
            P = new Plant();
            if(plane[P.getY()][P.getX()] == null) {
                plane[P.getY()][P.getX()] = P;//j is X, i is Y
            }
            else {
                ++counter;//no change, redo
            }
            --counter;
        }
        counter = obstacleAmount;
        while(counter > 0){//goes through loop plantAmount times
            O = new Obstacle();
            if(plane[O.getY()][O.getX()] == null) {
                plane[O.getY()][O.getX()] = O;//j is X, i is Y
            }
            else {
                ++counter;//no change, redo
            }
            --counter;
        }

        //counter = (32*32);
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < 32; j++) {
                if(plane[i][j] == null){
                    plane[i][j] = Pl;
                }
            }
        }

        int cycle = 3;
        int start = 1;
        while(start <= cycle){

            System.out.println("\nCycle:" + start);
            for (int i = 0; i < 32; i++) {
                for (int j = 0; j < 32; j++) {

                    System.out.print(plane[i][j].getSymbol() + " ");//returns an object with printSymbol


                }
                System.out.println();
            }
            ++start;

        }
    }
}
/*

if(plane[i][j] instanceof Carnivore || plane[i][j] instanceof Herbivore){
                        //save old coordinate

                        /*
                        int temp1, temp2;
                        temp1 = i; temp2 = j;

                        i=plane[i][j].getY();
                        j=plane[i][j].getX();


                        plane[temp1][temp2].movement(plane[temp1][temp2]);//changes the object coordinates, but not the position on plane
                        //new coordinate
                        i=plane[i][j].getY();
                        j=plane[i][j].getX();
                        */

                        /*
                            if new coordinate has an obstacle, don't go there, perform move again
                            if new coordinate is food, go there and eat
                            if new coordinate is same species, go somewhere else
                            if new coordinate is plant overlap?
                         */
        //it does this, but the visual is the same
