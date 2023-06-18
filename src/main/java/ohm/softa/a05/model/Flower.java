package ohm.softa.a05.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.concurrent.Flow;

public class Flower extends Plant{

    public Flower(PlantColor color){
        if(color == PlantColor.GREEN){
            throw new RuntimeException("Grüne Blumen gibbet nit");
        }
        this.color = color;
    }
    @Override
    PlantColor getColor() {
        return color;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }


}
