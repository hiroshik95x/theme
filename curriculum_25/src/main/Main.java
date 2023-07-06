package main;

// Objectsパッケージ利用の宣言
import java.util.Objects;
// Randomパッケージ利用の宣言
import java.util.Random;
// Scannerパッケージ利用の宣言
import java.util.Scanner;

// processパッケージのNameクラスの使用宣言
import process.Name;
// processパッケージのStatusクラスの使用宣言
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

		// 乱数の準備
		Random random = new Random();

		// 入力された「ユーザー名」を変数に代入
		String userName = scan.nextLine();

		// 各変数に1〜1000のランダム値を代入
		int hp = random.nextInt(1000) + 1;
		int mp = random.nextInt(1000) + 1;
		int attack = random.nextInt(1000) + 1;
		int speed = random.nextInt(1000) + 1;
		int defence = random.nextInt(1000) + 1;

		// スーパークラスのインスタンス化
		Name name = new Name(userName);

		// サブクラスのインスタンス化
		Status userStatus = new Status(userName, hp, mp, attack, speed, defence);

		// Nameクラスのsetterメソッドに値を代入した変数を渡す
		name.setUserName(userName);

		// Statusクラスの各setterメソッドにランダム値を代入した変数を渡す
		userStatus.setHp(hp);
		userStatus.setMp(mp);
		userStatus.setAttack(attack);
		userStatus.setSpeed(speed);
		userStatus.setDefence(defence);

		// nullチェック
		if(Objects.nonNull(name)) {

			// NameクラスのgetUserNameの値を取得し、コンソール出力
			System.out.println("こんにちは 「 " + name.getUserName() + " 」 さん");

		}

		// nullチェック
		if(Objects.nonNull(userStatus)) {

			// Statusクラスの各getterの値を取得し、コンソール出力
			System.out.println("ステータス");
			System.out.println("HP：" + userStatus.getHp());
			System.out.println("MP：" + userStatus.getMp());
			System.out.println("攻撃力：" + userStatus.getAttack());
			System.out.println("素早さ：" + userStatus.getSpeed());
			System.out.println("防御力：" + userStatus.getDefence());
			System.out.println("\n" + "さあ冒険に出かけよう！");

		}

	}

}
