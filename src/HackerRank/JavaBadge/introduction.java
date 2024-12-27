package HackerRank.JavaBadge;

import java.util.Scanner;

public class introduction {


    public void stdnintandoutpt() {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // to read the new line in the buffer
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }



}
