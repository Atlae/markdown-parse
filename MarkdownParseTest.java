import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class MarkdownParseTest {
    //declare a test method
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

@Test 
 public void Testgetlinks()throws IOException{

    Path fileName = Path.of("Test-file.md");
	String contents = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(contents);
    assertEquals(List.of("https://something.com","some-page.html"),links);
 }
 @Test 
 public void Testgetlink2()throws IOException{

    Path fileName = Path.of("Test-file2.md");
	String contents = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(contents);
    assertEquals(List.of("something.in"),links);
 }
 @Test 
 public void Testgetlink3()throws IOException{

    Path fileName = Path.of("Test-file3.md");
	String contents = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(contents);
    assertEquals(List.of("rocknroll.com","wowcserocks.com","profpolitzisprettychill.com","gotritons.edu"),links);
 }
 @Test 
 public void Testgetlink4()throws IOException{

    Path fileName = Path.of("Test-file4.md");
	String contents = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(contents);
    assertEquals(List.of(),links);
 }
}
