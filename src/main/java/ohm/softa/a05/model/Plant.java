package ohm.softa.a05.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public abstract class Plant implements Comparable {
    double height;
    String family;
    String name;

    PlantColor color;


    public double getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    abstract PlantColor getColor();


    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Plant)) return false;

        Plant plant = (Plant) o;

        return new EqualsBuilder()
                .append(getHeight(), plant.getHeight())
                .append(getColor(), plant.getColor())
                .append(getFamily(), plant.getFamily())
                .append(getName(), plant.getName())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getColor())
                .append(getFamily())
                .append(getHeight())
                .append(getName())
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("Color", color)
                .append("Name", name)
                .append("Height", height)
                .append("Family", family)
                .toString();
    }

}
