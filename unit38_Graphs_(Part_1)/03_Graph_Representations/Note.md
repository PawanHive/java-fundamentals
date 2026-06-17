
# Graph Representation
```java 
/*
 * ========================================================
 * GRAPH REPRESENTATIONS — Storing a Graph
 * ========================================================
 *
 * A graph can be stored/represented in memory using
 * the following data structures:
 *
 *   1. Adjacency List       (most commonly used)
 *   2. Adjacency Matrix
 *   3. Edge List
 *   4. 2D Matrix            (Implicit Graph)
 *
 * --------------------------------------------------------
 * 1. ADJACENCY LIST
 * --------------------------------------------------------
 *    - Array/List of Lists
 *    - Each index stores the list of neighbors of that node
 *    - Space efficient for SPARSE graphs
 *
 *    Example: Graph with edges 1-2, 1-3, 2-4
 *        0 -> []
 *        1 -> [2, 3]
 *        2 -> [1, 4]
 *        3 -> [1]
 *        4 -> [2]
 *
 *    In Java:
 *        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
 *
 * --------------------------------------------------------
 * 2. ADJACENCY MATRIX
 * --------------------------------------------------------
 *    - 2D boolean/int array of size V x V
 *    - matrix[i][j] = 1  if edge exists between i and j
 *    - matrix[i][j] = 0  if no edge
 *    - Good for DENSE graphs, O(1) edge lookup
 *
 *    Example: Graph with edges 1-2, 1-3
 *          1  2  3
 *       1[ 0, 1, 1 ]
 *       2[ 1, 0, 0 ]
 *       3[ 1, 0, 0 ]
 *
 *    In Java:
 *        int[][] matrix = new int[V][V];
 *
 * --------------------------------------------------------
 * 3. EDGE LIST
 * --------------------------------------------------------
 *    - List of all edges as pairs (u, v)
 *    - Simple to implement, used in Kruskal's algorithm
 *
 *    Example: edges = [ [1,2], [1,3], [2,4] ]
 *
 *    In Java:
 *        int[][] edges = { {1,2}, {1,3}, {2,4} };
 *
 * --------------------------------------------------------
 * 4. 2D MATRIX — Implicit Graph
 * --------------------------------------------------------
 *    - Grid/matrix itself acts as the graph
 *    - Each cell is a node; neighbors = adjacent cells
 *    - Used in problems like maze, island count, BFS on grid
 *
 *    Example:
 *        int[][] grid = {
 *            {1, 0, 1},
 *            {1, 1, 0},
 *            {0, 1, 1}
 *        };
 *    Move directions: up, down, left, right
 *
 * ========================================================
 */
```

# Adjacency List (List of Lists)

```java
/*
 * ========================================================
 * ADJACENCY LIST — List of Lists
 * ========================================================
 *
 * Graph info from example:
 *    V = 4  (vertices: 0, 1, 2, 3)
 *    E = 4  (edges)
 *    Type: Undirected, Unweighted
 *
 * Graph structure (from diagram):
 *        0
 *        |
 *        1 --- 2
 *        |   /
 *        3 --
 *
 *    Edges: 0-1, 1-2, 1-3, 2-3
 *
 * --------------------------------------------------------
 * ADJACENCY LIST REPRESENTATION:
 * --------------------------------------------------------
 *    Each vertex stores a list of its neighbors.
 *
 *    0 -> [1]
 *    1 -> [0, 2, 3]
 *    2 -> [1, 3]
 *    3 -> [1, 2]
 *
 *    Since undirected: if 0->1 exists, then 1->0 also added
 *
 * --------------------------------------------------------
 * JAVA IMPLEMENTATION:
 * --------------------------------------------------------
 *
 *    int V = 4;
 *    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
 *
 *    // Initialize empty list for each vertex
 *    for (int i = 0; i < V; i++) {
 *        adj.add(new ArrayList<>());
 *    }
 *
 *    // Add edges (undirected => add both sides)
 *    adj.get(0).add(1);  adj.get(1).add(0);  // 0-1
 *    adj.get(1).add(2);  adj.get(2).add(1);  // 1-2
 *    adj.get(1).add(3);  adj.get(3).add(1);  // 1-3
 *    adj.get(2).add(3);  adj.get(3).add(2);  // 2-3
 *
 * --------------------------------------------------------
 * COMPLEXITY:
 * --------------------------------------------------------
 *    Space : O(V + E)
 *    Add edge    : O(1)
 *    Check edge  : O(degree of vertex)
 *
 *    Best for SPARSE graphs (fewer edges)
 * ========================================================
 */
```

# Adjacency Matrix

