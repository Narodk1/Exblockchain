/*created by Naro simple blockChain algo */
import java.util.ArrayList;
import java.util.Arrays;

public class mainB {

    ArrayList<Block> BlockChain = new ArrayList<>();

    public static void main(String[] args) {
        String[] transaction = {"Naro sent 10 BTC to zak dghtr", "satoshi recieved 100matic from naro"};
        String[] transactionS = {"Naro sent 10 BTC to zak dghtr", "satoshi recieved 100matic from naro"};
        Block NaroBlock = new Block(0, transaction);
        Block NaroBlock2 = new Block(0, transactionS);
        System.out.println("Hash of block 1");
        System.out.println(NaroBlock.getBlockHa());
        System.out.println("Hash of block 2");
        System.out.println(NaroBlock2.getBlockHa());
        /* String[] list1={"a","b","c"};
         String[] list2={"a","b","c"};
        System.out.println(Arrays.hashCode(list1));
        System.out.println(Arrays.hashCode(list2));
         */

    }

}
