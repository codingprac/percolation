import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    private int[][] id;
    private int[] objects;
    private WeightedQuickUnionUF uf;


    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                id[i][j] = 0;
                objects[i + j] = i + j;
            }
        }
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        id[row][col] = 1;
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {

    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {

    }

    // returns the number of open sites
    public int numberOfOpenSites() {

    }

    // does the system percolate?
    public boolean percolates() {

    }

    // test client (optional)
    public static void main(String[] args) {

    }

    private void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    private boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private int count() {

    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }
}