package jkt.patterns.algorithms;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SymbolTableTest {
  SymbolTable<String, String> symbolTable;

  /**
   * Instantiate a SymbolTable.
   */
  @BeforeEach
  public void setUp() {
    symbolTable = new SymbolTable<>();
    symbolTable.put("Mick", "singer");
    symbolTable.put("Keith", "guitarist");
    symbolTable.put("Charlie", "drummer");
    symbolTable.put("Ronnie", "guitarist");
    symbolTable.put("Bob", "programmer");
    symbolTable.put("Alice", "programmer");
  }

  @Test
  public void canRetrieveValueByKey() {
    assertEquals("programmer", symbolTable.get("Bob"));
  }

  @Test
  public void returnsCorrectSize() {
    assertEquals(6, symbolTable.size());
  }

  @Test
  public void canDeleteItem() {
    assertEquals(true, symbolTable.contains("Ronnie"));
    symbolTable.delete("Ronnie");
    assertEquals(5, symbolTable.size());
    assertEquals(false, symbolTable.contains("Ronnie"));
  }

  @Test
  public void canTellIfTableIsEmpty() {
    assertEquals(false, symbolTable.isEmpty());
    symbolTable.delete("Mick");
    symbolTable.delete("Keith");
    symbolTable.delete("Charlie");
    symbolTable.delete("Ronnie");
    symbolTable.delete("Bob");
    symbolTable.delete("Alice");
    assertEquals(true, symbolTable.isEmpty());
  }

  @Test
  public void returnsIterableListOfKeys() {
    Iterator<String> keys = symbolTable.keys().iterator();
    assertEquals("Alice", keys.next());
    assertEquals("Bob", keys.next());
  }
}
