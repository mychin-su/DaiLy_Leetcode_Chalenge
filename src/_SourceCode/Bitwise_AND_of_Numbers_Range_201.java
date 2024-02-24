package _SourceCode;

public class Bitwise_AND_of_Numbers_Range_201 {
	public static int rangeBitwiseAnd(int left, int right) {
		int shifts = 0;
		// Find common leftmost bits of left and right
		while (left < right) {
			left >>= 1; // di chuyển tất cả các bit của left sang phải một vị trí, và thêm một số 0 vào
						// bên trái số hạng
			right >>= 1; // di chuyển tất cả các bit của right sang phải một vị trí, và thêm một số 0 vào
							// bên trái số hạng
			shifts++;
		}
		System.out.println();
		// Left shift common bits to the right by the number of shifts
		return left << shifts; // dịch trai shifts vị trí nghĩa là thêm các số 0 ở cuối vị trí và dịch sang
								// trái vì 2 = 0000 0010 và dịch 1 trang trái=> 0000 0100 = 4
	}

	public static void main(String[] args) {
		System.out.println(rangeBitwiseAnd(4, 7));
	}
}
