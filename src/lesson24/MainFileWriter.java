package lesson24;

import java.io.FileWriter;
import java.io.IOException;

public class MainFileWriter {

    public static void main(String[] args) throws IOException {

        String fileContent = "Hello Learner !! Welcome to howtodoinjava.com.";

        usingFileWriter(fileContent);




    }

    public static void usingFileWriter(String content) throws IOException
    {


        FileWriter fileWriter = new FileWriter("/Users/oleksandr/IdeaProjects/JavaLesson/src/myFile.txt");
        fileWriter.write(content);
        fileWriter.close();
    }
}
