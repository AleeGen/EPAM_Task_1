package by.training.array.entity;

import java.util.Objects;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class CustomArrayParameters {
    private OptionalInt sumElement;
    private OptionalDouble averageElement;
    private OptionalInt maxElement;
    private OptionalInt minElement;

    public OptionalInt getSumElement() {
        return sumElement;
    }

    public void setSumElement(OptionalInt sumElement) {
        this.sumElement = sumElement;
    }

    public OptionalDouble getAverageElement() {
        return averageElement;
    }

    public void setAverageElement(OptionalDouble averageElement) {
        this.averageElement = averageElement;
    }

    public OptionalInt getMaxElement() {
        return maxElement;
    }

    public void setMaxElement(OptionalInt maxElement) {
        this.maxElement = maxElement;
    }

    public OptionalInt getMinElement() {
        return minElement;
    }

    public void setMinElement(OptionalInt minElement) {
        this.minElement = minElement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArrayParameters that = (CustomArrayParameters) o;
        return sumElement == that.sumElement && averageElement == that.averageElement && maxElement == that.maxElement && minElement == that.minElement;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sumElement, averageElement, maxElement, minElement);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("CustomArrayParameters{")
                .append("sumElement=").append(sumElement)
                .append(", averageElement=").append(averageElement)
                .append(", maxElement=").append(maxElement)
                .append(", minElement=").append(minElement)
                .append('}').toString();
        return result;
    }
}
