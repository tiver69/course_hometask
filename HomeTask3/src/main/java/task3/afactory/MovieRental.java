package task3.afactory;

import task3.afactory.factory.MovieFactory;
import task3.afactory.audio.Audio;
import task3.afactory.factory.EngMovieFactory;
import task3.afactory.factory.RusMovieFactory;
import task3.afactory.factory.UaMovieFactory;
import task3.afactory.subtitles.Subtitles;

public class MovieRental {

    public static Movie getMovie(String title, Language language){
        MovieFactory movieFactory = MovieRental.getMovieFactory(language);

        Video video = movieFactory.getVideoFromArchive(title);
        Audio audio = movieFactory.getAudioTrack();
        Subtitles subtitles = movieFactory.getSubtitlesFile();

        Movie orderMovie = new Movie(video,audio,subtitles);

        return orderMovie;
    }


    static MovieFactory getMovieFactory(Language language){

        switch (language){
            case UA: return new UaMovieFactory();
            case ENG:return new EngMovieFactory();
            case RUS:return new RusMovieFactory();
        }
        throw new IllegalArgumentException("Wrong language!");
    }
}
