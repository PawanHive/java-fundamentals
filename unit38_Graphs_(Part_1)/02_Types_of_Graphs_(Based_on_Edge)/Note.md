
# Type: Uni-Directional, Un-Directed, Bi-Directional

```java 
/*
 * ========================================================
 * GRAPHS - TYPES OF EDGES
 * ========================================================
 *
 * Edges define the connection between two nodes (vertices)
 * in a graph. Based on direction, edges are of 3 types:
 *
 * --------------------------------------------------------
 * 1. UNI-DIRECTIONAL (Directed Edge)
 * --------------------------------------------------------
 *    - Edge goes in ONE direction only
 *    - A --> B  (can go from A to B, but NOT B to A)
 *
 *    Representation:
 *        (A) -----> (B)
 *
 * --------------------------------------------------------
 * 2. UN-DIRECTED Edge
 * --------------------------------------------------------
 *    - No specific direction
 *    - A --- B  (connection exists, but no arrow)
 *    - Typically treated as Bi-Directional by default
 *
 *    Representation:
 *        (A) ------- (B)
 *
 * --------------------------------------------------------
 * 3. BI-DIRECTIONAL (Two-way Directed Edge)
 * --------------------------------------------------------
 *    - Edge goes in BOTH directions
 *    - A <--> B  (can go from A to B AND from B to A)
 *
 *    Representation:
 *        (A) <------> (B)
 *
 * --------------------------------------------------------
 * KEY DIFFERENCE:
 *   Un-Directed  = no arrow (implicit connection)
 *   Bi-Directional = two arrows (explicit both ways)
 *   In practice, Un-Directed graphs are stored as
 *   Bi-Directional in adjacency list/matrix.
 * ========================================================
 */
```


# Type: Weighted / UnWeighted
```java 
/*
 * ========================================================
 * GRAPHS - TYPES (Based on Weight)
 * ========================================================
 *
 * --------------------------------------------------------
 * 1. WEIGHTED GRAPH
 * --------------------------------------------------------
 *    - Each edge has a WEIGHT (cost/distance) assigned
 *    - Weight can be positive or negative
 *
 *    Example:
 *        (1) --1-- (6)
 *         |
 *        (4) --5-- (6)
 *        / \
 *      -1   3
 *      /     \
 *    (9)     (3)
 *
 *    Edge list with weights:
 *        1  -- 6  : weight =  1
 *        1  -- 4  : (connected)
 *        4  -- 6  : weight =  5
 *        4  -- 9  : weight = -1  (negative weight allowed)
 *        4  -- 3  : weight =  3
 *
 *    Use case: GPS navigation, network routing,
 *              shortest path (Dijkstra, Bellman-Ford)
 *
 * --------------------------------------------------------
 * 2. UNWEIGHTED GRAPH
 * --------------------------------------------------------
 *    - Edges have NO weight assigned
 *    - Only connection matters, not the cost
 *
 *    Example:
 *        (1) --- (4) --- (9)
 *                 |
 *                (6)   (3)
 *
 *    Edge list (no weights):
 *        1 -- 4
 *        4 -- 9
 *        4 -- 6
 *        4 -- 3
 *
 *    Use case: Social networks, BFS/DFS traversal,
 *              friend suggestions
 *
 * --------------------------------------------------------
 * KEY DIFFERENCE:
 *   Weighted   = edge has a numeric value (can be -ve too)
 *   Unweighted = edge just shows existence of connection
 * ========================================================
 */
```