package process;

//スーパークラス
class Name {

	// フィールドに変数を定義
	private String userName;

	// コンストラクタ
	public Name(String userName) {

		// ユーザー名入力値をフィールドに初期値として格納
		this.userName = userName;

	}

	@Override
	public String toString() {

		// 文字列を返す
		return "こんにちは 「 " + getUserName() + " 」 さん" + "\n" + "ステータス" + "\n";

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