import java.util.HashMap;

public class NbPrPlace {
    private HashMap<String,Integer> mapPlaces;
    
    public NbPrPlace() {
        mapPlaces = new HashMap<>();
    }

    public NbPrPlace(String key, Integer value) {
        this();
        this.mapPlaces.put(key, value);
    }
    
    public HashMap<String, Integer> getMapPlaces() {
        return mapPlaces;
    }

    public void setMapPlaces(String key, Integer value) {
        this.mapPlaces.put(key, value);
    }

    @Override
    public String toString() {
        return "" + mapPlaces + "";
    }
    
    
}
