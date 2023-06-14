package curriculum_New_question;
// Arraysパッケージ利用の宣言
import java.util.Arrays;
// Randomパッケージ利用の宣言
import java.util.Random;

public class Curriculum_New_1_18 {

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください

		// Q1メソッドの呼び出し
		hello();

		// Q2メソッドの呼び出し
		product(2, 2);

		// Q3メソッドの呼び出し
		// 整数型の配列を定義し、引数に渡す
		int[] arrays = {1, 2};
		order(arrays);

		// Q4メソッドの呼び出し
		overload(1.0, 2.0);

		// Q5メソッドの呼び出し、averageメソッドの引数に渡す
		int[] array2 = random(2);

		// Q6メソッドの呼び出し、boolメソッドの引数に渡す
		double heikin = average(array2);

		// Q7メソッドの呼び出し
		bool(heikin);

	}

	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void hello() {

		// 「Hello JavaSE 」を変数に代入
		String str = "Hello JavaSE ";

		// 「11」を変数に代入
		int it = 11;

		// コンソール出力
		System.out.println(str + it + "\n");

	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void product(int num1, int num2) {

		// 乗算結果を変数に格納
		int nums = num1 * num2;

		// コンソール出力
		System.out.println(nums + "\n");

	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void order(int[] arrays) {

		for(int i = 0; arrays.length > i; i++) {

			// 配列を順番に出力
			System.out.println(arrays[i]);

		}

	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void overload(double num1, double num2) {

		// 和算結果を変数に格納
		double nums = num1 + num2;

		// コンソール出力
		System.out.println("\n" + nums + "\n");
	}


	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] random(int nums) {

		// 配列を作成
		int[] array = new int[nums];

		// 配列分繰り返す
		for(int i = 0; i < nums; i++) {

			// 乱数を準備
			Random rand = new Random();

			// 1〜100までランダム
			array[i] = rand.nextInt(100) + 1;

			// コンソール出力
			System.out.println(array[i]);

		}
		// 配列の処理結果を返す
		return array;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double average(int[] array2) {

		// int配列からdouble配列に変換
		double[] nums2 = Arrays.stream(array2).asDoubleStream().toArray();

		// 平均値の受け取り
		double heikin = 0;

		// 配列の和算結果の受け取り
		double nums3 = 0;

		for(int i = 0; i < nums2.length; i++) {

			// nums3に配列分を和算
			nums3 += nums2[i];

			// 平均値の計算結果を変数に代入
			heikin = nums3 / array2.length;

		}
		// コンソール出力
		System.out.println("\n" + heikin);

		// 処理結果を返す	
		return heikin;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static void bool(double heikin) {

		// 50以上以下を判断
		boolean heikinBool = heikin >= 50 ? true : false;

		// コンソール出力
		System.out.println("\n" + heikinBool);
	}
}
