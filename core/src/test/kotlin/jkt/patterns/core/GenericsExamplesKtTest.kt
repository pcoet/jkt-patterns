package jkt.patterns.core

import jkt.patterns.oop.*
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream


internal class GenericsExamplesKtTest {
  private val outContent = ByteArrayOutputStream()
  private val originalOut = System.out

  @BeforeEach
  fun setUpStreams() {
    System.setOut(PrintStream(outContent))
  }

  @AfterEach
  fun restoreStreams() {
    System.setOut(originalOut)
  }

  @Test
  fun buildList() {
    val expected = listOf(1, 1, 2, 3, 5, 8, 13)
    val result = buildList(1, 1, 2, 3, 5, 8, 13)
    assertEquals(expected, result)
  }

  @Test
  fun listenToBirds() {
    val crow = AmericanCrow("Bob", "A crow named Bob")
    val seagull = WesternGull("Alice", "A seagull named Alice")
    val goose = CanadaGoose("Chuck", "A goose named Chuck")
    val birds = Flock<Bird>()
    birds.addBirds(crow, seagull, goose)
    listenToBirds(birds)
    assertEquals("caw\n" + "mew\n" + "honk\n", outContent.toString())
  }

  @Test
  fun listenToGeese() {
    val bob = CanadaGoose("Bob", "A goose named Bob")
    val alice = CanadaGoose("Alice", "A goose named Alice")
    val chuck = CanadaGoose("Chuck", "A goose named Chuck")
    val geese = Flock<Goose>()
    geese.addBirds(bob, alice, chuck)
    listenToGeese(geese)
    assertEquals("honk\n" + "honk\n" + "honk\n", outContent.toString())
  }
}