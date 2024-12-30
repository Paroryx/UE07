import java.util.Arrays;

public class Storage {
    private final String[] store;

    public Storage(int size){
        this.store = new String[size];
    }

    public boolean add(String objectName){
        for(int i = 0; i < store.length; i++){
            if(store[i] == null){
                store[i]=objectName;
                return true;
            }
        }
        return false;
    }
    public CountedResource count(String objectName){
        int count = 0;
        for(String obj : store){
            if(obj !=null && obj.equals(objectName)){
                count++;
            }
        }
        return new CountedResource(objectName,count);
    }
    public boolean remove(String objectName){
        for (int i = 0; i < store.length; i++) {
            if(store[i]!=null && store[i].equals(objectName)){
                store[i] = null;
                return true;
            }
        }
        return false;
    }
    public boolean remove(String objectName, int n){
        if(count(objectName).n != n){
            return false;
        }else{
            for (int i = 0; i < n; i++) {
                remove(objectName);
            }
            return true;
        }
    }
    public boolean canBuild(Product p){
        for(CountedResource res : p.getRequirements()){
            if(count(res.name).n < res.n){
                return false;
            }
        }
        return true;
    }
    public void print(){
        Out.println(Arrays.toString(store));
    }
}
