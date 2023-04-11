import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the mode: ");
        System.out.println("1. Mode 1");
        System.out.println("2. Mode 2");
        int mode = sc.nextInt();
        sc.nextLine();

        if (mode == 1) {
            ModeOne();
        } else if (mode == 2) {
            ModeTwo();
        } else {
            System.out.println("Invalid mode");
        }

        sc.close();
    }

    public static void ModeOne() {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Write the file name: ");
            String fileName = sc.nextLine();
            File file = new File("data/"+fileName + ".txt");
            Scanner fileReader = new Scanner(file);
            List<String> list = new ArrayList<String>();
    
            while (fileReader.hasNextLine()) {
               list.add(fileReader.nextLine());
            }
    
            String[] tpsize = list.get(0).split("=");
            int tp  = Integer.parseInt(tpsize[1]);
    
            String[] nfsize = list.get(1).split("=");
            int nf = Integer.parseInt(nfsize[1]);
    
            String[] ncsize = list.get(2).split("=");
            int nc = Integer.parseInt(ncsize[1]);
    
            String[] nrsize = list.get(3).split("=");
            int nr = Integer.parseInt(nrsize[1]);
    
            System.out.println("TP size: "+tp);
            System.out.println("NF size: "+nf);
            System.out.println("NC size: "+nc);
            System.out.println("NR size: "+nr);
    
            // Iterate through the rest of the file and print the values
    
            for (int i = 4; i < list.size(); i++) {
                String[] values = list.get(i).split(",");
                String page = values[1];
                
            }

    
            fileReader.close();
            sc.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }

    }

    public static void ModeTwo() {

    }
}