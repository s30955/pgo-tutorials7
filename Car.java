import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Car implements Comparable<Car>{
    private String modelName;
    private int productionDate;
    private int id;


    public Car(String modelName, int productionDate) {
        setModelName(modelName);
        setProductionDate(productionDate);
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if(modelName==null){
            throw new IllegalArgumentException("Model name cannot be null");
        }
        this.modelName = modelName;
    }

    public int getProductionDate() {

        return productionDate;
    }

    public void setProductionDate(int productionDate) {
        if(productionDate<0){
            throw new IllegalArgumentException("Production date must be more than 0");
        }
        this.productionDate = productionDate;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.productionDate, o.productionDate);
        }

    public String toString() {
        return "Car (model= " + modelName + ", year= " + productionDate + ")";
    }

}
