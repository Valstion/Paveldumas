package lt.jevgenij.interfacepavyzdys;

public class VideoBlyRay implements Multimedia {
    String videoBluRay;

    public VideoBlyRay(String videoBluRay) {
        this.videoBluRay = videoBluRay;
    }

    @Override
    public String play() {
        return "Now is playein " + videoBluRay + "Video Blu ray";
    }
}
