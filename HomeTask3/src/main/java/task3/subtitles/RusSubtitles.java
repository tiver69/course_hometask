package task3.subtitles;

public class RusSubtitles extends Subtitles {
    private String subtitlesFile = "rus.str";

    @Override
    public String toString() {
        return String.format("%s subtitles", subtitlesFile);
    }
}
