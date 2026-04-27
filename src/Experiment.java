public class Experiment {
    public long measureSortTime(int[] arr, String type) {
        Sorter sorter = new Sorter();
        long startTime = System.nanoTime();
        if (type.equals("basic")) {
            sorter.basicSort(arr);
        } else {
            sorter.advancedSort(arr);
        }
        return System.nanoTime() - startTime;
    }

    public long measureSearchTime(int[] arr, int target) {
        Searcher searcher = new Searcher();
        long startTime = System.nanoTime();
        searcher.search(arr, target);
        return System.nanoTime() - startTime;
    }
}
