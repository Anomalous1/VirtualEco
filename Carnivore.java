/**
 * Created by VJ on 4/5/15.
 */
public class Carnivore extends Animal {
    private char symbol = 'C';
    private int energy = 2;
    private int age = 1;

    public void printSymbol(){
        super.printSymbol();
        System.out.print(this.symbol);
    }

    public void age(){
        this.age++;
        if((age >= 10) && (energy >= 15)){
            birth();
        }
    }
    public void eats(Herbivore food){
        this.energy +=1;
        //food = null;
        food.setSymbol('.');//--isn't good, only replaces the symbol of the object
        if((age >= 10) && (energy >= 15)){//births under conditions
            birth();
        }
    }
    public char getSymbol(){
        super.getSymbol();
        return this.symbol;
    }
    public void setSymbol(char character){
        this.symbol = character;
    }
    public void checkAll(){
        System.out.println("Age:" + age + "Energy:" + energy + "Coordinates:" + "(" + getX() + "," + getY() + ")");
    }


}
