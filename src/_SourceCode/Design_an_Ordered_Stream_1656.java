package _SourceCode;

import java.util.ArrayList;
import java.util.List;

public class Design_an_Ordered_Stream_1656 {
	private int ptr; // con tro ptr bat dau tu dau mang
	private String arr[]; // mang String chua cac value cua insert

	public Design_an_Ordered_Stream_1656(int n) {
		this.ptr = 0; // bat dau tu vi tri 0
		this.arr = new String[n]; // mang Strnig chia n gia tri
	}

	public List<String> insert(int idKey, String value) {
		List<String> ans = new ArrayList<String>();
		arr[idKey - 1] = value;
		while (ptr < arr.length && arr[ptr] != null) { // ptr chay tu dau den cuoi mang va phan tu trong mang phai co
														// gia tri
			ans.add(arr[ptr++]);
		}
		return ans;
	}

	public static void main(String[] args) {
		Design_an_Ordered_Stream_1656 daos = new Design_an_Ordered_Stream_1656(5);
		System.out.println(daos.insert(3, "cccc"));
		System.out.println(daos.insert(1, "aaaa"));
		System.out.println(daos.insert(2, "bbbb"));
		System.out.println(daos.insert(5, "eeee"));
		System.out.println(daos.insert(4, "ddddd"));

	}
}
