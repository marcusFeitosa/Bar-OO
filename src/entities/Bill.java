package entities;

public class Bill {
	private char gender;
	private int beer;
	private int barbecue;
	private int softDrink;
	
	public Bill(char gender, int beer, int barbecue, int softDrink) {
		this.gender = gender;
		this.beer = beer;
		this.barbecue = barbecue;  //espetinho
		this.softDrink = softDrink; //refrigerante
	}
	
	public Bill() {
		
	}

	public char getGender() {
		return gender;
	}

	public int getBeer() {
		return beer;
	}

	public int getBarbecue() {
		return barbecue;
	}

	public int getSoftDrink() {
		return softDrink;
	}
//       ----------------------------------------  end getters      
	
	public double cover() {
		if(feeding()>=30)
		   return 0;
		else return 4.0;
	}
	
	public double feeding() {
		return beer*5+softDrink*3+barbecue*7;
	}
	
	public double ticket() {
		if(gender=='m')
		    return 10.0;
		else return 8.0;
	}
	
	public double total() {
		return cover()+feeding()+ticket();
	}
}
