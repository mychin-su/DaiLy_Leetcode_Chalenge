package _SourceCode;

import java.util.Collections;
import java.util.PriorityQueue;

public class Furthest_Building_You_Can_Reach_1642 {
	public static int furthestBuilding(int[] heights, int bricks, int ladders) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // sắp xếp trong hàng đời giảm dần
		for (int i = 0; i < heights.length - 1; i++) {
			if (heights[i] >= heights[i + 1]) // nếu vị trí hiện tại đang đứng lớn hơn vị trí phía trước thì chúng ta
												// chỉ cần nhảy qua
				continue;

			bricks -= heights[i + 1] - heights[i]; // trừ số viên gạch nếu phía trước cao hơn phía sau
			pq.add(heights[i + 1] - heights[i]); // add vào pq

			if (bricks < 0) {
				bricks += pq.poll();
				if (ladders > 0)
					ladders--;
				else // het thang va het gach thi dung lai
					return i;
			}
		}
		return heights.length - 1;
	}

	public static void main(String[] args) {
		int heights[] = { 4, 2, 7, 6, 9, 14, 12 };
		int bricks = 5;
		int laders = 1;
		System.out.println(furthestBuilding(heights, bricks, laders));
	}
}
