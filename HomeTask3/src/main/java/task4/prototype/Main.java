package task4.prototype;

public class Main {
    public static void main(String[] args) {

        Article article = Wiki.getArticle("Car");
        article.setAuthor("Me");
        article.setContent("Very useful information about cars.");
        Wiki.updateArticle(article);

        Wiki.printWiki();
    }
}
