package task3.afactory.factory;

import task3.afactory.Video;
import task3.afactory.audio.Audio;
import task3.afactory.audio.UaAudio;
import task3.afactory.subtitles.Subtitles;
import task3.afactory.subtitles.UaSubtitles;

public class UaMovieFactory implements MovieFactory {
    public Video getVideoFromArchive(String title) {
        return new Video(title);
    }

    public Audio getAudioTrack() {
        return new UaAudio();
    }

    public Subtitles getSubtitlesFile() {
        return new UaSubtitles();
    }
}
