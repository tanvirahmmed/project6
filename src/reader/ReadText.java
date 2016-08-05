package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by rrt on 7/31/2016.
 */
public class ReadText {
    public static void main(String[] args)throws IOException {
        String path = "C:\\Users\\rrt\\Documents\\core_java\\\\SeleniumJuly2016\\googleMoonShot.txt";
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            String text = "";
            while((text = br.readLine())!= null){
                  System.out.println(text);
            }
        }catch(Exception ex){
                System.out.println("Hey ! file is not found. fix the path");
        }finally{
            fr.close();
            br.close();
        }
    }
}
