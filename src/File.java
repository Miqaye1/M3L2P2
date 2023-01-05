
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class File {
    public static void main(String[] args) {
        try {
            byte[] file1 = Files.readAllBytes(Paths.get("src/file1.txt"));
            byte[] file2 = Files.readAllBytes(Paths.get("src/file2.txt"));
            int length;
            if(file1.length >= file2.length){
                length = file1.length;
            }
            else{
                length = file2.length;
            }
            for(int i = 0; i < length; i++){
                if(file1.length <= i){
                    System.out.println(" != " + (char)file2[i]);
                }
                else if(file2.length <= i){
                    System.out.println((char)file1[i] + " != ");
                 }
                else if(file1[i] == file2[i]){
                    System.out.println((char)file1[i]+" = " + (char)file2[i]);
                }
                else if(file1[i] != file2[i]){
                    System.out.println((char)file1[i] + " != " + (char)file2[i]);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
