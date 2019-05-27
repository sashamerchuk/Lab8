
package ua.lviv.iot.creativity.model;



import ua.lviv.iot.creativity.model.CreativityGood;
import ua.lviv.iot.creativity.model.Type;


public class Needle extends CreativityGood {

    private int diameter;

    public Needle() {
    }

    public Needle( String name, int price,Type type, int diameter) {
        super(name, price, type);
        this.diameter = diameter;
    };
    
    
    public String toString() {
        return super.toString() + " Diameter : " + diameter;
    };
    
    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }


    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "diameter";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + this.diameter;
    }

}