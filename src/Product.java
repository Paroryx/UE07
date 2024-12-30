public class Product {
    public final String name;
    private final CountedResource[] requirements;

    public CountedResource[] getRequirements(){ return requirements; }

    public Product(String name, CountedResource... requirements){
        this.name = name;
        this.requirements = requirements;
    }
}
