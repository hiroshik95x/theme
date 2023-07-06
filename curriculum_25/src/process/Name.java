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

// スーパークラス
public class Name {

	// フィールドに変数を定義
	private String userName;

	// コンストラクタ
	public Name(String userName) {

		// 引数で受け取ったユーザー名入力値をフィールドuserNameに初期値として格納
		this.userName = userName;

	}

	// userNameのsetterメソッド
	public void setUserName(String userName) {

		// 受け取った値「ユーザー名の入力値」をフィールドuserNameに代入
		this.userName = userName;

	}

	// フィールドuserNameの値を取得
	public String getUserName() {
		return userName;
	}

}


