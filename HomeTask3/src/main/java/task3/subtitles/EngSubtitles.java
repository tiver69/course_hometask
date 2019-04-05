package task3.subtitles;

public class EngSubtitles extends Subtitles {
    private String subtitlesFile = "eng.str";

    @Override
    public String toString() {
        return String.format("%s subtitles", subtitlesFile);
    }
}
