package simplefactory;

public class BookReaderFactory {

    public BookReader reader(String fileType) {
        if (fileType.equals("csv")) {
            return new CsvBookReader();
        } else if (fileType.equals("xml")) {
            return new XmlBookReader();
        } else {
            throw new IllegalArgumentException("Invalid file type");
        }
    }
}
