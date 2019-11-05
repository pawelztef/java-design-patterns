import java.util.ArrayList;
import java.io.File;
class ZipCompressionStrategy implements CompressionStrategy {
  public void compressFiles(ArrayList<File> files) {
    System.out.println("Files compressed to zip file");
  }
}