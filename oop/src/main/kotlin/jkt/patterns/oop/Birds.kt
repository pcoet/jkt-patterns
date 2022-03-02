package jkt.patterns.oop

interface Bird {
  val commonName: String
  val binomialName: String
  var nickName: String
  var description: String
  fun call()
}

interface Goose: Bird {
  override fun call() {
    println("honk")
  }
}

class CanadaGoose(override var nickName: String, override var description: String): Goose {
  override val commonName = "Canada goose"
  override val binomialName = "Branta canadensis"
}

class WesternGull(override var nickName: String, override var description: String): Bird {
  override val commonName = "Western gull"
  override val binomialName = "Larus occidentalis"
  override fun call() {
    println("mew")
  }
}

class AmericanCrow(override var nickName: String, override var description: String): Bird {
  override val commonName = "American crow"
  override val binomialName = "Corvus brachyrhynchos"
  override fun call() {
    println("caw")
  }
}

class Flock<T: Bird>: Iterable<T> {
  private val birds = mutableListOf<T>()

  var size: Int = 0
    get() = this.birds.size

  fun addBirds(vararg birds: T) {
    for (bird in birds) {
      this.birds.add(bird)
    }
  }

  override fun iterator(): Iterator<T> {
    return birds.iterator()
  }
}