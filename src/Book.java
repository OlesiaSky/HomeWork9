public class Book {
    String Title;
    String Author;
    String Content;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
    public void show(){
        System.out.println("Title of the book: " + this.Title);
        System.out.println("Author of the book: " + this.Author);
        System.out.println("Content of the book: " + this.Content);
    }
}
