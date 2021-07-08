import java.util.*;
import java.io.*;

import todos.*;

public class Program {
    public static void main(String[] args) {
        String fileName = "Todo.txt";
        ArrayList<String> list = new ArrayList<String>() {
            {
                add("Code");
                add("Work out");
                add("Eat");
                add("Sleep");
                add("Repeat");
            }
        };
        Todos todoList = new Todos(list);
        System.out.println(todoList.getTodos());

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
            for(String temp : todoList.getTodos()) {
                out.write(temp);
                out.newLine();
            }
            out.close();
            System.out.println("Content succesfully written to file.");
        } catch(Exception e) {
            System.out.println("Exception: " + e);
        }

        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
    
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                System.out.println("Read from file: " + str);
            }
            sc.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
        
        

    }
}