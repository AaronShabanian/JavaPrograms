public class Temperature {
    private float degrees;
    private char scale;
    public Temperature(){
        degrees=0;
        scale='c';
    }
    public Temperature(float degreeValue){
        degrees=degreeValue;
        scale='C';
    }
    public Temperature(char scaleType){
        degrees=0;
        scale=scaleType;
    }
    public Temperature(float degreeValue, char scaleType){
        degrees=degreeValue;
        scale=scaleType;
    }
    public float celcius(){
        if(scale=='F')
            return 5*(degrees-32)/9;
        else
            return degrees;
    }
    public float farenheit(){
        if (scale=='C')
            return (9*(degrees)/5)+32;
        else
            return degrees;
    }
    public void setDegrees(float setDegree){
        degrees=setDegree;
    }

    public void setScale(char newScale) {
        scale=newScale;
    }
    public void setBooth(float newDegrees,char newScale){
        degrees=newDegrees;
        scale=newScale;
    }
    public boolean equals(Temperature o){
        return celcius()==o.celcius();
    }
    public boolean lessThan(Temperature o){
        return celcius()<o.celcius();
    }
    public boolean greaterThan(Temperature o){
        return celcius()>o.celcius();
    }
    public String toString(){
        return "Temperature in F:"+farenheit()+" and the temperature in celius is : "+celcius();
    }
}
