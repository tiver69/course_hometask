package task4.memento;

public class ArticleBackup {

    private String title;
    private String content;
    private String author;

    public ArticleBackup(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }
}
