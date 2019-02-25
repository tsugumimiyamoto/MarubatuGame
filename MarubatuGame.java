import java.util.Scanner;
public class MarubatuGame {
	public static void main(String [] args) {

		//masuに3を代入し、マス目3×3にする。
		int masu=3;
		int [][] masume=new int [masu][masu];
		for(int y=0; y<masu;y++) {
			for(int x=0; x<masu; x++) {
			}
		}

		//ゲームの説明
		System.out.println("◯×ゲームです。");
		System.out.println("player1は◯、player2は×です。");
		System.out.println("0〜2の数字を2回入力してください。");

		//" "⇒0、"◯"⇒1、"×"⇒2
		String mark[] = {" ", "◯", "×"};
		Scanner sc = new Scanner(System.in);

		//ターンが増えてくごとにプレイヤーが変わる。（例：ターン0⇒0%2+1=1になるから◯の番、ターン1⇒1%2+1=2になるから×の番）
		for(int turn = 0; turn < masu*masu ; turn++){
			int player = turn%2+1;
			System.out.println("Player"+player+"の番です");

			int number1,number2;
			do {
				//横の数字入力（x）
				System.out.println("1個目の数字を入力してください。");
				number1=sc.nextInt();
				//縦の数字入力（y）
				System.out.println("2個目の数字を入力してください。");
				number2=sc.nextInt();
			//number1,2が0より少ない || masuより大きい || 0以外（1か2だともう入っている）置けないような指示。
			}while(number1<0 || number2<0 || number1>=masu || number2>=masu || masume[number1][number2]!=0);
			//マス目に1or2が置ける。（◯か×を代入）例：マス目0、0⇒プレイヤー1だったら◯が置かれる
			masume[number1][number2] = player;

			//マス目を記入。1個目の|⇒マス目の左側に|を入れる指示。2個目⇒" "、"◯"、"×"の右側に|を入れる指示。（例：◯|）
			for(int y=0; y<masu; y++){
				String row = "|";
				for(int x=0; x<masu; x++){
					row+=mark[masume[x][y]]+"|";
				}
				System.out.println(row);
			}
			//今置いたところに関わっている縦、横、ななめを調べればいい。
			//横　number2を置いた横1行のみ調べて、◯×の数を数える。tmpが3になれば、そのプレイヤーの勝利。
			int tmp=0;
			for(int x=0; x<masu; x++) {
				if(masume[x][number2]==player)tmp++;
			}
			if(tmp==masu)syouri(player);

			//縦　number1を置いた横1行のみ調べて、◯×の数を数える。tmpが3になれば、そのプレイヤーの勝利。
			tmp=0;
			for(int y=0; y<masu; y++) {
				if(masume[number1][y]==player)tmp++;
			}
			if(tmp==masu)syouri(player);

			//ななめ　[0][0]、[1][1]、[2][2]を調べて、◯×の数を数える。tmpが3になれば、そのプレイヤーの勝利。
			tmp=0;
			for(int x=0; x<masu; x++) {
				if(masume[x][x]==player)tmp++;
			}
			if(tmp==masu)syouri(player);

			//ななめ　[2][0]、[1][1]、[0][2]を調べて、◯×の数を数える。tmpが3になれば、そのプレイヤーの勝利。
			tmp=0;
			for(int x=0; x<masu; x++) {
				if(masume[x][masu-1-x]==player)tmp++;
			}
			if(tmp==masu)syouri(player);
		}
		System.out.println("引き分けです。");
	}
	private static void syouri(int player) {
		System.out.println("Player"+player+"の勝利です。");
		System.out.println("◯×ゲーム終了です。");
		System.exit(0);
	}
}