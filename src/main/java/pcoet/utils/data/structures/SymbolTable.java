package pcoet.utils.data.structures;

/**
 * A symbol table that stores unordered key/value pairs.
 * To get a value, we use a (brute force) sequential search.
 * @param <K> A key for retrieving a value
 * @param <V> The value to be stored
 */
public class SymbolTable<K, V> {
  private int counter;
  private Node first;

  private class Node {
    K key;
    V val;
    Node next;

    public Node(K key, V val, Node next) {
      this.key = key;
      this.val = val;
      this.next = next;
    }
  }

  /**
   * Returns the value associated with a key, or null, if the value does not exist.
   * @param key The key to search for
   * @return Returns a value or null
   */
  public V get(K key) {
    for (Node x = first; x != null; x = x.next) {
      if (key.equals(x.key)) {
        return x.val;
      }
    }
    return null;
  }

  /**
   * Adds a new key/value pair to the symbol table,
   * or replaces the value associated with an existing key.
   * @param key A key to insert into the table
   * @param val The value associated with the key
   */
  public void put(K key, V val) {
    for (Node x = first; x != null; x = x.next) {
      if (key.equals(x.key)) {
        x.val = val;
        return;
      }
    }
    first = new Node(key, val, first);
    this.counter++;
  }

  /**
   * Returns the number of key/value pairs in the table.
   * @return Number of key/value pairs
   */
  public int size() {
    return counter;
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public boolean contains(K key) {
    return get(key) != null;
  }

  /**
   * Returns an iterable of all the keys in the table.
   * @return an iterable queue
   */
  public Iterable<K> keys() {
    Queue<K> queue = new Queue<K>();
    for (Node x = first; x != null; x = x.next) {
      queue.enqueue(x.key);
    }
    return queue;
  }

  /**
   * Removes the key/value pair from the table.
   * @param key The key of the key/value pair to be removed
   */
  public void delete(K key) {
    first = delete(first, key);
  }

  private Node delete(Node x, K key) {
    if (x == null) {
      return null;
    }
    if (key.equals(x.key)) {
      counter--;
      return x.next;
    }
    x.next = delete(x.next, key);
    return x;
  }
}
