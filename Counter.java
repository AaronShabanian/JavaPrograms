public class Counter {
    private int count;
    public Counter(){
        this.count=0;
    }
    public int getCount(){
        return count;
    }
    public void setCount(){
        this.count=0;
    }
    public void increase(){
        count++;
    }
    public void decrease(){
        if (count>0) {
            count--;
        }
    }
    public void printCount(){
        System.out.println("This count is"+ count);
    }
    public String toString()

    {

        return "Counter [count=" + count + ",getClass()= " + getClass() + ", hashCode()= " + hashCode()
                + ", toString()=" + super.toString() + "]";

    }
    public boolean equals(int obj)

    {
        if (this.count == obj)
            return true;
        else
            return false;

    }

}
