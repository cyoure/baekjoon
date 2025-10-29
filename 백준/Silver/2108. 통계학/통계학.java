import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        if (count == 1) {
            int num = sc.nextInt();
            System.out.println(num);
            System.out.println(num);
            System.out.println(num);
            System.out.println(0);

        } else {
            int[] numbers = new int[count];
            for (int i = 0; i < count; i++) {
                numbers[i] = sc.nextInt();
            }
            double average = 0;
            double sum = 0;
            for (int i = 0; i < count; i++) {
                sum += numbers[i];
            }
            average = sum / count;
            average = Double.parseDouble(String.format("%.0f", average));
            // 중간값
            Arrays.sort(numbers);
            int middleNum = numbers[numbers.length / 2];
            // 최빈값
            int mode = 0;
            int maxCount = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int number : numbers) {
                map.put(number, map.getOrDefault(number, 0) + 1);
            }
            for (Integer value : map.values()) {
                if (maxCount < value) {
                    maxCount = value;
                }
            }
            ArrayList<Integer> list = new ArrayList<>();
            for (Integer key : map.keySet()) {
               if (map.get(key) == maxCount) {
                   list.add(key);
               }
            }
            Collections.sort(list);
            if (list.size() == 1) {
                mode = list.get(0);
            } else {
                mode = list.get(1);
            }
            System.out.println((int)average);
            System.out.println(middleNum);
            System.out.println(mode);
            System.out.println(numbers[count-1] - numbers[0]);
        }
    }
}