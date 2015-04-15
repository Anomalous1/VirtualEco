/**
 * Created by VJ on 4/11/15.
 */
public class Plane extends Earth{
    private char symbol = '.';

    public  char getSymbol() {
        super.getSymbol();
        return this.symbol;
    }

    public void printSymbol() {
        super.printSymbol();
        System.out.print(this.symbol);
    }
}
