import java.io.*;

public class Bai_2 {
    public static void main(String[] args) throws IOException {
        File file = new File("dulieu.txt");
        FileReader fr = new FileReader(file);
       try(BufferedReader br = new BufferedReader(fr)) {
           String line;
           while ((line = br.readLine()) != null){
               System.out.println(line);
       }

        }catch (IOException e){
           System.out.println(e.getMessage());
       }




//        FileReader fr = new FileReader(file);
//        int i;
//        while ((i = fr.read()) != -1){
//            System.out.println((char) i);
//        }

    }
}
