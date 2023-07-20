package process;

// Randomパッケージの使用宣言
import java.util.Random;

// サブクラス
public class Status extends Name {

	// 各フィールドに変数を定義
	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int defence;
	private int[] statusArray = {hp, mp, attack, speed, defence};

	// 乱数の準備
	Random random = new Random();

	// コンストラクタ
	public Status(String userName) {

		// 親クラスのコンストラクタを呼び出し
		super(userName);

		for(int i = 0; i < statusArray.length; i++) {

			// 配列にランダム値を代入
			this.statusArray[i] = random.nextInt(1000) + 1;

			// 各値を各フィールド変数に初期値として格納
			this.hp = statusArray[0];
			this.mp = statusArray[1];
			this.attack = statusArray[2];
			this.speed = statusArray[3];
			this.defence = statusArray[4];

		}

	}

	@Override
	public String toString() {

		// スーパークラスの文字列を呼び出し、文字列を返す
		return  super.toString() + "HP：" + getHp() + "\n" + "MP：" + getMp() + "\n" + "攻撃力：" + getAttack() + "\n" + "素早さ：" + getSpeed() + "\n" + "防御力：" + getDefence() + "\n" + "さあ冒険に出かけよう！";

	}

	// setterメソッド
	public void setHp() {

		// ランダム値をフィールドに代入
		this.hp = statusArray[0];

	}

	// setterメソッド
	public void setMp() {

		// ランダム値をフィールドに代入
		this.mp = statusArray[1];

	}

	// setterメソッド
	public void setAttack() {

		// ランダム値をフィールドに代入
		this.attack = statusArray[2];

	}

	// setterメソッド
	public void setSpeed() {

		// ランダム値をフィールドに代入
		this.speed = statusArray[3];

	}

	// setterメソッド
	public void setDefence() {

		// ランダム値をフィールドに代入
		this.defence = statusArray[4];

	}

	// フィールドの値を取得
	public int getHp() {
		return hp;
	}

	// フィールドの値を取得
	public int getMp() {
		return mp;
	}

	// フィールドの値を取得
	public int getAttack() {
		return attack;
	}

	// フィールドの値を取得
	public int getSpeed() {
		return speed;
	}

	// フィールドの値を取得
	public int getDefence() {
		return defence;
	}

}