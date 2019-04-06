package task4.prototype;

public class Article implements Cloneable{
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
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

    @Override
    protected Article clone() {
        return new Article(title,content,author);
    }

    @Override
    public String toString() {
        return String.format("\"%s\", %s\n%s", title, author, content);
    }
}
