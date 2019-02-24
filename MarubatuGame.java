import java.util.Scanner;

public class MarubatuGame {

	public static void main(String [] args) {

		int masu=3;
		int [][] masume=new int [masu][masu];

	System.out.println("◯×ゲームです。");
	System.out.println("player1は◯、player2は×です。");
	System.out.println("0〜2の数字を2回入力してください。");

	Scanner sc = new Scanner(System.in);
	String mark[] = {" ", "◯", "×"};
	for(int turn = 0; turn < masu*masu ; turn++){
		int player = turn%2+1;
		System.out.println("Player"+player+"の番です");

		int number1,number2;
		System.out.println("1個目の数字を入力してください。");
		number1=sc.nextInt();
		System.out.println("2個目の数字を入力してください。");
		number2=sc.nextInt();

		if(number1<0 || number2<0 || number1>=masu || number2>=masu || masume[number1][number2]!=0);masume[number1][number2] = player;
		for(int i=0; i<masu; i++){
			String row = "|";
			for(int j=0; j<masu; j++){
				row+=mark[masume[i][j]]+"|";
			}
			System.out.println(row);
		}
		//縦
		System.out.println("player"+player+"の勝利");
		//横
		System.out.println("player"+player+"の勝利");
		//ななめ
		System.out.println("player"+player+"の勝利");
		//引き分け
		System.out.println("引き分け");
		//終了
		System.exit(0);
	}
	}
}
