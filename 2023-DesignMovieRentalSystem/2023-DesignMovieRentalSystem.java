// Last updated: 9/21/2025, 7:55:44 PM
import java.util.*;

class MovieRentingSystem {
    private static class Entry {
        int shop, movie, price;
        Entry(int s, int m, int p) {
            shop = s; movie = m; price = p;
        }
    }

    private Map<Integer, TreeSet<Entry>> available;

    private TreeSet<Entry> rented;

    private Map<String, Entry> entryMap;

    public MovieRentingSystem(int n, int[][] entries) {
        available = new HashMap<>();
        rented = new TreeSet<>((a, b) -> {
            if (a.price != b.price) return a.price - b.price;
            if (a.shop != b.shop) return a.shop - b.shop;
            return a.movie - b.movie;
        });
        entryMap = new HashMap<>();

        for (int[] e : entries) {
            int shop = e[0], movie = e[1], price = e[2];
            Entry entry = new Entry(shop, movie, price);

            available.computeIfAbsent(movie, k -> new TreeSet<>((a, b) -> {
                if (a.price != b.price) return a.price - b.price;
                return a.shop - b.shop;
            })).add(entry);

            entryMap.put(shop + "#" + movie, entry);
        }
    }

    public List<Integer> search(int movie) {
        List<Integer> result = new ArrayList<>();
        if (!available.containsKey(movie)) return result;

        Iterator<Entry> it = available.get(movie).iterator();
        for (int i = 0; i < 5 && it.hasNext(); i++) {
            result.add(it.next().shop);
        }
        return result;
    }

    public void rent(int shop, int movie) {
        Entry entry = entryMap.get(shop + "#" + movie);
        available.get(movie).remove(entry);
        rented.add(entry);
    }

    public void drop(int shop, int movie) {
        Entry entry = entryMap.get(shop + "#" + movie);
        rented.remove(entry);
        available.get(movie).add(entry);
    }

    public List<List<Integer>> report() {
        List<List<Integer>> result = new ArrayList<>();
        Iterator<Entry> it = rented.iterator();
        for (int i = 0; i < 5 && it.hasNext(); i++) {
            Entry e = it.next();
            result.add(Arrays.asList(e.shop, e.movie));
        }
        return result;
    }
}
