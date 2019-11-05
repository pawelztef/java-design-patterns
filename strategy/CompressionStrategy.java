import java.util.ArrayList;
import java.io.File;
public interface CompressionStrategy {
  void compressFiles(ArrayList<File> files);
}