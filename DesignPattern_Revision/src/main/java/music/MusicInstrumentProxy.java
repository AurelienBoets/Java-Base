package music;

public class MusicInstrumentProxy implements Instrument{
    private MusicInstrument instrument;

    public MusicInstrumentProxy(String name) {
        this.instrument = new MusicInstrument(name);
    }

    @Override
    public void play() {
        this.instrument.play();
    }
}
