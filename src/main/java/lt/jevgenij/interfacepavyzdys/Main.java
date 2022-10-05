package lt.jevgenij.interfacepavyzdys;

public class Main {
    public static void main(String[] args) {
        MultimediaInput multimedia = new MultimediaInput();

        MusicDC musicDC01 = new MusicDC("Sting");
        MusicDC musicDC02 = new MusicDC("Nezinau");
        MusicDC musicDC03 = new MusicDC("Gedera");

        VideoDvd videoDvd01 = new VideoDvd("gvk.sdlkg");
        VideoDvd videoDvd02 = new VideoDvd("gvk.one");
        VideoDvd videoDvd03 = new VideoDvd("gvk.2");

        VideoBlyRay videoBlyRay01 = new VideoBlyRay("Avatar");
        VideoBlyRay videoBlyRay02 = new VideoBlyRay("adfgsdsc");

        multimedia.playMultimedia(musicDC01);
        multimedia.playMultimedia(musicDC02);
        multimedia.playMultimedia(musicDC03);

        multimedia.playMultimedia(videoDvd01);
        multimedia.playMultimedia(videoDvd02);
        multimedia.playMultimedia(videoDvd03);

        multimedia.playMultimedia(videoBlyRay01);
        multimedia.playMultimedia(videoBlyRay02);


    }
}
