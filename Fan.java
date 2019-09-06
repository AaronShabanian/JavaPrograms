public class Fan {
    private String name;
    public String Location;
    public Fan(String name, String Location){
        this.name=name;
        this.Location=Location;
    }
    public void update(Object msg) {
        System.out.println(name+" Got tweet~! "+ msg);
    }
    public void reply( String celebrity){

        System.out.println("Im going to the "+celebrity+" concert at "+Location);
    }
}
