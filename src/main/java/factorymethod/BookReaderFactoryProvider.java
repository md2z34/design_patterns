package factorymethod;

import java.util.HashMap;
import java.util.Map;

public class BookReaderFactoryProvider {
    private Map<String, BookReaderFactory> factories = new HashMap<String, BookReaderFactory>() {{
        put("csv", new CsvBookReaderFactory());
        put("xml", new XmlBookReaderFactory());
    }};

  public BookReaderFactory getBookReaderFactory(String type) {
      if (factories.containsKey(type)) {
          return factories.get(type);
      } else {
          throw new IllegalArgumentException("Illegal format: " + type);
      }
  }
}
