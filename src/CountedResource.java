public class CountedResource {
    public final String name;
    public final int n;
    
    public CountedResource(String name, int n){
        this.name = name;
        this.n = n;
    }
    public CountedResource(String name){
        this(name,1);
    }
}
