import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the file name: ");
        String fileName = sc.nextLine();
        File file = new File("data/"+fileName);
        Scanner fileReader = new Scanner(file);
        List<String> list = new ArrayList<String>();

        while (fileReader.hasNextLine()) {
           list.add(fileReader.nextLine());
        }

        // Read the first four rows of the file
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
            // split the string by , and get [0]
            String[] values = list.get(i).split(",");
            // print the values[0]
            System.out.println(values[0]);
        }

        fileReader.close();
        sc.close();



    }
}