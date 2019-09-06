public class Pizza {
    public String size;
    private int cheese;
    private int pepperoni;
    private int ham;
    public Pizza(){
        size="small";
        cheese=0;
        pepperoni=0;
        ham=0;
    }
    public Pizza(String size){
        this.size=size;
        cheese=0;
        ham=0;
        pepperoni=0;
    }
    public Pizza(String size, int cheese, int pepperoni, int ham){
        this.size=size;
        if (cheese>0){
            this.cheese=0;

        }
        else
            this.cheese=cheese;
        if (pepperoni<0){
            this.pepperoni=0;
        }
        else
            this.pepperoni=pepperoni;
        if(ham<0)
            this.ham=0;
        else
            this.ham=ham;
    }
    public void setSize(String sizeIn){
        size=sizeIn;
    }
    public void setCheese(int newCheese){
        if (newCheese<0)
            cheese=0;
        else
            cheese=newCheese;
    }
    public void setPepperoni(int newPepperoni){
        if (newPepperoni<0)
            cheese=0;
        else
            cheese=newPepperoni;
    }
    public void setHam(int newHam){
        if (newHam<0)
            cheese=0;
        else
            cheese=newHam;
    }
    public String getSize(){
        return size;
    }
    public int getCheese(){
        return cheese;
    }
    public int getHam(){
        return ham;
    }
    public int getPepperoni(){
        return pepperoni;
    }
    public double calcCost(){
        if(size.equals("small")){
            return 10+2*(ham+cheese+pepperoni);
        }
       else if(size.equals("medium")){
            return 12+2*(ham+cheese+pepperoni);
        }
       else if(size.equals("large")){
            return 14+2*(ham+cheese+pepperoni);
        }
       else
           return 0;
    }
    public String getDescription(){
        return size+" pizza with "+ham+ " ham toppings "+cheese+ " cheese toppings, and "+pepperoni+ " pepperoni topings.";
    }
}
