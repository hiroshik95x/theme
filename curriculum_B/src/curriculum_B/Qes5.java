package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {

		// 課題5の出力
		System.out.println("課題5" + "\n");

		// 縦の行
		for(int i = 1; i <= 9; i++) {

			// 横の行
			for(int j = 1; j <= 20; j++) {

				// 横 × 縦の値を代入
				int timesTables = j * i;
				
				// 計算結果を表示
				System.out.print(String.format("%03d", j) + "\s" + "*" + "\s" + String.format("%03d", i) + "\s" + "=" + "\s" + String.format("%03d", timesTables));

				// 「||」の表示数
				if(j < 20) {
					
					// 「||」の出力
					System.out.print("\s" + "||" + "\s");

				}

			}

			// 改行
			System.out.println();

		}

	}

}