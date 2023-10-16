package Pr13;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shirt {
    private String model;
    private String type;
    private String color;
    private String size;

    public Shirt(String strShirt) {
        String[] arr = strShirt.split(",");
        this.model = arr[0];
        this.type = arr[1];
        this.color = arr[2];
        this.size = arr[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void main(String[] args) {
        String[] arr = {"S001,Black Polo Shirt,Black,XL", "S002,Black Polo Shirt,Black,L", "S003,Blue Polo Shirt,Blue,XL", "S004,Blue Polo Shirt,Blue,M"};
        ArrayList<Shirt> shirts = new ArrayList<Shirt>();
        for (int i = 0; i < arr.length; i++){
            shirts.add(new Shirt(arr[i]));
            System.out.println(shirts.get(i));
        }

    }
}
