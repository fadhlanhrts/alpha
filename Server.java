/**
 * @author Muhammad Fadhlan Harits
 * @version 25 May 2021
 * The server class will be used for processing user input
 */
import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException{
        //Server will be configured to listen on port 3000
        ServerSocket ss = new ServerSocket(3000);
        Socket s = ss.accept();

        //Configuring variables to process input
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        //nodeA and nodeX will be used to store the number of attempts at nodeABC and nodeXYZ respectively
        String nodeA = bf.readLine();
        String nodeX = bf.readLine();
        
        System.out.println(nodeA + " ssh login attempts were made at nodeABC");
        System.out.println(nodeX + " ssh login attempts were made at nodeXYZ");
        System.out.println("");
        System.out.println("Metrics for ssh login attempts");
        System.out.println("* nodeABC had " + nodeA + " attempts");
        System.out.println("* nodeXYZ had " + nodeX + " attempts");
    }
}
