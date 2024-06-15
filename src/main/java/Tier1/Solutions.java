package Tier1;

import java.util.Scanner;

public class Solutions {

    public static void main(String[] args) {
        turtleAndPiggyArePlayingAGame();
    }

    public static void StrangeSplittings() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            StringBuilder sb = new StringBuilder();
            int n = sc.nextInt();
            int first = 0;
            boolean valid = false;
            boolean hasB = false;

            for (int j = 0; j < n; j++) {
                int num = sc.nextInt();

                if (j == 0) {
                    first = num;
                    sb.append("R");
                    continue;
                }

                if (valid) {
                    if (!hasB) {
                        sb.append("B");
                        hasB = true;
                        continue;
                    }

                    sb.append("R");

                    continue;
                }

                if (first == num) {
                    sb.append("B");
                    hasB = true;
                } else {
                    sb.append("R");
                    valid = true;
                }
            }

            if (valid) {
                System.out.println("YES");
                System.out.println(sb);
            } else {
                System.out.println("NO");
            }
        }
    }

    public static void turtleAndPiggyArePlayingAGame() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            sc.nextInt();
            int x = sc.nextInt();
            int score = 0;
            while (x != 1) {
                if (x % 2 == 1) {
                    x -=1;
                }

                x /= 2;
                score++;
            }

            System.out.println(score);
        }
    }
}
