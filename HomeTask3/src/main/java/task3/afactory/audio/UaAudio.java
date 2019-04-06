package task3.afactory.audio;

public class UaAudio extends Audio{
    private String audioTrack = "ua.mp3";

    @Override
    public String toString() {
        return String.format("%s audio track, ", audioTrack);
    }
}