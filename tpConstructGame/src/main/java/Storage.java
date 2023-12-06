import Entity.building.Building;
import Entity.character.Character;
import java.util.ArrayList;
import java.util.List;

public class Storage {

    private static volatile Storage instance = null;
    private static final Object lock = new Object();
    private static List<Character> characters;
    private static List<Building> buildings;
    private Storage(){
        characters=new ArrayList<>();
        buildings=new ArrayList<>();
    }

    public List<Character> getCharacters(){
        return characters;
    }

    public List<Building> getBuildings(){
        return buildings;
    }

    public static Storage getInstance() {
        if(instance == null) {
            synchronized (lock) {
                instance = new Storage();
            }
        }
        return instance;
    }
}
