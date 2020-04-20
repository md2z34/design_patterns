package simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CsvBookReader implements BookReader{
    @Override
    public Book readBook(InputStreamReader inputStreamReader) {
        char[] buffer = new char[0];
        try (BufferedReader br = new BufferedReader(inputStreamReader)) {
            String line = br.readLine();
            String[] parts = line.split(";");
            return new Book(parts[0], parts[1]);
        } catch (Exception e) {
            throw new IllegalStateException("Error parsing csv", e);
        }
    }
}
