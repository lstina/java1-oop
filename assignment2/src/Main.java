import java.nio.file.*;
import java.io.*;


class Main {
    void main() {
        Path membersFile = Paths.get("assignment2/gym_members.txt");

        try (BufferedReader br = Files.newBufferedReader(membersFile)) {

             String line;

             while ((line = br.readLine()) != null){
                 IO.println(line);
        }

     }  catch(IOException e){
        e.printStackTrace();
    }

    }
}
