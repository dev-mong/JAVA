package card;

public class CardMain2 {
	
	public static void main(String[] args)
	{
		// 인스턴스 생성
//		Card c1 = new Card();
//		c1.kind="Heart";
//		c1.number=7;
//		
//		//인스턴스 생성
//		Card c2 = new Card();
//		c2.kind="spade";
//		c2.number=4;
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=13;j++) {
				String kind ="";
				
				switch(i) {
				case 0:
					kind = "spade";
					break;
				case 1:
					kind = "heart";
					break;
				case 2:
					kind = "spade";
					break;
				case 3:
					kind = "spade";
					break;
					
				}
				
				Card c = new Card();
				c.kind = kind;
				c.number = j;
				System.out.println("카드의 높이는 " + Card.height+"넓이는 "+Card.width+"종류는 "+c.kind+" 카드의 수 "+c.number);
				
			}
		}
		
		
	}
}
