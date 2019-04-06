package task3.afactory.subtitles;

public class UaSubtitles extends Subtitles{
    private String subtitlesFile = "ua.str";

    @Override
    public String toString() {
        return String.format("%s subtitles", subtitlesFile);
    }
}
