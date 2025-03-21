package string;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // If no flowers need to be planted, return true immediately
        if (n == 0) {
            return true;
        }

        int size = flowerbed.length;

        for (int i = 0; i < size; i++) {
            // Check if the current spot is empty
            if (flowerbed[i] == 0) {
                // Check if the left neighbor is empty (or it's the first position)
                boolean leftEmpty = (i == 0 || flowerbed[i - 1] == 0);

                // Check if the right neighbor is empty (or it's the last position)
                boolean rightEmpty = (i == size - 1 || flowerbed[i + 1] == 0);

                // If both left and right neighbors are empty, plant a flower
                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1; // Mark this spot as planted
                    n--; // Reduce the number of flowers left to plant

                    // If all required flowers are planted, return true
                    if (n == 0) {
                        return true;
                    }
                }
            }
        }

        // If after the loop, n flowers are not planted, return false
        return false;
    }
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        CanPlaceFlowers solution = new CanPlaceFlowers();
        System.out.println(solution.canPlaceFlowers(flowerbed,n));
    }
}
