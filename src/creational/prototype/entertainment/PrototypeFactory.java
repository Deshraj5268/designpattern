package creational.prototype.entertainment;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

    private static Map prototypes = new HashMap<String,PrototypeCapable>();

    static {
        prototypes.put(ModelType.MOVIE,new Movie());
        prototypes.put(ModelType.ALBUM,new Album());
    }

    public static PrototypeCapable getInstance(final String type) throws CloneNotSupportedException{
        return ((PrototypeCapable)prototypes.get(type)).clone();
    }
}
