package task3.afactory.factory;

import task3.afactory.Video;
import task3.afactory.audio.Audio;
import task3.afactory.subtitles.Subtitles;

public interface MovieFactory {
    Video getVideoFromArchive(String title);
    Audio getAudioTrack();
    Subtitles getSubtitlesFile();
}
