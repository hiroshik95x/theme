package process;

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

// SimpleDateFormatパッケージ利用の宣言
import java.text.SimpleDateFormat;
// Calendarパッケージ利用の宣言
import java.util.Calendar;

// 処理用
public class Qes1_22p {

	// フィールドに変数を定義
	public String helloJapan;
	public String sushi;
	public String japaneseMeal;
	public String dateTime;

	public Qes1_22p() {

		// 各フィールドに代入
		this.helloJapan = "こんにちは！ここは日本です！";
		this.sushi = "この寿司はうまい";
		this.japaneseMeal = "寿司は和食です";

		// Calendarクラスのオブジェクトを生成する
		Calendar cl = Calendar.getInstance();

		// SimpleDateFormatクラスを使用して、パターンを設定する
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd H:m:s");

		// フィールドdateTimeに代入
		this.dateTime = "今の現在日時は" + sdf.format(cl.getTime()) + "です";

	}

}