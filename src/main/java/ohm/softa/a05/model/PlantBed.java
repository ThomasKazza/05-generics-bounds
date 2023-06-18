package ohm.softa.a05.model;

import ohm.softa.a05.collections.SimpleListImpl;

public class PlantBed<T extends Plant> {
    SimpleListImpl<T> plants = new SimpleListImpl<T>();

   public void add(T plant){
        plants.add(plant);
    }
    public int size(){
        return plants.size();
    }

   public SimpleListImpl<T> getPlantsByColor(PlantColor color){
        SimpleListImpl<T> plantList = new SimpleListImpl<>();

        for (T p: plants) {
            if(p.color.equals(color)){
                plantList.add(p);
            }

        }

        return plantList;
    }
}
