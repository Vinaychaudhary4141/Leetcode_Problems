// Last updated: 9/21/2025, 7:55:46 PM
import java.util.PriorityQueue;

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(b[0], a[0])
        );

        for (int[] c : classes) {
            int pass = c[0], total = c[1];
            double gain = gain(pass, total);
            pq.offer(new double[]{gain, pass, total});
        }

        while (extraStudents-- > 0) {
            double[] top = pq.poll();
            int pass = (int) top[1];
            int total = (int) top[2];

            pass++;
            total++;

            double newGain = gain(pass, total);
            pq.offer(new double[]{newGain, pass, total});
        }

        double sum = 0.0;
        while (!pq.isEmpty()) {
            double[] cur = pq.poll();
            int pass = (int) cur[1];
            int total = (int) cur[2];
            sum += (double) pass / total;
        }

        return sum / classes.length;
    }

    private double gain(int pass, int total) {
        double before = (double) pass / total;
        double after = (double) (pass + 1) / (total + 1);
        return after - before;
    }
}
