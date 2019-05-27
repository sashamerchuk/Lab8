
package ua.lviv.iot.creativity.model;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import ua.lviv.iot.creativity.model.Type;

@Entity
public class CreativityGood {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Enumerated(value = EnumType.STRING)
    private Type type;
    
    private int price;
    private String name;

    public CreativityGood() {
    };

    public CreativityGood(String name, int price, Type type) {
        super();
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String toString() {
        return "Creativity goods : " + " Name : " + name + "," + " Price : " + price + "," + " Type : " + type + ",";
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getHeaders() {
        return "type" + "," + "price" + "," + "name";
    }

    public String toCSV() {
        return this.type + "," + this.price + "," + this.name;
    }
}