package card;

public class Card {
	
	static int width=100;
	static int height=250;
	
	String kind;
	int number;
	
	
	Card(){
	}
			
	
	Card(String type,int num){ //매개변수를 두개 받아 초기화 
		kind = type;
		number = num;
	}
	
	
	
}
