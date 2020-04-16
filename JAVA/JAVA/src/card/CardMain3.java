package card;

public class CardMain3 {
	
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
				if(i==1)
				{
					Card c1 = new Card();
					c1.kind = "스페이드";
					c1.number = j;
					System.out.println("첫번째 카드는 "+c1.kind+" 이고, 숫자는"+ c1.number+"카드의 높이는 "+c1.height+"이고 폭은"+c1.width+"입니다.");
				}
				else if(i==2)
				{
					Card c2 = new Card();
					c2.kind = "하트";
					c2.number = j;
					System.out.println("두번째 카드는 "+c2.kind+" 이고, 숫자는"+ c2.number+"카드의 높이는 "+c2.height+"이고 폭은"+c2.width+"입니다.");
				}
				else if(i==3)
				{
					Card c3 = new Card();
					c3.kind = "클로버";
					c3.number = j;
					System.out.println("세번째 카드는 "+c3.kind+" 이고, 숫자는"+ c3.number+"카드의 높이는 "+c3.height+"이고 폭은"+c3.width+"입니다.");
				}
				else if(i==4)
				{
					Card c4 = new Card();
					c4.kind = "다이아";
					c4.number = j;
					System.out.println("첫번째 카드는 "+c4.kind+" 이고, 숫자는"+ c4.number+"카드의 높이는 "+c4.height+"이고 폭은"+c4.width+"입니다.");
				}
				
			}
		}
		
		
	}
}
