package marbleGame;
import card.Card;

public class Player {
	
	Card c = new Card();
	
	int numofMarble; // 구슬의 개수
	
	Player(int num){
		numofMarble=num; // 구슬 초기화 
	}
	
	//구슬의 개수 설정
	void setMarble(int num) {
		numofMarble = num;

	}
	
	//내가 이길 때 
	void gameWin(Player p,int num) { //새로운 플레이어 생성한 것
		numofMarble+=num;
		p.numofMarble-=num; //상대방의 구슬 개수를 빼줌 
	}
	
	//구슬의 개수 출력
	void showData() {
		System.out.println("현재 보유한 구슬의 개수는 "+numofMarble+"개 입니다.");
	}
	
	public static void main(String[] args) {
		//1번 사용자 생성
		Player p1 = new Player(15);
		//2번 사용자 생성
		Player p2 = new Player(9);
		
		//1번은 15개 보유, 2번은 9개 보유 => 생성자를 만들면 메서드 필요 X
		//p1.setMarble(15);
		//p2.setMarble(9);
		
		System.out.println("1번 사용자는 "+p1.numofMarble+" 보유 2번 사용자는 "+p2.numofMarble+" 보유");
		System.out.println("------------게임결과--------------------");
		
		//1차 게임 결과 
		System.out.println("1차 게임에서 1번 사용자는 2번 사용자의 구슬을 2개 획득");
		p1.gameWin(p2, 2);
		System.out.print("1번 사용자 >>  ");
		p1.showData();
		System.out.print("2번 사용자 >>  ");
		
		p2.showData();
		System.out.println("------------게임결과--------------------");
		//2차 게임 결과
		System.out.println("1차 게임에서 2번 사용자는 1번 사용자의 구슬을 7개 획득");
		p1.gameWin(p1, 7);
		System.out.print("1번 사용자 >>  ");
		p1.showData();
		System.out.print("2번 사용자 >>  ");
		p2.showData();
		
	
	}

}

