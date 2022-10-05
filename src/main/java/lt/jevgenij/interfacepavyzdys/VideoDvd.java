package lt.jevgenij.interfacepavyzdys;

public class VideoDvd implements Multimedia {
    String videoDvd;

    public VideoDvd(String videoDvd) {
        this.videoDvd = videoDvd;

    }

    @Override
    public String play() {
        return "Now is plaing" + videoDvd + "video dvd";
    }
}
