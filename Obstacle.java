/**
 * Created by VJ on 4/5/15.
 */
public class Obstacle extends Earth{
    private char symbol = 'O';

    public void printSymbol(){
        super.printSymbol();
        System.out.print(this.symbol);
    }
    public void setSymbol(char character){
        this.symbol = character;
    }
    public char getSymbol(){
        super.getSymbol();
        return this.symbol;
    }

}