```java 
/*
 * ========================================================
 * ADJACENCY MATRIX
 * ========================================================
 *
 * Same Graph (V=4, E=4, Undirected, Unweighted):
 *
 *        0
 *        |
 *        1 --- 2
 *        |   /
 *        3 --
 *
 *    Edges: 0-1, 1-2, 1-3, 2-3
 *
 * --------------------------------------------------------
 * MATRIX REPRESENTATION:
 * --------------------------------------------------------
 *    2D array of size V x V
 *    matrix[i][j] = 1  if edge exists between i and j
 *    matrix[i][j] = 0  if no edge
 *
 *         0   1   2   3
 *    0  [ 0,  1,  0,  0 ]
 *    1  [ 1,  0,  1,  1 ]
 *    2  [ 0,  1,  0,  1 ]
 *    3  [ 0,  1,  1,  0 ]
 *
 *    Diagonal is always 0 (no self-loop)
 *    Matrix is SYMMETRIC for undirected graph
 *    i.e. matrix[i][j] == matrix[j][i]
 *
 * --------------------------------------------------------
 * JAVA IMPLEMENTATION:
 * --------------------------------------------------------
 *
 *    int V = 4;
 *    int[][] matrix = new int[V][V];
 *
 *    // Add edges (undirected => fill both sides)
 *    matrix[0][1] = 1;  matrix[1][0] = 1;  // 0-1
 *    matrix[1][2] = 1;  matrix[2][1] = 1;  // 1-2
 *    matrix[1][3] = 1;  matrix[3][1] = 1;  // 1-3
 *    matrix[2][3] = 1;  matrix[3][2] = 1;  // 2-3
 *
 * --------------------------------------------------------
 * COMPLEXITY:
 * --------------------------------------------------------
 *    Space      : O(V^2)   <- main drawback
 *    Add edge   : O(1)
 *    Check edge : O(1)     <- main advantage over adj list
 *
 *    Best for DENSE graphs (more edges)
 *    Wasteful for SPARSE graphs (lots of 0s)
 *
 * --------------------------------------------------------
 * ADJ LIST vs ADJ MATRIX:
 * --------------------------------------------------------
 *    Adj List   -> Space O(V+E), slow edge lookup
 *    Adj Matrix -> Space O(V^2), fast edge lookup O(1)
 * ========================================================
 */
```

# Edge List

```java
/*
 * ========================================================
 * EDGE LIST
 * ========================================================
 *
 * Same Graph (V=4, E=4, Undirected, Unweighted):
 *
 *        0
 *        |
 *        1 --- 2
 *        |   /
 *        3 --
 *
 * --------------------------------------------------------
 * EDGE LIST REPRESENTATION:
 * --------------------------------------------------------
 *    Simply store ALL edges as pairs {u, v}
 *
 *    Edges = { {0,1}, {1,2}, {1,3}, {2,3} }
 *
 * --------------------------------------------------------
 * JAVA IMPLEMENTATION:
 * --------------------------------------------------------
 *
 *    int[][] edges = {
 *        {0, 1},   // edge between 0 and 1
 *        {1, 2},   // edge between 1 and 2
 *        {1, 3},   // edge between 1 and 3
 *        {2, 3}    // edge between 2 and 3
 *    };
 *
 *    // For weighted graph, add 3rd value:
 *    // {u, v, weight}
 *    int[][] weightedEdges = {
 *        {0, 1, 5},
 *        {1, 2, 3},
 *        {1, 3, 7},
 *        {2, 3, 2}
 *    };
 *
 * --------------------------------------------------------
 * COMPLEXITY:
 * --------------------------------------------------------
 *    Space      : O(E)
 *    Check edge : O(E)   <- slow, need to scan all edges
 *    Add edge   : O(1)
 *
 * --------------------------------------------------------
 * WHEN IS EDGE LIST USED?
 * --------------------------------------------------------
 *    - Kruskal's Algorithm (Minimum Spanning Tree)
 *      -> sort edges by weight, then process one by one
 *    - When only edge info is needed, not neighbors
 *    - Simple and memory efficient when E is small
 * ========================================================
 */
```

# Implicit Graph

```java 
/*
 * ========================================================
 * IMPLICIT GRAPH — 2D Matrix as a Graph
 * ========================================================
 *
 * The 2D grid ITSELF acts as the graph.
 * No need to explicitly build adjacency list/matrix.
 *
 *    - Grid starts at (0, 0)  [top-left]
 *    - Grid ends   at (n, m)  [bottom-right]
 *    - Each cell (i, j) is a NODE
 *    - Neighbors of (i, j) are its 4 adjacent cells
 *
 * --------------------------------------------------------
 * NEIGHBORS OF CELL (i, j):
 * --------------------------------------------------------
 *
 *              (i-1, j)       <- UP
 *                  |
 *  (i, j-1) <- (i, j) -> (i, j+1)
 *                  |
 *              (i+1, j)       <- DOWN
 *
 *    UP    : (i-1, j)
 *    DOWN  : (i+1, j)
 *    LEFT  : (i,   j-1)
 *    RIGHT : (i,   j+1)
 *
 * --------------------------------------------------------
 * JAVA IMPLEMENTATION:
 * --------------------------------------------------------
 *
 *    int n = 5, m = 5;  // grid size
 *    int[][] grid = new int[n][m];
 *
 *    // Direction arrays for 4 neighbors
 *    int[] dr = {-1, +1,  0,  0};  // row change
 *    int[] dc = { 0,  0, -1, +1};  // col change
 *
 *    // Traverse all 4 neighbors of cell (i, j)
 *    for (int d = 0; d < 4; d++) {
 *        int newRow = i + dr[d];
 *        int newCol = j + dc[d];
 *
 *        // Boundary check before visiting
 *        if (newRow >= 0 && newRow < n &&
 *            newCol >= 0 && newCol < m) {
 *            // valid neighbor → process it
 *        }
 *    }
 *
 * --------------------------------------------------------
 * COMMON PROBLEMS USING IMPLICIT GRAPH:
 * --------------------------------------------------------
 *    - Number of Islands
 *    - Flood Fill
 *    - Shortest path in a maze (BFS)
 *    - Rotting Oranges
 *    - Word Search
 *
 * --------------------------------------------------------
 * KEY POINT:
 * --------------------------------------------------------
 *    No explicit graph construction needed.
 *    Grid coordinates (i, j) define nodes implicitly.
 *    Always do boundary check before visiting a neighbor!
 * ========================================================
 */
```