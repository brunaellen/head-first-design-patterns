package design.pattern.javaio.decorator;

import design.pattern.javaio.decorator.concrete.LowerCaseInputStream;

import java.io.*;

public class InputTest {
  public static void main(String[] args) {
    final File file = createFile();
    writeToFile(file);
    int c;

    try {
      InputStream inputStream = new LowerCaseInputStream(
          new BufferedInputStream(
              new FileInputStream(file.getName())));

      while ((c = inputStream.read()) >= 0) {
        System.out.print((char) c);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static File createFile() {
    final File file = new File("filename.txt");

    try {
      if (file.createNewFile()) {
        System.out.println("File created: " + file.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    return file;
  }

  private static void writeToFile(File file) {
    try {
      FileWriter myWriter = new FileWriter(file.getName());
      myWriter.write("I know the Decorator Pattern therefore I RULE!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  /*private static String readFile(File file) {
    String data = "";
    try {
      File myObj = new File(file.getName());
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        data = myReader.nextLine().toLowerCase();
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    return data;
  }*/
}
