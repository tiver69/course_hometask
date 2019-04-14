package task3.afactory.factory;

import task3.afactory.Video;
import task3.afactory.audio.Audio;
import task3.afactory.audio.EngAudio;
import task3.afactory.subtitles.EngSubtitles;
import task3.afactory.subtitles.Subtitles;

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
