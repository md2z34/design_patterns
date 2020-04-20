package simplefactory;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="book")
public class Book {
    @XmlElement(name="authors")
    private String authors;
    @XmlElement(name="title")
    private String title;

    public Book() {
    }

    public Book(String authors, String title) {
        this.authors = authors;
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public String getTitle() {
        return title;
    }
}
