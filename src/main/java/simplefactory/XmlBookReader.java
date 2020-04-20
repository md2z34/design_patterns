package simplefactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class XmlBookReader implements BookReader{
    @Override
    public Book readBook(InputStreamReader inputStreamReader) {
        try {
            JAXBContext ctx = JAXBContext.newInstance(Book.class);
            Unmarshaller unmarshaller = ctx.createUnmarshaller();
            return (Book) unmarshaller.unmarshal(new BufferedReader(inputStreamReader));
        }
        catch (Exception e) {
            throw new IllegalStateException("Error parsing xml", e);
        }
    }
}