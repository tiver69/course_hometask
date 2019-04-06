package task4.memento;

import java.util.ArrayList;
import java.util.List;

public class Wiki {
    private static List<Article> wiki = new ArrayList<Article>();

    public static Article getArticle(String title){
        for (Article article:wiki) {
            if (article.getTitle().equals(title))
                return article;
        }
        Article newArticle = new Article(title,"","");
        wiki.add(newArticle);
        newArticle.save();
        return newArticle;
    }

    public static void  restoreArticle(String title){
        for (Article article : wiki) {
            if (article.getTitle().equals(title))
                article.restore();
        }
    }

    public static void printWiki() {
        for (Article article: wiki) {
            System.out.println(article);
        }
    }
}
