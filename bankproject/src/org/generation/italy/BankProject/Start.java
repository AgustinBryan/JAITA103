package org.generation.italy.BankProject;
import org.generation.italy.BankProject.people.Client;
public class Start {
    public static void main (String[] args){
        String s = "pippo";
        Client c = new Client(); //questa riga sta creando un oggetto di classe client
        c.account.balance = 100;
        System.out.println(c.account.balance);
    }
    
}
