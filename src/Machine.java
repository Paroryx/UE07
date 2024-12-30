public class Machine {
    private final String name;
    private final double productionPerHour;
    private int nProduced;
    private final double serviceCost;

    public String getName() {
        return name;
    }

    public double getProductionPerHour() {
        return productionPerHour;
    }

    public int getnProduced() {
        return nProduced;
    }

    public double getServiceCost() {
        return serviceCost;
    }
    public Machine(String name, double productionPerHour, double serviceCost){
        this.name = name;
        this.productionPerHour = productionPerHour;
        this.serviceCost = serviceCost;
    }

    public void run(double hours){
        if(hours<0){
            Out.println("%s%s machines cannot travel back in time \t%s\n%s".formatted(Company.LINE_TOP,Company.SIDE,Company.SIDE,Company.LINE_BOTTOM));
        }else{
        int produced = (int) (productionPerHour*hours);
        nProduced += produced;
        Out.println("%s%s produced %s x %d \t\t%s\n%s\t in %.2f hour(s) \t\t%s\n%s".formatted(Company.LINE_TOP,Company.SIDE,name,produced,Company.SIDE,Company.SIDE,hours,Company.SIDE,Company.LINE_BOTTOM));
        }
    }

    public void print(){
        StringBuilder sb = new StringBuilder();
        sb.append(Company.LOGO);
        sb.append("%s\t product name: %s \t%s\n".formatted(Company.SIDE,name,Company.SIDE));
        sb.append("%s\t production per Hour: %.2f \t%s\n".formatted(Company.SIDE,productionPerHour,Company.SIDE));
        sb.append("%s\t has produced: %d \t\t%s\n".formatted(Company.SIDE,nProduced,Company.SIDE));
        sb.append("%s\t service cost: %.2f Euro \t%s\n".formatted(Company.SIDE,serviceCost,Company.SIDE));
        sb.append(Company.LINE_BOTTOM);

        Out.println(sb.toString());
    }
}
