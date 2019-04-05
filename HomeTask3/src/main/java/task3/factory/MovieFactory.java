package task3.factory;

import task3.Video;
import task3.audio.Audio;
import task3.subtitles.Subtitles;

public interface MovieFactory {
    Video getVideoFromArchive(String title);
    Audio getAudioTrack();
    Subtitles getSubtitlesFile();
}
