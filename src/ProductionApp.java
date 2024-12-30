public class ProductionApp {
    public static void main(String[] args) {
        Out.println("Fabric 1 (Bentley Fabric):");
        ProductionBuilding pbF1 = new ProductionBuilding(13, new Product("Bentley",new CountedResource[]{ new CountedResource("Wheel"), new CountedResource("Tyre",4), new CountedResource("Bentley-Logo")}));
        pbF1.add(new String[]{"Wheel", "Wheel", "Tyre","Tyre","Bentley-Logo","Tyre","Tyre","Tyre","Tyre","Tyre","Tyre","Bentley-Logo","Bentley-Logo"});
        pbF1.storage.print();
        Out.println("Produced: "+pbF1.produce()+" "+pbF1.product.name);
        pbF1.storage.print();

        Out.println("\nFabric 2 (Feline Retreat Factory):");
        ProductionBuilding pbF2 = new ProductionBuilding(10, new Product("Feline Retreat", new CountedResource[]{new CountedResource("Soft Fur",3), new CountedResource("Cozy Bed"), new CountedResource("Sisal Scratcher"), new CountedResource("Feather Toy",2)}));
        pbF2.add(new String[]{"Soft Fur", "Soft Fur", "Cozy Bed", "Sisal Scratcher", "Feather Toy", "Feather Toy", "Soft Fur"});
        pbF2.storage.print();
        Out.println("Produced: " + pbF2.produce() + " " + pbF2.product.name);
        pbF2.storage.print();

        Out.println("\nFabric 3 (Tech Titan Factory):");
        ProductionBuilding pbF3 = new ProductionBuilding(15, new Product("Tech Titan", new CountedResource[]{new CountedResource("Quantum Processor",5), new CountedResource("Graphene Panel",3), new CountedResource("Plasma Core"), new CountedResource("Neutrino Battery",8)}));
        pbF3.add(new String[]{"Quantum Processor", "Plasma Core", "Neutrino Battery", "Quantum Processor"});
        pbF3.storage.print();
        Out.println("Produced: " + pbF3.produce() + " " + pbF3.product.name);
        pbF3.storage.print();
    }
}
