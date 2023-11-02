import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public static List<String> getPermutations(String input) {
        // Check for null or empty input
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string is null or empty.");
        }

        List<String> permutations = new ArrayList<>();
        generatePermutations(input.toCharArray(), 0, permutations);
        return permutations;
    }

    private static void generatePermutations(char[] arr, int index, List<String> permutations) {
        if (index == arr.length - 1) {
            permutations.add(String.valueOf(arr));
        } else {
            for (int i = index; i < arr.length; i++) {
                // Swap characters
                char temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;

                // Recursively generate permutations
                generatePermutations(arr, index + 1, permutations);

                // Swap characters back to original position
                temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        try {
            String input = "123";
            List<String> result = getPermutations(input);
            for (String permutation : result) {
                System.out.println(permutation);
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}