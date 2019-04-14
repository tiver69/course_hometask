package task3.afactory;

import task3.afactory.audio.Audio;
import task3.afactory.subtitles.Subtitles;

public class Movie {
    private Video videoTrack;
    private Audio audioTrack;
    private Subtitles subtitlesFile;

    public Movie(Video videoTrack, Audio audioTrack, Subtitles subtitlesFile) {
        this.videoTrack = videoTrack;
        this.audioTrack = audioTrack;
        this.subtitlesFile = subtitlesFile;
    }

    @Override
    public String toString() {
        return String.format("\"%s\" with ", videoTrack)
                + audioTrack.toString() + subtitlesFile.toString();
    }
}
