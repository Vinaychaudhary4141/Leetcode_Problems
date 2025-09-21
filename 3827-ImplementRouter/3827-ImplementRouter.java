// Last updated: 9/21/2025, 7:54:59 PM
import java.util.*;

class Router {
    private int memoryLimit;
    private Deque<int[]> queue; // stores packets in FIFO order
    private Set<String> packetSet; // to detect duplicates
    private Map<Integer, List<Integer>> destToTimestamps; // destination -> timestamps

    public Router(int memoryLimit) {
        this.memoryLimit = memoryLimit;
        this.queue = new ArrayDeque<>();
        this.packetSet = new HashSet<>();
        this.destToTimestamps = new HashMap<>();
    }

    public boolean addPacket(int source, int destination, int timestamp) {
        String key = source + "#" + destination + "#" + timestamp;
        if (packetSet.contains(key)) return false; // duplicate

        // Evict oldest if memory limit exceeded
        if (queue.size() == memoryLimit) {
            int[] old = queue.poll();
            String oldKey = old[0] + "#" + old[1] + "#" + old[2];
            packetSet.remove(oldKey);

            // remove timestamp from map
            List<Integer> tsList = destToTimestamps.get(old[1]);
            tsList.remove(0); // oldest timestamp is always at front
            if (tsList.isEmpty()) destToTimestamps.remove(old[1]);
        }

        // Insert new packet
        queue.offer(new int[]{source, destination, timestamp});
        packetSet.add(key);

        // Update map
        destToTimestamps.putIfAbsent(destination, new ArrayList<>());
        destToTimestamps.get(destination).add(timestamp);

        return true;
    }

    public int[] forwardPacket() {
        if (queue.isEmpty()) return new int[] {};

        int[] packet = queue.poll();
        String key = packet[0] + "#" + packet[1] + "#" + packet[2];
        packetSet.remove(key);

        // update map
        List<Integer> tsList = destToTimestamps.get(packet[1]);
        tsList.remove(0);
        if (tsList.isEmpty()) destToTimestamps.remove(packet[1]);

        return packet;
    }

    public int getCount(int destination, int startTime, int endTime) {
        if (!destToTimestamps.containsKey(destination)) return 0;

        List<Integer> tsList = destToTimestamps.get(destination);

        // binary search for range count
        int left = lowerBound(tsList, startTime);
        int right = upperBound(tsList, endTime);

        return right - left;
    }

    // first index >= target
    private int lowerBound(List<Integer> list, int target) {
        int l = 0, r = list.size();
        while (l < r) {
            int mid = (l + r) / 2;
            if (list.get(mid) >= target) r = mid;
            else l = mid + 1;
        }
        return l;
    }

    // first index > target
    private int upperBound(List<Integer> list, int target) {
        int l = 0, r = list.size();
        while (l < r) {
            int mid = (l + r) / 2;
            if (list.get(mid) > target) r = mid;
            else l = mid + 1;
        }
        return l;
    }
}
