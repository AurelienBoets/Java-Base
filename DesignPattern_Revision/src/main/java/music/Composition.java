package music;

import java.util.ArrayList;
import java.util.List;

public class Composition {
    private List<Instrument> instruments;


    public Composition(CompositionBuilder compositionBuilder) {
        this.instruments = compositionBuilder.instruments;
    }

    public void addInstrument(Instrument instrument) {
        this.instruments.add(instrument);
    }

    public void play() {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

    public static class CompositionBuilder{
        private List<Instrument> instruments=new ArrayList<>();

        public CompositionBuilder addInstrument(Instrument instrument) {
            this.instruments.add(instrument);
            return this;
        }

        public Composition build(){
            return new Composition(this);
        }
    }
}
