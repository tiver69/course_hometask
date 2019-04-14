package task4;

import task4.prototype.Article;
import task4.prototype.Wiki;

public class MainPrototype {
    public static void main(String[] args) {

        Article article = Wiki.getArticle("Car");
        article.setAuthor("Me");
        article.setContent("Very useful information about cars.");
        Wiki.updateArticle(article);

        Wiki.printWiki();
    }
}
