import java.util.Scanner;

public class MarubatuGame {
	public static void main(String[] args){

		System.out.println("◯×ゲームです。");
		System.out.println("先行は◯、後攻は×です。");
		System.out.println("0〜2の数字を入力してください。");

		System.out.println("◯の番です。");
		System.out.println("1個目の数字を入力してください。");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("2個目の数字を入力してください。");
		int b=sc.nextInt();

		String [][] masume=new String [3][3];
		for(int i=0;i<3;i++) {
			for(int j = 0;j < 3;j++ ){
				masume[i][j] = " ";
			}
			masume[0][0]="";
			masume[0][1]="";
			masume[0][2]="";
			masume[1][0]="";
			masume[1][1]="";
			masume[1][2]="";
			masume[2][0]="";
			masume[2][1]="";
			masume[2][2]="";

			System.out.print(" | | ");
			System.out.println("");
		}
	}
}
