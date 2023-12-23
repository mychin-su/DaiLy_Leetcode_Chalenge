package _SourceCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Path_Crosing_1496 {
	public boolean isPathCrossing(String path) {
		Set<List<Integer>> set = new HashSet<>();
		int x = 0, y = 0;
		set.add(Arrays.asList(0, 0));
		for (char c : path.toCharArray()) {
			if (c == 'N')
				y++;
			if (c == 'S')
				y--;
			if (c == 'W')
				x--;
			if (c == 'E')
				x++;
			if (set.contains(Arrays.asList(x, y)))
				return true;
			else
				set.add(Arrays.asList(x, y));
		}
		return false;
	}
}
