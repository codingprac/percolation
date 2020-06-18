

public class QuickUnionUF {

    private int[] id;

    public QuickUnionUF(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public void union(int p, int q) {
        int proot = root(p);
        int qroot = root(q);
        id[proot] = qroot;
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
