package process;

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

//スーパークラス
class Name {

	// フィールドに変数を定義
	private String userName;

	// コンストラクタ
	public Name(String userName) {

		// 引数で受け取ったユーザー名入力値をフィールドに初期値として格納
		this.userName = userName;

	}

	// setterメソッド
	public void setUserName(String userName) {

		// 受け取った値「ユーザー名の入力値」をフィールドに代入
		this.userName = userName;

	}

	// フィールドの値を取得
	public String getUserName() {
		return userName;
	}

}

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

	// setterメソッド
	public void setHp(int hp) {

		// 受け取ったランダム値をフィールドに代入
		this.hp = hp;

	}

	// setterメソッド
	public void setMp(int mp) {

		// 受け取ったランダム値をフィールドに代入
		this.mp = mp;

	}

	// setterメソッド
	public void setAttack(int attack) {

		// 受け取ったランダム値をフィールドに代入
		this.attack = attack;

	}

	// setterメソッド
	public void setSpeed(int speed) {

		// 受け取ったランダム値をフィールドに代入
		this.speed = speed;

	}

	// setterメソッド
	public void setDefence(int defence) {

		// 受け取ったランダム値をフィールドに代入
		this.defence = defence;

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
