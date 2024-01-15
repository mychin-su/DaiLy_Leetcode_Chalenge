package _SourceCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Minimum_Index_Sum_of_Two_Lists_599 {
	public String[] findRestaurant(String[] list1, String[] list2) {
		Map<String, Integer> map = new HashMap<String, Integer>(); // Tạo map chưa key là String và value là index
		List<String> list = new ArrayList<String>(); // list chua cac giá trị trong mảng thỏa mản điều kiện
		int sum = Integer.MAX_VALUE; // biết sum để tính tổng giá trị index của 2 mảng
		for (int i = 0; i < list1.length; i++) {
			map.put(list1[i], i); // thêm mảng list1 vào trong map
		}
		for (int i = 0; i < list2.length; i++) { // lặp qua list2
			Integer k = map.get(list2[i]); // lấy giá trị index của list2 dựa trên key trùng nhau
			if (k != null && k + i < sum) { // kiểm tra != null và tổng nhỏ hơn sum
				list.clear(); // xóa sạch list
				sum = k + i; // cập nhật lại sum nhỏ hơn
				list.add(list2[i]); // thêm vào list
			} else if (k != null && k + i <= sum) { // neu gia tri bawng sum
				list.add(list2[i]); // them vao trong list
			}
		}
		return list.toArray(new String[list.size()]); // chuyen list ve Array
	}

	public static void main(String[] args) {

	}
}
