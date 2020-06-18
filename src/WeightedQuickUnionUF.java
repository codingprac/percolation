public class WeightedQuickUnionUF {

    private int[] id;
    private int[] sz;

    public WeightedQuickUnionUF(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) return;
        if (sz[i] > sz[j]) {
            id[j] = i;
            sz[i] += sz[j];
        }
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        }
        if (sz[i] == sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        }
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public int root(int p) {
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }

}
