/**
 * Created by VJ on 4/5/15.
 */
public class Plant extends Earth{
    private char symbol = 'P';

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
