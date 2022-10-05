package lt.jevgenij.interfacepavyzdys;

public class MusicDC implements Multimedia {

    String music;

    public MusicDC(String music) {
        this.music = music;
    }

    @Override
    public String play() {
        return "Now is playing " + music + " music";
    }
}
