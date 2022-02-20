import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DataTypeTest {
	
	@Test
	void DataTypesTest() {
		// バイト型変数
		// 新しいバイト型の変数を宣言する
		byte tryByte = 1;
		// getTypeメソッドで変数のデータ型をゲットする
		String typeByte = getType(tryByte);
		// ゲットしたデータ型はclass java.lang.〇〇〇の形なので、それを正しい結果と比較する
		assertEquals("class java.lang.Byte", typeByte);

		// 以下はバイト型と同じ方法でテストする

		int tryInt = 1;
		String typeInt = getType(tryInt);
		assertEquals("class java.lang.Integer", typeInt);

		long tryLong = 1L;
		String typeLong = getType(tryLong);
		assertEquals("class java.lang.Long", typeLong);

		float tryFloat = 3.14f;
		String typeFloat = getType(tryFloat);
		assertEquals("class java.lang.Float", typeFloat);

		double tryDouble = 3.14;
		String typeDouble = getType(tryDouble);
		assertEquals("class java.lang.Double", typeDouble);

		char tryChar = 'a';
		String typeChar = getType(tryChar);
		assertEquals("class java.lang.Character", typeChar);

		boolean tryBoolean = true;
		String typeBoolean = getType(tryBoolean);
		assertEquals("class java.lang.Boolean", typeBoolean);

	}

	// getTypeメソッドを定義する
	public static String getType(Object a) {
		// getClassメソッドで引数のデータ型をゲットした後、文字列に変換して戻す
		return a.getClass().toString();

	}
}
