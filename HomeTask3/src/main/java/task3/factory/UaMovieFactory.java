package task3.factory;

import task3.Video;
import task3.audio.Audio;
import task3.audio.UaAudio;
import task3.subtitles.Subtitles;
import task3.subtitles.UaSubtitles;

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
