/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irfandi
 */
public class Main {

    public static void main(String[] args) {
        Database db = new Database();
        System.out.println("db.get() // mengambil semua data");
        db.get();
        System.out.println("\n");
        System.out.println("db.get(104) // mengambil data dengan id=104");
        db.get(104);
        System.out.println("\n");
        System.out.println("db.get(\"Gaji Pokok, 2000) // mengambil semua data yang memiliki gajiPokok = 2000");
        db.get("Gaji Pokok",2000);
        System.out.println("\n");
        System.out.println("db.get(\"tunjangan, \"<=\", 1000) // mengambil semua data yang memiliki tunjangan <= 1000");
        db.get("Tunjangan", "<=", 1000);
        System.out.println("\n");
        System.out.println("db.get(\"bonus\", \">\", 450) // mengambil semua data yang memiliki bonus > 450");
        db.get("Bonus", ">", 450);
    }
}
