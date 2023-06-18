package ohm.softa.a05.model;

public class Shrub extends Plant{
    public Shrub(PlantColor color){
        if(color != PlantColor.GREEN){
            throw new RuntimeException("Nicht grüne Shrubs gibbet nit");
        }
        this.color = color;
    }
    @Override
    PlantColor getColor() {
        return null;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
