package design.pattern.javaio.decorator.concrete;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
  /**
   * Creates a {@code FilterInputStream}
   * by assigning the  argument {@code inputStream}
   * to the field {@code this.inputStream} so as
   * to remember it for later use.
   *
   * @param inputStream the underlying input stream, or {@code null} if
   *                    this instance is to be created without an underlying stream.
   */
  public LowerCaseInputStream(InputStream inputStream) {
    super(inputStream);
  }

  public int read() throws IOException {
    int readResult = in.read();
    return (readResult == -1 ? readResult : Character.toLowerCase((char) readResult));
  }

  public int read(byte[] bytes, int offset, int length) throws IOException {
    int readResult = in.read(bytes, offset, length);

    for (int i = offset; i < offset + readResult; i++) {
      bytes[i] = (byte) Character.toLowerCase((char) bytes[i]);
    }
    return readResult;
  }
}
