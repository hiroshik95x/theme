package curriculum_23;

// Objectsパッケージ利用の宣言
import java.util.Objects;

/*

	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください

	動物名：ライオン
	体長：2.1m
	速度：80km/h

 */

public class Main {

	public static void main(String[] args) {

		// Qes_23クラスをインスタンス化
		Qes_23 qes23Class = new Qes_23();

		// 各変数に値を代入
		String animalText = "ライオン";
		double animalLengthText = 2.1;
		int speedText = 80;

		// 各setterメソッドに値を代入した変数を渡す
		qes23Class.setAnimal(animalText);
		qes23Class.setAnimalLength(animalLengthText);
		qes23Class.setSpeed(speedText);

		// nullチェック
		if(Objects.nonNull(qes23Class)) {

			// animalの値を取得し、コンソール出力
			System.out.println("動物名：" + qes23Class.getAnimal());

			// animalLengthの値を取得し、コンソール出力
			System.out.println("体長：" + qes23Class.getAnimalLength() + "m");

			// speedの値を取得し、コンソール出力
			System.out.println("速度：" + qes23Class.getSpeed() + "km/h");

		}

	}

}
