/**
 * @author Muhammad Fadhlan Harits
 * @version 25 May 2021
 * The client class will be used for receiving user input
 */
import java.net.*;
import java.io.*;
import java.util.*;

public class Client{
    //two variables countA and countX will be used for counting the number of attempts
    static Integer countA = 0;
    static Integer countX = 0;
    
    public static void main(String[] args) throws IOException{
    
        Scanner sc = new Scanner(System.in);
        //The username and password for each node
        String nodeA = "nodeABC";
        String nodeX = "nodeXYZ";
        String passA = "PazA999";
        String passX = "PazZ111";

        //Login prompt
        System.out.println("Login: ");
        String login = sc.nextLine();
        //Checking if user gives nodeABC as an input
        if(login.equals(nodeA)){
            //the counter starts when username is equal to abc
            ++countA;
            System.out.println("Password: ");
            String pass = sc.nextLine();
            if (pass.equals(passA)) {
                System.out.println("Login successful");
            } else {
                System.out.println("");
                System.out.println("Login failed");
                
                main(args);
            }
        } 
        //Checking if user gives nodeXYZ as an input
        else if(login.equals(nodeX)){
            //the counter starts when username is equal to xyz
            ++countX;
            System.out.println("Password: ");
            String pass = sc.nextLine();
            if (pass.equals(passX)) {
                System.out.println("Login successful");
        
            } else {
                System.out.println("");
                System.out.println("Login failed");
                main(args);
            }
        } 

        else{
            System.out.println("");
            System.out.println("Login failed");
            main(args);
        }
        
        //port 3000 on localhost will be used to send and receive data
        Socket s = new Socket("localhost", 3000);
        PrintWriter pr = new PrintWriter(s.getOutputStream());

        //The number of counts in both nodes are being sent to server
        pr.println(countA.toString());
        pr.flush();
        pr.println(countX.toString());
        pr.flush();
    }
}