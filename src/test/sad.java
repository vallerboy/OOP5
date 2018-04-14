package test;

import java.io.Console;
class sad {
    public static void main(String args[]) {
        StringBuilder pword = new StringBuilder("");
        Console con = System.console();
        System.out.println("User Name : asd");
        System.out.println("ala1");
        String name = con.readLine("User Name : ");
        char pass[] = con.readPassword("Password  : ");
        for (char c: pass) {
            pword.append(c);
        }

        if (name.equals("anonymous") & pword.toString().equals("anonymous ")) {
            System.out.print("Welcome");
        } else {
            System.out.print("Sorry");
        }
    }
}