package myblockchainexample;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ameer
 */
public class LaunchApp {

    public static void main(String[] args) throws Exception {
        BlockChain blockChain = new BlockChain();
        blockChain.addNewTransaction("Ahmed-Ali-10");
        blockChain.addNewTransaction("Mohammed-Khalil-7");
        blockChain.addNewTransaction("Ali-Mohammed-4");
        blockChain.mineBlock();

        blockChain.addNewTransaction("Ahmed-Ali-5");
       blockChain.addNewTransaction("Mohammed-Khalil-7");
        blockChain.addNewTransaction("Ali-Mohammed-4");
       blockChain.mineBlock();

        blockChain.addNewTransaction("Ahmed-Ali-10");
        blockChain.addNewTransaction("Mohammed-Khalil-2");
        blockChain.addNewTransaction("Ali-Mohammed-4");
        blockChain.mineBlock();

        blockChain.addNewTransaction("Ahmed-Ali-10");
        blockChain.addNewTransaction("Mohammed-Khalil-7");
        blockChain.addNewTransaction("Ali-Mohammed-5");
        blockChain.mineBlock();

        System.out.println("Is BlockChain Valid: " + blockChain.isChainValid());
        blockChain.blocksExplorer();

        try {
            FileManager.saveData();
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            Logger.getLogger(LaunchApp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
