package task4.memento;

public class Article {
    private String title;
    private String content;
    private String author;
    ArticleBackup backup;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
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

    public void save(){
        backup = new ArticleBackup(title, content, author);
    }

    public void restore( ){
        this.author = backup.getAuthor();
        this.content = backup.getContent();
        this.title = backup.getTitle();
    }

    @Override
    public String toString() {
        return String.format("\"%s\", %s\n%s", title, author, content);
    }
}
