package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {

		// 課題4の出力
		System.out.println("課題4" + "\n");

		// 縦の行
		for(int i = 1; i <= 9; i++) {

			// 横の行
			for(int j = 1; j <= 9; j++) {

				// 縦 × 横の値を代入
				int timesTables = i * j;

				// 計算結果を表示
				System.out.print(String.format("%02d", i) + "\s" + "*" + "\s" + String.format("%02d", j) +  "\s" + "=" + "\s" + String.format("%02d", timesTables));

				// 「||」の表示数
				if(j < 9) {

					// 「||」の出力
					System.out.print("\s" + "||" + "\s");

				}

			}

			// 改行
			System.out.println();

		}

	}

}