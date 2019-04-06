package task3.afactory.audio;

public class RusAudio extends Audio{
    private String audioTrack = "rus.mp3";

    @Override
    public String toString() {
        return String.format("%s audio track, ", audioTrack);
    }
}
