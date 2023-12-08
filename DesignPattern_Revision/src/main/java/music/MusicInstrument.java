package music;

public class MusicInstrument implements Instrument{
    private String name;

    public MusicInstrument(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Playing " + name);
    }
}

