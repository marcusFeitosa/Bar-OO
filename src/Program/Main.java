package Program;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		char gender;
		int beer, softDrink, barbecue;
		
		System.out.print("Sexo: ");
		gender=sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		beer=sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		softDrink=sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		barbecue=sc.nextInt();
		
		Bill bill=new Bill(gender, beer, barbecue, softDrink);
		
		System.out.println("\n\nRELATORIO:");
		System.out.printf("Consumo= R$%.2f\n",bill.feeding());
		if(bill.cover()==0)
			System.out.println("Isento de Couvert");
		else
			System.out.printf("Couvert= R$%.2f\n",bill.cover());
		System.out.printf("Ingresso= R$%.2f\n",bill.ticket());
		
		System.out.printf("\nValor a pagar = R$%.2f",bill.total());
		
		sc.close();

	}

}
