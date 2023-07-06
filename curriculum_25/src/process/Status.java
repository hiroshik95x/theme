package process;

// サブクラス
public class Status extends Name {

	// 各フィールドに変数を定義
	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int defence;

	// コンストラクタ
	public Status(String userName, int hp, int mp, int attack,  int speed, int defence) {

		// 親クラスのコンストラクタを呼び出し
		super(userName);

		// 引数で受け取った各値を各フィールド変数に初期値として格納
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
		this.speed = speed;
		this.defence = defence;

	}

	// hpのsetterメソッド
	public void setHp(int hp) {

		// 受け取ったランダム値をフィールドanimalに代入
		this.hp = hp;

	}

	// mpのsetterメソッド
	public void setMp(int mp) {

		// 受け取ったランダム値をフィールドanimalに代入
		this.mp = mp;

	}

	// attackのsetterメソッド
	public void setAttack(int attack) {

		// 受け取ったランダム値をフィールドanimalに代入
		this.attack = attack;

	}

	// speedのsetterメソッド
	public void setSpeed(int speed) {

		// 受け取ったランダム値をフィールドanimalに代入
		this.speed = speed;

	}

	// defenceのsetterメソッド
	public void setDefence(int defence) {

		// 受け取ったランダム値をフィールドanimalに代入
		this.defence = defence;

	}

	// フィールドhpの値を取得
	public int getHp() {
		return hp;
	}

	// フィールドmpの値を取得
	public int getMp() {
		return mp;
	}

	// フィールドattackの値を取得
	public int getAttack() {
		return attack;
	}

	// フィールドspeedの値を取得
	public int getSpeed() {
		return speed;
	}

	// フィールドdefenceの値を取得
	public int getDefence() {
		return defence;
	}

}
