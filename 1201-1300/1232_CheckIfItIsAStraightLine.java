class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int dx = coordinates[1][0] - coordinates[0][0];
        int dy = coordinates[1][1] - coordinates[0][1];

        for (int i = 2;i< coordinates.length;i++) {
            int curDx = coordinates[i][0] - coordinates[0][0];
            int curDy = coordinates[i][1] - coordinates[0][1];

            if (curDx * dy != curDy * dx) return false;
        }
        return true;
    }
}