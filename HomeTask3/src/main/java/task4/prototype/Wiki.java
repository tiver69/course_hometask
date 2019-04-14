package task4.prototype;

import java.util.ArrayList;

public class Wiki {

    private static ArrayList<Article> wiki = new ArrayList<Article>();

    public static Article getArticle(String title){
        for (Article article:wiki) {
            if (article.getTitle().equals(title))
                return article.clone();
        }
        Article newArticle = new Article(title,"","");
        wiki.add(newArticle);
        return newArticle.clone();
    }

    public static void  updateArticle(Article article){
        for (int i=0; i<wiki.size(); i++){
            if (wiki.get(i).getTitle().equals(article.getTitle()))
                wiki.set(i,article);
        }
    }

    public static void printWiki() {
        for (Article article: wiki) {
            System.out.println(article);
        }
    }
}
