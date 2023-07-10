import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
    public static void main(String[] args) {
        firstTask();
        System.out.println(" ");
        secondTask();
        System.out.println(" ");
        thirdTask();
        System.out.println(" ");
        forthTask();

    }

    public static void firstTask() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void secondTask() {
        Collections.sort(nums);
        int pNum = Integer.MIN_VALUE;
        for (int  num : nums) {
            if (num % 2 == 0 && num != pNum) {
                System.out.println(num);
                pNum = num;
            }
        }
    }
    public static void thirdTask() {
        Set<String> unique = new HashSet<>(strings);
        System.out.println(unique);
    }

    public static void forthTask() {
        Set<String> unique = new HashSet<>(strings);
        System.out.println(strings.size() - unique.size());
    }
}