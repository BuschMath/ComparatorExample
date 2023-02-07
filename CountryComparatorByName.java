import java.util.Comparator;

public class CountryComparatorByName implements Comparator<Country> {
    public int compare(Country first, Country second){
        return first.getName().compareTo(second.getName());
    }
}