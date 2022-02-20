package myChapter1;

public class DataTypes {

	public static void main(String[] args) {

		// バイト型変数
		// 新しいバイト型の変数を宣言する
		byte tryByte = 1;
		System.out.print("変数tryByteのデータ型は");
		// displayTypeメソッドで変数のデータ型を出力する
		displayType(tryByte);

		// 以下はバイト型と同じ

		int tryInt = 1;
		System.out.print("変数tryIntのデータ型は");
		displayType(tryInt);

		long tryLong = 1L;
		System.out.print("変数tryLongのデータ型は");
		displayType(tryLong);

		float tryFloat = 3.14f;
		System.out.print("変数tryFloatのデータ型は");
		displayType(tryFloat);

		double tryDouble = 3.14;
		System.out.print("変数tryDoubleのデータ型は");
		displayType(tryDouble);

		char tryChar = 'a';
		System.out.print("変数tryCharのデータ型は");
		displayType(tryChar);

		boolean tryBoolean = true;
		System.out.print("変数tryBooleanのデータ型は");
		displayType(tryBoolean);
	}

	// displayTypeメソッドを定義する
	public static void displayType(Object a) {
		StringBuilder dataType = new StringBuilder();
		// StringBuilder型の変数を通じて、文字列化された引数のデータ型を格納する
		// getClassメソッドで引数のデータ型をゲットした後、String型に変換する（文字列化する）
		// ゲットしたデータ型はclass java.lang.〇〇〇の形なので、17位から後ろの文字列を出力する
		for (int i = 16; i < a.getClass().toString().length(); i++) {
			dataType.append(a.getClass().toString().charAt(i));
		}
		System.out.println(dataType + "型");
	}
	
	// getTypeメソッドを定義する
	public static String getType(Object a) {
		// getClassメソッドで引数のデータ型をゲットした後、文字列に変換して戻す
		return a.getClass().toString();

	}

}
