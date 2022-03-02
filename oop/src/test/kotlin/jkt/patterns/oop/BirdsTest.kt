package jkt.patterns.oop

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class BirdsTest {
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
  fun testAmericanCrow() {
    val crow = AmericanCrow("Bob", "A crow named Bob")
    assertEquals("American crow", crow.commonName)
    assertEquals("Corvus brachyrhynchos", crow.binomialName)
    assertEquals("Bob", crow.nickName)
    crow.nickName = "Bob!"
    assertEquals("Bob!", crow.nickName)
    assertEquals("A crow named Bob", crow.description)
    crow.description = "A crow named Bob!"
    assertEquals("A crow named Bob!", crow.description)
    crow.call()
    assertEquals("caw\n", outContent.toString())
  }

  @Test
  fun testWesternGull() {
    val seagull = WesternGull("Alice", "A seagull named Alice")
    assertEquals("Western gull", seagull.commonName)
    assertEquals("Larus occidentalis", seagull.binomialName)
    assertEquals("Alice", seagull.nickName)
    seagull.nickName = "Alice!"
    assertEquals("Alice!", seagull.nickName)
    assertEquals("A seagull named Alice", seagull.description)
    seagull.description = "A seagull named Alice!"
    assertEquals("A seagull named Alice!", seagull.description)
    seagull.call()
    assertEquals("mew\n", outContent.toString())
  }

  @Test
  fun testCanadaGoose() {
    val goose = CanadaGoose("Chuck", "A goose named Chuck")
    assertEquals("Canada goose", goose.commonName)
    assertEquals("Branta canadensis", goose.binomialName)
    assertEquals("Chuck", goose.nickName)
    goose.nickName = "Chuck!"
    assertEquals("Chuck!", goose.nickName)
    assertEquals("A goose named Chuck", goose.description)
    goose.description = "A goose named Chuck!"
    assertEquals("A goose named Chuck!", goose.description)
    goose.call()
    assertEquals("honk\n", outContent.toString())
  }

  @Test
  fun testFlock() {
    val crow = AmericanCrow("Bob", "A crow named Bob")
    val seagull = WesternGull("Alice", "A seagull named Alice")
    val goose = CanadaGoose("Chuck", "A goose named Chuck")
    val goose2 = CanadaGoose("Frank", "A goose named Frank")
    val flock = Flock<Bird>()
    flock.addBirds(crow, seagull, goose)
    assertEquals(3, flock.size)
    flock.addBirds(goose2)
    assertEquals(4, flock.size)
  }
}