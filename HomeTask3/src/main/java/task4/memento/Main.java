package task4.memento;

public class Main {
    public static void main(String[] args) {
        Article article = Wiki.getArticle("Car");
        Wiki.printWiki();

        article.setAuthor("Me");
        article.setContent("Very useful information about cars.");
        Wiki.printWiki();

        Wiki.restoreArticle("Car");
        Wiki.printWiki();
    }
}
