package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// Q1 下記9個をローカル変数として宣言のみしてください
		
		// ・バイト型
		byte byt;
		// ・短整数型
		short sht;
		// ・整数型
		int it;
		// ・長整数型
		long lng;
		// ・単精度浮動小数点数型
		float flo;
		// ・倍精度浮動小数点数型
		double dbl;
		// ・文字型
		char chr;
		// ・文字列型
		String str;
		// ・ブーリアン型
		boolean bool;
		
		// Q2 それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		
		// ・バイト型
		byt = 0;
		// ・短整数型
		sht = 0;
		// ・整数型
		it = 0;
		// ・長整数型
		lng = 0L;
		// ・単精度浮動小数点数型
		flo = 0.0f;
		// ・倍精度浮動小数点数型
		dbl = 0.0d;
		// ・文字型
		chr = '\u0000';
		// ・文字列型
		str = null;
		// ・ブーリアン型
		bool = false;
		
		// Q3 初期化をしたそれぞれの変数に下記の値を代入してください
		
		// ・バイト型 10
		byt = 10;
		// ・短整数型 100
		sht = 100;
		// ・整数型 1000
		it = 1000;
		// ・長整数型 10000
		lng = 10000L;
		// ・単精度浮動小数点数型 9.5
		flo = 9.5f;
		// ・倍精度浮動小数点数型 10.5
		dbl = 10.5d;
		// ・文字型 a
		chr = 'a';
		// ・文字列型 ハロー
		str = "ハロー";
		// ・ブーリアン型 true
		bool = true;
		
		// Q4 下記の通りにコンソール出力されるようにしてください
		// 上記で作成した変数を必ず使用すること
		
		// 11110
		System.out.println(byt + sht + it + lng);
		// 20
		System.out.println(flo + dbl);
		// a ハロー true
		System.out.println(chr + " " + str + " " + bool);
		// 11130  数字を全て足す
		System.out.println(byt + sht + it + lng + flo + dbl);
		// 10000000000  小数点以外の数字を全てかける
		System.out.println(byt * sht * it * lng);
		// 0.105  10.5割る100をする
		System.out.println(dbl / sht);
		// -90  10引く100をする
		System.out.println(byt - sht + "\n");
		
		// Q5 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		// 「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		// String num="20";
		// int num1=23;
		// System.out.println("ハローJAVA"+(num+num1));
		
		int num = 20; // 文字列型を整数型に変更
		int num1 = 23;
		// 43を代入
		int num2 = num + num1;
		// ハローJAVA43
		System.out.println("ハローJAVA" + num2 + "\n");
		
		// Q6 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		// ローカル変数に代入し○○に入れてください
		// 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		
		// 山田太郎
		String fullName = "山田太郎";
		// 18
		int age = 18;
		// 170.5
		double height = 170.5;
		// 62.2
		double weight = 62.2;
		// 寿司
		String food = "寿司";
		// 「初めまして○○です」
		System.out.println("初めまして" + fullName + "です");
		// 「年齢は○○歳です」
		System.out.println("年齢は" + age + "歳です");
		// 「身長は○○cmです」
		System.out.println("身長は" + height + "cmです");
		// 「体重は○○kgです」
		System.out.println("体重は" + weight + "kgです");
		// 「好きな食べ物は○○です」
		System.out.println("好きな食べ物は" + food + "です" + "\n");
		
		// Q7 6で作成した自己紹介に続いてBMIが出力されるようにしてください
		// 「BMIは○○です」
		// ただし計算は数値を直書きせず、全て変数を使ってすること
		
		// 小数点第２位で切り上げたBMIの数値を代入
		double bmi = Math.ceil(weight / ((height / sht) * (height / sht))* sht) /sht;
		// 「BMIは○○です」
		System.out.println("BMIは" + bmi + "です" + "\n");
		
		// Q8 6で宣言した変数に再代入し下記の通りコンソールに出力してください
		
		//鈴木一郎
		fullName = "鈴木一郎";
		// 24
		age = 24;
		// 168.5
		height = 168.5;
		// 64.2
		weight = 64.2;
		// オムライス
		food = "オムライス";
		// 初めまして鈴木一郎です
		System.out.println("初めまして" + fullName + "です");
		// 年齢は24歳です
		System.out.println("年齢は" + age + "歳です");
		// 身長168.5cmです
		System.out.println("身長は" + height + "cmです");
		// 体重は64.2kgです
		System.out.println("体重は" + weight + "kgです");
		// 好きな食べ物はオムライスです
		System.out.println("好きな食べ物は" + food + "です");
		// BMIは22.6です
		// 小数点第１位までのBMI数値を代入
		String bmiDecimalPoint1 = String.format("%.1f" , weight / ((height / 100) * (height / 100)));
		// 出力する処理
		System.out.println("BMIは" + bmiDecimalPoint1 + "です" + "\n");
		
		// Q9 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		
		// 年齢の自己代入
		age += age ;
		// 身長の自己代入
		height += height;
		// 体重の自己代入
		weight += weight;
		// 初めまして鈴木一郎です
		System.out.println("初めまして" + fullName + "です");
		// 年齢は48歳です
		System.out.println("年齢は" + age + "歳です");
		// 身長337.0cmです
		System.out.println("身長は" + height + "cmです");
		// 体重は128.4kgです
		System.out.println("体重は" + weight + "kgです");
		// 好きな食べ物はオムライスです
		System.out.println("好きな食べ物は" + food + "です");
		// BMIは11.31です	
		// 小数点第２位までのBMI数値を代
		String bmiDecimalPoint2 = String.format("%.2f" , weight / ((height / 100) * (height / 100)));
		// 出力する処理
		System.out.println("BMIは" + bmiDecimalPoint2 + "です" + "\n");
		
		// Q10 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		
		// 代入
		age = 24;
		// 年齢が25以上であればtrueを返す
		boolean str2 = age >= 25;
		// 結果を出力
		System.out.println(str2 + "\n");
		
		// Q11 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		
		// 代入
		age = 24;
		// 代入
		height = 168.5;
		// 代入
		weight = 64.2;
		// 年齢
		String ageStr = String.valueOf(age);
		// 身長
		String heightStr = String.valueOf(height);
		// 体重
		String weightStr = String.valueOf(weight);
		// 出力する処理
		System.out.println(ageStr + heightStr + weightStr + "\n");
		
		// Q12 11で変換した【年齢・身長】を整数型に変換して出力してください
		// 文字列型を整数型へ変換
		int ageInt = Integer.parseInt(ageStr);
		// 身長をdouble値に変換し、int型にキャスト
		int heightInt = (int)Double.parseDouble(heightStr);
		// 出力する処理
		System.out.println(ageInt);
		System.out.println(heightInt + "\n");
		
		// Q13 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		// ただしif文は使わないでください
		// 年齢・身長どちらかが条件を満たしていればtrueを返す
		boolean str3 = ageInt == 25 || heightInt >= 160;
		// 結果を出力
		System.out.println(str3);
		
	}

}
