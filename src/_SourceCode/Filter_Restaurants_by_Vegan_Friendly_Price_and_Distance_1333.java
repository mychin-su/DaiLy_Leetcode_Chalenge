package _SourceCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Filter_Restaurants_by_Vegan_Friendly_Price_and_Distance_1333 {
	static class Triple {
		private int id;
		private int rate;

		Triple(int id, int rate) {
			this.id = id;
			this.rate = rate;
		}

	}

	public static List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice,
			int maxDistance) {
		ArrayList<Triple> arr = new ArrayList<>();
		int n = restaurants.length;
		if (veganFriendly == 1) {
			for (int i = 0; i < n; i++) {
				if (restaurants[i][2] == 1 && restaurants[i][3] <= maxPrice && restaurants[i][4] <= maxDistance) {
					arr.add(new Triple(restaurants[i][0], restaurants[i][1]));
				}
			}
		} else {
			for (int i = 0; i < n; i++) {
				if (restaurants[i][3] <= maxPrice && restaurants[i][4] <= maxDistance) {
					arr.add(new Triple(restaurants[i][0], restaurants[i][1]));
				}
			}
		}
		Collections.sort(arr, (a, b) -> b.rate == a.rate ? b.id - a.id : b.rate - a.rate);
		List<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < arr.size(); i++) {
			ans.add(arr.get(i).id);
		}
		return ans;
	}

	public static void main(String[] args) {
		int[][] restaurants = { { 1, 4, 1, 40, 10 }, { 2, 8, 0, 50, 5 }, { 3, 8, 1, 30, 4 }, { 4, 10, 0, 10, 3 },
				{ 5, 1, 1, 15, 1 } };
		int veganFriendly = 1;
		int maxPrice = 50;
		int maxDistance = 10;
		System.out.println(filterRestaurants(restaurants, veganFriendly, maxPrice, maxDistance));
	}
}
