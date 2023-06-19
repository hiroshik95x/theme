package basicClass;

//SimpleDateFormatパッケージ利用の宣言
import java.text.SimpleDateFormat;
//Calendarパッケージ利用の宣言
import java.util.Calendar;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。

		// Dogクラスの呼び出し
		Dog dogClass = new Dog();

		// 動物の名前をコンソール出力
		System.out.println(dogClass.dog);


		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。

		// Dogクラスの呼び出し
		Dog dogClass2 = new Dog(5);
		
		// 動物の数をコンソール出力
		System.out.println(dogClass2.num);


		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

		//Calendarクラスのオブジェクトを生成する
		Calendar cl = Calendar.getInstance();

		// SimpleDateFormatクラスを使用して、パターンを設定する
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");

		// コンソール出力
		System.out.print(sdf.format(cl.getTime()));
	}

}
