import Model.Purchase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int next = 1;

        Scanner scan = new Scanner(System.in);
        ArrayList<Purchase> receipt = new ArrayList<>();

        System.out.print("Informe o limite do cartão: ");
        double cardLimit = scan.nextDouble();
        while (next == 1){
            System.out.print("Digite a descrição da compra: ");
            String name = scan.next();
            System.out.print("Digite o valor da compra: ");
            double price = scan.nextDouble();

            if (price<=cardLimit){
                cardLimit-=price;
                Purchase purchase = new Purchase(name,price);
                receipt.add(purchase);
                System.out.println("Compra finalizada!");
                System.out.println("Deseja continuar a compra? \nDigite 1-sim 0-não");
                next = scan.nextInt();
            }else{
                System.out.println("Saldo Insuficiente!");
                next=0;
            }
        }
        // recibo
        System.out.println("**************************************");
        System.out.println("COMPRAS REALIZADAS");
        receipt.sort(Comparator.comparing(Purchase::getPrice));
        for (Purchase item:receipt) {
            System.out.println(item);
        }
        System.out.println("**************************************");
        System.out.println("Saldo do cartão: "+cardLimit);
    }
}
