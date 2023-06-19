package curriculum_B;

//Objectsパッケージ利用の宣言
import java.util.Objects;
//Randomパッケージ利用の宣言
import java.util.Random;
//Scannerパッケージ利用の宣言
import java.util.Scanner;
//Patternパッケージ利用の宣言
import java.util.regex.Pattern;

public class Qes1_3 {

	public static void main(String[] args) {

		// ユーザー名入力の準備
		Scanner scan = new Scanner(System.in);

		while(true) {

			// 標準入力値(改行までの1行分)を取得
			String userName = scan.nextLine();

			// 文字数で分岐するために文字列の長さを取得
			int userNameNum = userName.length();

			// mullを代入
			String nothing = null;
			boolean nothingNull = Objects.isNull(nothing);

			// 半角英数字以外の場合の出力
			if(Pattern.matches("^[^0-9a-zA-Z]+$", userName)) {
				System.out.println("｢半角英数字のみで名前を入力してください｣" + "\n");
				continue;
			}
			// 文字数が１０文字以上の場合の出力
			else if(userNameNum > 10) {
				System.out.println("｢名前を10文字以内にしてください｣" + "\n");
				continue;
			}
			// 文字入力なし、nullの場合の出力
			else if(userNameNum <= 0 || userName.equals(nothingNull)) {
				System.out.println("｢名前を入力してください｣" + "\n");
				continue;
			}
			// 半角英数字１〜１０文字以内の場合の出力
			else if(userName.matches("^[0-9a-zA-Z]+$")) {
				System.out.println("ユーザー名｢" + userName + "｣を登録しました");
			}

			// ループ継続フラグ
			boolean loopFlag = true;

			// 乱数を準備
			Random rand = new Random();

			// じゃんけん入力の準備
			Scanner userScan = new Scanner(System.in);

			// じゃんけんの回数を格納
			int count = 0;

			// じゃんけんに勝つまでループする
			do {

				// じゃんけんの結果を格納
				String judge = "notWin";

				// judgeが"notWin"の限りループする
				while(judge.equals("notWin")) {

					// ユーザーの入力値を取得
					int userHand = userScan.nextInt();

					// 相手の手をランダム
					int npcHand = rand.nextInt(3);

					// ユーザーの手を出力する処理
					// ユーザーの手を格納する
					String userJanken = "";
					// ０の場合、"グー"を格納
					if(userHand == 0) {
						userJanken = "グー";
					}
					// １の場合、"チョキ"を格納
					else if(userHand == 1) {
						userJanken = "チョキ";
					}
					// ２の場合、"パー"を格納
					else if(userHand == 2) {
						userJanken = "パー";
					}

					// 相手の手を出力する処理
					// 相手の手を格納する
					String npcJanken = "";
					// ０の場合、"グー"を格納
					if(npcHand == 0) {
						npcJanken = "グー";
					}
					// １の場合、"チョキ"を格納
					else if(npcHand == 1) {
						npcJanken = "チョキ";
					}
					// ２の場合、"パー"を格納
					else if(npcHand == 2) {
						npcJanken = "パー";
					}

					// ユーザーの手を出力
					System.out.println(userName + "の手は｢" + userJanken + "｣");

					// 相手の手を出力
					System.out.println("相手の手は｢" + npcJanken + "｣" + "\n");

					count ++;

					judge = jankenjudge(userHand, npcHand);

				}

				if(judge == "win") {

					// 勝った時の表示
					System.out.println("やるやん。" + "\n" + "次は俺にリベンジさせて" + "\n");

					// じゃんけんの回数を表示
					System.out.println("勝つまでにかかった合計回数は" + count + "回です");

					// ループ継続フラグを使用して、じゃんけん終了
					loopFlag = false;

				}
				// グーに負けた時の表示
				else if(judge == "loseGoo") {
					System.out.println("俺の勝ち！" + "\n" + "負けは次につながるチャンスです！" + "\n" + "ネバーギブアップ！");
				}
				// チョキに負けた時の表示
				else if(judge == "loseScissors") {
					System.out.println("俺の勝ち！" + "\n" + "たかがじゃんけん、そう思ってないですか？" + "\n" + "それやったら次も、俺が勝ちますよ");
				}
				// パーに負けた時の表示
				else if(judge == "losePar") {
					System.out.println("俺の勝ち！" + "\n" + "なんで負けたか、明日まで考えといてください。" + "\n" + "そしたら何かが見えてくるはずです");
				}
				// あいこの時の表示
				else if(judge == "aiko") {
					System.out.println("DRAW" + "\n" + "あいこ" + "\n" + "もう一回しましょう！");
				}

			}
			// loopFlafがtrueの限りループ
			while(loopFlag == true);

		}

	}

	// じゃんけんの結果を返すメソッド
	public static String jankenjudge(int userHand, int npcHand) {

		// 初期値を設定
		String judge = "notWin";

		// 勝った時
		if((userHand == 0 && npcHand == 1) || (userHand == 1 && npcHand == 2) || (userHand == 2 && npcHand == 0)) {
			judge = "win";
		}
		// グーに負けた時
		else if(userHand == 1 && npcHand == 0) {
			judge = "loseGoo";
		}
		// チョキに負けた時
		else if(userHand == 2 && npcHand == 1) {
			judge = "loseScissors";
		}
		// パーに負けた時
		else if(userHand == 0 && npcHand == 2) {
			judge = "losePar";
		}
		// あいこの時
		else {
			judge = "aiko";
		}

		// じゃんけんの処理を結果として返す
		return judge;
	}

}