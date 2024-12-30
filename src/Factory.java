
public class Factory {
    private Machine[] machines;

    public Factory(Machine... machines){
        this.machines = machines;
    }
    public void printServiceCost(){
        Out.println("%s%s Factory Service costs: %.2f \t%s\n%s".formatted(Company.LINE_TOP,Company.SIDE,serviceCosts(),Company.SIDE,Company.LINE_BOTTOM));
    }
    public double serviceCosts(){
        double finalServiceCost = 0.0;
        if(machines == null || machines.length == 0){
            return finalServiceCost;
        }
        for(Machine m : machines){
            if(m!=null)
                finalServiceCost += m.getServiceCost();
        }
        return finalServiceCost;
    }

    public void work(double hours){
        if(machines == null || machines.length == 0){
            Out.println("%s%s\t no machines in factory \t%s\n%s".formatted(Company.LINE_TOP,Company.SIDE,Company.SIDE,Company.LINE_BOTTOM));
        }
        else{
            for (int i = 0; i < machines.length; i++) {
                Machine m = machines[i];
                if(m == null){
                    Out.println("%s%s\t no machines at index %d \t%s\n%s".formatted(Company.LINE_TOP,Company.SIDE,i,Company.SIDE,Company.LINE_BOTTOM));
                }else{
                    m.run(hours);
                }
            }
        }
    }
}
