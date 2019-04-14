package task3.afactory.factory;

import task3.afactory.Video;
import task3.afactory.audio.Audio;
import task3.afactory.audio.RusAudio;
import task3.afactory.subtitles.RusSubtitles;
import task3.afactory.subtitles.Subtitles;

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
