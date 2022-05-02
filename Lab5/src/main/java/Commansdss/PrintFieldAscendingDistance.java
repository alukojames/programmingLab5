package Commansdss;

import Core.CollectionManager;
import Core.CommandAsker;

public class PrintFieldAscendingDistance extends AbstractCommand{
    private final CollectionManager collectionManager;
    private final CommandAsker commandAsker;
    public PrintFieldAscendingDistance(CollectionManager c, CommandAsker a){
        this.collectionManager = c;
        this.commandAsker = a;
    }

    @Override
    public boolean execute(){
        collectionManager.addIfMin(commandAsker.createProduct());
        return true;
    }
}
