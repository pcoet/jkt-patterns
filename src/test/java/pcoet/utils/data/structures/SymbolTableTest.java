package pcoet.utils.data.structures;

import org.junit.Before;
import org.junit.Test;
import java.util.Iterator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class SymbolTableTest {
  SymbolTable<String, String> symbolTable;

  @Before
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
    assertThat(symbolTable.get("Bob"), equalTo("programmer"));
  }

  @Test
  public void returnsCorrectSize() {
    assertThat(symbolTable.size(), equalTo(6));
  }

  @Test
  public void canDeleteItem() {
    assertThat(symbolTable.contains("Ronnie"), equalTo(true));
    symbolTable.delete("Ronnie");
    assertThat(symbolTable.size(), equalTo(5));
    assertThat(symbolTable.contains("Ronnie"), equalTo(false));
  }

  @Test
  public void canTellIfTableIsEmpty() {
    assertThat(symbolTable.isEmpty(), equalTo(false));
    symbolTable.delete("Mick");
    symbolTable.delete("Keith");
    symbolTable.delete("Charlie");
    symbolTable.delete("Ronnie");
    symbolTable.delete("Bob");
    symbolTable.delete("Alice");
    assertThat(symbolTable.isEmpty(), equalTo(true));
  }

  @Test
  public void returnsIterableListOfKeys() {
    Iterator<String> keys = symbolTable.keys().iterator();
    assertThat(keys.next(), equalTo("Alice"));
    assertThat(keys.next(), equalTo("Bob"));
  }
}
