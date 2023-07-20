package main;

// Objectsパッケージの使用宣言
import java.util.Objects;
// Scannerパッケージの使用宣言
import java.util.Scanner;

// processパッケージのNameクラスの使用宣言
import process.Status;

/*

名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

 */

public class Main {

	public static void main(String[] args) {

		// ユーザー名入力の準備
		Scanner scan = new Scanner(System.in);

		// 入力された「ユーザー名」を変数に代入
		String userName = scan.nextLine();

		// サブクラスのインスタンス化
		Status userStatus = new Status(userName);

		// nullチェック
		if(Objects.nonNull(userStatus)) {

			// 出力処理
			System.out.println(userStatus);

		}

		// コンソール入力を閉じる
		scan.close();

	}

}