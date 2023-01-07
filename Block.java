

import java.util.Arrays;


public class Block {
    private int previousH;
    private String[] transaction;
    private int blockHa;
    public Block(int pr, String[] tra){
        this.previousH=pr;
        this.transaction=tra;
        Object[] content={Arrays.hashCode(tra),pr};
        this.blockHa=Arrays.hashCode(content);
    }

    public int getBlockHa() {
        return blockHa;
    }
    public int getPre(){
        return this.previousH;
    }
    public String[] getTra(){
        return this.transaction;
    }
}
