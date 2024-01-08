public class PowerOf2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java PowerOf2 <n>");
            System.exit(1);
        }

        int n = Integer.parseInt(args[0]);

        if (n < 0) {
            System.out.println("Please enter a non-negative number.");
            System.exit(1);
        }

        System.out.println("Powers of 2 less than or equal to 2^" + n + ":");

        for (int i = 0; i <= n; i++) {
            long power = (long) Math.pow(2, i);
            System.out.println("2^" + i + " = " + power);
        }
    }
}
