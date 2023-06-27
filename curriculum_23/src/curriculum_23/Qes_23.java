package curriculum_23;

/*

	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください

	動物名：ライオン
	体長：2.1m
	速度：80km/h

 */

public class Qes_23 {

	// 各フィールドに変数を定義
	private String animal;
	private double animalLength;
	private int speed;

	// フィールドanimalの値を取得
	public String getAnimal() {
		return animal;
	}

	// フィールドanimalLengthの値を取得
	public double getAnimalLength() {
		return animalLength;
	}

	// フィールドspeedの値を取得
	public int getSpeed() {
		return speed;
	}

	// animalのsetterメソッド
	public void setAnimal(String animal) {

		// 受け取った値「ライオン」をフィールドanimalに代入
		this.animal = animal;

	}

	// AnimalLengthのsetterメソッド
	public void setAnimalLength(double animalLength) {

		// 受け取った値「2.1m」をフィールドanimalLengthに代入
		this.animalLength = animalLength;

	}

	// Speedのsetterメソッド
	public void setSpeed(int speed) {

		// 受け取った値「80km/h」をフィールドspeedに代入
		this.speed = speed;

	}

}
