package myChapter1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataTypesTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		// バイト型変数
		// 新しいバイト型の変数を宣言する
		byte tryByte = 1;
		// getTypeメソッドで変数のデータ型をゲットする
		String typeByte = DataTypes.getType(tryByte);
		// ゲットしたデータ型はclass java.lang.〇〇〇の形なので、それを正しい結果と比較する
		assertEquals("class java.lang.Byte", typeByte);

		// 以下はバイト型と同じ方法でテストする

		int tryInt = 1;
		String typeInt = DataTypes.getType(tryInt);
		assertEquals("class java.lang.Integer", typeInt);

		long tryLong = 1L;
		String typeLong = DataTypes.getType(tryLong);
		assertEquals("class java.lang.Long", typeLong);

		float tryFloat = 3.14f;
		String typeFloat = DataTypes.getType(tryFloat);
		assertEquals("class java.lang.Float", typeFloat);

		double tryDouble = 3.14;
		String typeDouble = DataTypes.getType(tryDouble);
		assertEquals("class java.lang.Double", typeDouble);

		char tryChar = 'a';
		String typeChar = DataTypes.getType(tryChar);
		assertEquals("class java.lang.Character", typeChar);

		boolean tryBoolean = true;
		String typeBoolean = DataTypes.getType(tryBoolean);
		assertEquals("class java.lang.Boolean", typeBoolean);
	}

}
