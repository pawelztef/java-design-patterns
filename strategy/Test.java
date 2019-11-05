import java.util.ArrayList;
import java.io.File;

public class Test {
  public static void main(String... args) {
    CompressionContext context1 = new CompressionContext(new ZipCompressionStrategy());
    CompressionContext context2 = new CompressionContext(new RarCompressionStrategy());
    
    context1.createArchive(new ArrayList<File>());
    context2.createArchive(new ArrayList<File>());
  }
}