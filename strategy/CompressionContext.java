import java.util.ArrayList;
import java.io.File;
public class CompressionContext {
  private CompressionStrategy strategy;
  public CompressionContext(CompressionStrategy strategy) {
    this.strategy = strategy;
  }
  public void createArchive(ArrayList<File> files) {
    this.strategy.compressFiles(files);
  }
}