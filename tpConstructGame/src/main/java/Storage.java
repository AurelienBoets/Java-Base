import Entity.Kingdom;
import Entity.skill.Skill;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Storage {

    private static volatile Storage instance = null;
    private static final Object lock = new Object();
    private static Set<Skill> skills;
    private static Set<Kingdom> kingdoms;

    private Storage(){
        skills=new TreeSet<>(Comparator.comparing(Skill::getName));
        kingdoms=new HashSet<>();
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
