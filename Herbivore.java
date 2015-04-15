/**
 * Created by VJ on 4/5/15.
 */
public class Herbivore extends Animal {
    private char symbol = 'H';
    private int energy = 1;
    private int age = 1;

    public void printSymbol(){
        super.printSymbol();
        System.out.print(this.symbol);
    }

    public void age(){
        this.age++;
        if((age >= 12) && (energy >= 18)){
            birth();
        }
    }
    public void eats(Plant food){
        this.energy++;
        //food = null;
        food.setSymbol('.');//isn't good-- only replaces the symbol of the object
        if((age >= 12) && (energy >= 18)){//births under conditions
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
//***do i need to replace the symbol when it dies?
