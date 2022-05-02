package Commansdss;

import Core.CollectionManager;
import Data.Organization;
import java.util.ArrayList;


public class PrintDescending extends AbstractCommand {
    private final CollectionManager collectionManager;

    public  PrintDescending(CollectionManager c){
        this.collectionManager = c;
    }
    public boolean execute() {
        ArrayList<Organization> orgArray = collectionManager.getOrgArray();
        orgArray.forEach(System.out::println);
        return true;
    }
}
