package curriculum_B;

// Randomパッケージ利用の宣言
import java.util.Random;
// Scannerパッケージ利用の宣言
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {

		// 商品を配列に格納
		String product[] = {"パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器", "テレビ", "ディスプレイ"};

		// 乱数を準備
		Random rand = new Random();

		// 商品配列の要素を取り出しながらブロック内処理
		for(String name : product) {

			// 入力の準備
			Scanner scan = new Scanner(System.in); 
			// 入力値の取得
			String line = scan.next();

			// 区切り文字を指定し、配列に格納
			String[] lineArray = line.split("、");

			// 商品の残り台数を0〜11までランダム
			int productRand = rand.nextInt(12);

			// 区切り文字「、」を取り出しながらブロック内処理
			for (String lines : lineArray) {

				switch(lines) {

				// パソコンが入力された場合
				case "パソコン":

					// 冷蔵庫が入力された場合
				case "冷蔵庫":

					// 扇風機が入力された場合
				case "扇風機":

					// 洗濯機が入力された場合
				case "洗濯機":

					// 加湿器が入力された場合
				case "加湿器":

					// パソコン〜加湿器までの在庫の出力
					System.out.println(lines + "の残り台数は" + productRand + "台です");
					break;

					// テレビが入力された場合
				case "テレビ":

					// ディスプレイが入力された場合
				case "ディスプレイ":

					// 乱数最大値11からテレビの乱数を引いた値を代入
					int productRand2 = (11 - productRand);

					// 入力値テレビで条件演算子を定義
					String str =  (lines.equals("テレビ")) ? "テレビの残り台数は" + productRand + "台です"
							: "ディスプレイの残り台数は" + productRand2 + "台です";

					// テレビもしくはディスプレイの在庫の出力
					System.out.println(str);
					break;

				// 商品一覧以外が入力された場合
				default:

					// 指定の商品ではないことを出力
					System.out.println("『" + lines + "』" + "は指定の商品ではありません");

				}

			}

		}

	}

}