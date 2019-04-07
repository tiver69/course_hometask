package task3;

import task3.afactory.Language;
import task3.afactory.MovieRental;

public class MainAFactory {
    public static void main(String[] args) {

        System.out.println(MovieRental.getMovie("Avengers", Language.ENG));
        System.out.println(MovieRental.getMovie("Star Trek", Language.RUS));

    }
}
