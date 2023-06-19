package curriculum_B;

// Scannerパッケージ利用の宣言
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {

		// 出力
		System.out.print("生徒の人数を入力してください（2以上）: ");

		// 生徒数入力の準備
		Scanner studentScan = new Scanner(System.in); 
		// 生徒数入力値の取得
		int line = studentScan.nextInt();

		// 生徒数入力分の配列要素を確保
		int[] scores = new int[line];

		// 点数入力の準備
		Scanner pointsScan = new Scanner(System.in);

		// 科目を配列に格納
		String subject[] = {"英語", "数学", "理科", "社会"};
		
		// 科目点数入力値を格納する配列を作成
		int[] sub = new int[4];

		// 各教科の点数
		for(int i = 0; i < scores.length; i++) {

			for(int j = 0; j < 4; j++) {

				// 人数分の各科目の点数を出力
				System.out.print((i + 1) + "人目の『" + subject[j] + "』の点数を入力してください :");

				// 点数入力値を変数に代入
				int pointsline = pointsScan.nextInt();

				// 点数の入力値を配列要素へ順番に入力する
				scores[i] += pointsline;
				sub[j] += pointsline;
			}

			// 改行
			System.out.println();

		}

		// 人数分の平均点
		for(int i = 0; i < scores.length; i++) {

			// 各人の平均値を代入
			double scoresAverage = (double)scores[i] / subject.length;

			// 小数点第２位までの平均点を代入
			String scoresAverage2 = String.format("%.2f", scoresAverage);

			// 各人の合計点の平均を出力
			System.out.println((i + 1) + "人目の平均点は" + scoresAverage2 + "点です。");

		}

		// 改行
		System.out.println();

		// 全体の平均点を格納
		double totalAverage = 0.0;

		// 各科目の平均点
		for(int j = 0; j < subject.length; j++) {

			// 各科目の平均値を代入
			double subjectAverage = (double)sub[j] / scores.length;

			// 小数点第２位までの平均点を代入
			String subjectAverage2 = String.format("%.2f", subjectAverage);

			// 各科目の合計点の平均を出力
			System.out.println(subject[j] + "の平均点は" + subjectAverage2 + "点です。");

			// 全体の平均値を格納
			double subjectAverage3 = subjectAverage / subject.length;
			totalAverage += subjectAverage3;
		}

		// 全体の合計点の平均を出力
		System.out.println("全体の平均点は" + String.format("%.2f", totalAverage) + "点です。");

	}

}