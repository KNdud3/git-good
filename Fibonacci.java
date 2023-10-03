
public static void main(String[] args) {
    int n = parseArgs(args);
    if (n == -1) {
        System.err.println("Invalid Arguments");
        return;
    }

    FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(n);
    while (fibonacciGenerator.hasNext()) {
        System.out.print(fibonacciGenerator.next() + ", ");
    }
    System.out.println();
}

