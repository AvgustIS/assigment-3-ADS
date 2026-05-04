public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        Searcher searcher = new Searcher();
        Experiment experiment = new Experiment();

        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {
            System.out.println("Size: " + size);

            int[] arr = sorter.generateRandomArray(size);
            int[] copy1 = arr.clone();
            int[] copy2 = arr.clone();

            long t1 = experiment.measureSortTime(copy1, "basic");
            long t2 = experiment.measureSortTime(copy2, "advanced");

            int target = copy2[size / 2];
            long t3 = experiment.measureSearchTime(copy2, target);

            System.out.println("Insertion: " + t1 + " ns");
            System.out.println("Merge: " + t2 + " ns");
            System.out.println("Binary Search: " + t3 + " ns");
        }
    }
}