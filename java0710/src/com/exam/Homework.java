package com.exam;

class Game {
	String nickname;
	String job;
	int level;
	void up() {
		System.out.println(job + " " + nickname + "의 " + "레벨이 " 
							+ level + "로 상승하였습니다.");
	}
}

public class Homework {
	
	public static void weOne(String name) {
		System.out.println("나의 이름은 " + name);
		name = "위재혁";
		System.out.println("아니야 나의 이름은 " + name);
	} // weOne
	
	public static void weTwo(int[] arr) {
	// 총합을 구했는데 평균으로 수정해야한다면...
	}
	
	public static void main(String[] args) {
		String name = "위재성";
		weOne(name);
		
		Game game;
		game = new Game(); 
		game.job = "전사";
		game.nickname = "옴므파탈";
		game.level = 99;
		game.up();
	// 게임의 강화 성공과 실패를 만들수 있을까?			
				
	} // main method 

} // class Homework
