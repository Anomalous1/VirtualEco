import java.security.SecureRandom;

/**
 * Created by VJ on 4/5/15.
 */
public class Animal extends Earth{

    private int age = 1;

    public Animal birth(){
        Animal offspring = new Animal();
        return offspring;
    }
    public void death(Animal A){
        A = null;
    }
    public void age(){
        this.age++;
    }
    //just makes sure no intersection of coordinates with movement
    //***wrong implementation, this should be initial print of plane

    public void movement(Earth check){//checks if plane block not blocked
        //if not, change object coordinates
//int value = randomNumbers.nextInt(8);
        int x = check.getX(), y = check.getY();
        int temp = (int) (Math.random() * 8);             //below done so no intersection
        //while(check.getX()==getX() && check.getY()==getY()){//while coordinates equal, repeat
        //need to find a different location
        //    setX((int)(Math.random()*32));
        //    setY((int)(Math.random()*32));
        //} //not needed for movement
        if (x > 0 && y > 0 && x<32 && y<32) {//within edges
            if (temp == 0) {//N
                y -= 1;
            } else if (temp == 1) {//S
                y += 1;
            } else if (temp == 2 ) {//W
                x -= 1;
            } else if (temp == 3 ) {//E
                x += 1;
            } else if (temp == 4 ) {//NW
                x -= 1;
                y -= 1;
            } else if (temp == 5) {//NE
                x += 1;
                y -= 1;
            } else if (temp == 6) {//SW
                x -= 1;
                y += 1;
            } else if(temp == 7) {//SE
                x += 1;
                y += 1;
            }
            check.setX(x);
            check.setY(y);
        }
        else {//avoid edges- has "choice" to move or not
            if(x==0||y==0){
                if (temp == 1) {//S
                    y += 1;
                } else if (temp == 3 ) {//E
                    x += 1;
                } else if(temp == 7) {//SE
                    x += 1;
                    y += 1;
                }
                check.setX(x);
                check.setY(y);
            }
            else if(x==32||y==32){
                if (temp == 0) {//N
                    y += 1;
                } else if (temp == 4 ) {//NW
                    x += 1;
                } else if(temp == 2) {//W
                    x += 1;
                    y += 1;
                }
                check.setX(x);
                check.setY(y);
            }

        }




    }

/*
    public void movement(Earth check){//checks if plane block not blocked
        //if not, change object coordinates
        super.movement();
//int value = randomNumbers.nextInt(8);
        int x = check.getX(), y = check.getY();
        int temp = (int) (Math.random() * 8);             //below done so no intersection
        //while(check.getX()==getX() && check.getY()==getY()){//while coordinates equal, repeat
        //need to find a different location
        //    setX((int)(Math.random()*32));
        //    setY((int)(Math.random()*32));
        //} //not needed for movement
        if (x > 0 && y > 0 && x<32 && y<32) {//within edges
            if (temp == 0) {//N
                y -= 1;
            } else if (temp == 1) {//S
                y += 1;
            } else if (temp == 2 ) {//W
                x -= 1;
            } else if (temp == 3 ) {//E
                x += 1;
            } else if (temp == 4 ) {//NW
                x -= 1;
                y -= 1;
            } else if (temp == 5) {//NE
                x += 1;
                y -= 1;
            } else if (temp == 6) {//SW
                x -= 1;
                y += 1;
            } else if(temp == 7) {//SE
                x += 1;
                y += 1;
            }
            check.setX(x);
            check.setY(y);
        }
        else if(temp % 2 == 0){//avoid edges- has "choice" to move or not
            if(x==0||y==0){
                if (temp == 1) {//S
                    y += 1;
                } else if (temp == 3 ) {//E
                    x += 1;
                } else if(temp == 7) {//SE
                    x += 1;
                    y += 1;
                }
                check.setX(x);
                check.setY(y);
            }
            else if(x==32||y==32){
                if (temp == 0) {//N
                    y += 1;
                } else if (temp == 4 ) {//NW
                    x += 1;
                } else if(temp == 2) {//W
                    x += 1;
                    y += 1;
                }
                check.setX(x);
                check.setY(y);
            }

        }


    }
    */
}
