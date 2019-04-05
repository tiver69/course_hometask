package task3.factory;

import task3.Video;
import task3.audio.Audio;
import task3.audio.RusAudio;
import task3.subtitles.RusSubtitles;
import task3.subtitles.Subtitles;

public class RusMovieFactory implements MovieFactory {
    public Video getVideoFromArchive(String title) {
        return new Video(title);
    }

    public Audio getAudioTrack() {
        return new RusAudio();
    }

    public Subtitles getSubtitlesFile() {
        return new RusSubtitles();
    }
}
