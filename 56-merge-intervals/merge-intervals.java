class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        // Step 1: Sort by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];
        result.add(current);

        // Step 2: Merge intervals
        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            if (current[1] >= next[0]) {
                // Overlap → merge
                current[1] = Math.max(current[1], next[1]);
            } else {
                // No overlap → move forward
                current = next;
                result.add(current);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
