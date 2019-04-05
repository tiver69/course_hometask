package task3.factory;

import task3.Video;
import task3.audio.Audio;
import task3.audio.EngAudio;
import task3.subtitles.EngSubtitles;
import task3.subtitles.Subtitles;

public class EngMovieFactory implements MovieFactory {
    public Video getVideoFromArchive(String title) {
        return new Video(title);
    }

    public Audio getAudioTrack() {
        return new EngAudio();
    }

    public Subtitles getSubtitlesFile() {
        return new EngSubtitles();
    }
}
