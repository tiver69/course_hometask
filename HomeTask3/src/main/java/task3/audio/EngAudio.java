package task3.audio;

public class EngAudio extends Audio{
    private String audioTrack = "eng.mp3";

    @Override
    public String toString() {
        return String.format("%s audio track, ", audioTrack);
    }
}
