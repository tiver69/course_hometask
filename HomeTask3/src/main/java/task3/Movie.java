package task3;

import task3.audio.Audio;
import task3.subtitles.Subtitles;

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
