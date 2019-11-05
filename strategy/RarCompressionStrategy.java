import java.util.ArrayList;
import java.io.File;
public class RarCompressionStrategy implements CompressionStrategy {
  public void compressFiles(ArrayList<File> files) {
    System.out.println("Files compressed to rar file.");
  }
}