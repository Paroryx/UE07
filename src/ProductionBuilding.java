public class ProductionBuilding {
    public final Storage storage;
    public final Product product;

    public ProductionBuilding(int storageSize, Product product){
        this.storage = new Storage(storageSize);
        this.product = product;
    }

    public boolean add(String... resourceNames){
        for (int i = 0; i < resourceNames.length; i++) {
            boolean isSpace = storage.add(resourceNames[i]);
            if(!isSpace){
                return false;
            }
        }
        return true;
    }
    public int produce(){
        int produced = 0;
        while(storage.canBuild(product)){
            for (int i = 0; i < product.getRequirements().length; i++) {
                for (int j = 0; j < product.getRequirements()[i].n; j++) {
                    storage.remove(product.getRequirements()[i].name);
                }
            }
            storage.add(product.name);
            produced++;
        }
        
        return produced;
    }
}
