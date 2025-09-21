// Last updated: 9/21/2025, 7:55:35 PM
import java.util.*;

class FoodRatings {
    private static class FoodEntry {
        String name;
        int rating;
        FoodEntry(String name, int rating) {
            this.name = name;
            this.rating = rating;
        }
    }

    private final Map<String, String> foodToCuisine;
    private final Map<String, Integer> foodToRating;
    private final Map<String, PriorityQueue<FoodEntry>> cuisineToPQ;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodToCuisine = new HashMap<>();
        foodToRating = new HashMap<>();
        cuisineToPQ = new HashMap<>();

        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];

            foodToCuisine.put(food, cuisine);
            foodToRating.put(food, rating);

            cuisineToPQ.computeIfAbsent(cuisine, k -> new PriorityQueue<>((a, b) -> {
                if (b.rating != a.rating) return b.rating - a.rating;
                return a.name.compareTo(b.name);
            })).offer(new FoodEntry(food, rating));
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine = foodToCuisine.get(food);
        foodToRating.put(food, newRating);
        cuisineToPQ.get(cuisine).offer(new FoodEntry(food, newRating));
    }

    public String highestRated(String cuisine) {
        PriorityQueue<FoodEntry> pq = cuisineToPQ.get(cuisine);
        while (true) {
            FoodEntry top = pq.peek();
            if (top == null) return ""; // shouldn't happen per constraints
            int current = foodToRating.get(top.name);
            if (top.rating == current) return top.name;
            pq.poll();
        }
    }
}
