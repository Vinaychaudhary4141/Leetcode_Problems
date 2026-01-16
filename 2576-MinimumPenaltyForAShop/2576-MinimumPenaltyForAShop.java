// Last updated: 1/16/2026, 10:13:41 PM
class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();

        // Initial penalty: all 'Y' because shop is closed from hour 0
        int penalty = 0;
        for (char c : customers.toCharArray()) {
            if (c == 'Y') penalty++;
        }

        int minPenalty = penalty;
        int bestHour = 0;

        // Move closing hour from 0 to n
        for (int i = 0; i < n; i++) {
            if (customers.charAt(i) == 'Y') {
                penalty--;   // one less closed-hour customer
            } else {
                penalty++;   // one more open-hour with no customer
            }

            if (penalty < minPenalty) {
                minPenalty = penalty;
                bestHour = i + 1;
            }
        }

        return bestHour;
    }
}