package _SourceCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Insert_Delete_GetRandom_380 {
	static class RandomizedSet {
		private List<Integer> list;
		Map<Integer, Integer> map;
		Random random;

		public RandomizedSet() {
			list = new ArrayList<Integer>();
			map = new HashMap<Integer, Integer>();
			random = new Random();
		}

		public boolean insert(int val) {
			if (map.containsKey(val)) {
				return false;
			}
			map.put(val, list.size());
			list.add(val);
			return true;
		}

		public boolean remove(int val) {
			if (!map.containsKey(val)) {
				return false;
			}
			int index = map.get(val);
			int lastIdx = list.size() - 1;
			if (index != lastIdx) {
				int lastVal = list.get(lastIdx);
				list.set(index, lastVal);
			}
			list.remove(lastIdx);
			map.remove(val);
			return true;
		}

		public int getRandom() {
			return list.get(random.nextInt(list.size()));
		}

		public static void main(String[] args) {
			RandomizedSet rd = new RandomizedSet();
			rd.insert(1);
			rd.insert(2);
			rd.insert(3);
			rd.insert(4);
			rd.remove(2);

		}
	}
}
