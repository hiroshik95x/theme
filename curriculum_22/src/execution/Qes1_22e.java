package execution;

/*
下記がコンソールに出力されるように作成してください

	こんにちは！ここは日本です！
	この寿司はうまい
	寿司は和食です
	今の現在日時は2023/03/09 10:23:39です

【条件】
	・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
	・適切なファイルにフィールドで変数を必要な数作ってください。
	・thisを使って作成してください。
	・日時は今日の日付を取得してください。
 */

// processパッケージのqes1_22pクラスの使用宣言
import process.Qes1_22p;

// 実行用
public class Qes1_22e {

	public static void main(String[] args) {

		// Qes1_22pクラスの呼び出し
		Qes1_22p processClass = new Qes1_22p();

		// 各コンソール出力
		System.out.println(processClass.helloJapan);
		System.out.println(processClass.sushi);
		System.out.println(processClass.japaneseMeal);
		System.out.println(processClass.dateTime);

	}

}