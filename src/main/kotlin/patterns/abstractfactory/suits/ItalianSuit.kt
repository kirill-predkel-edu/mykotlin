package patterns.abstractfactory.suits

class ItalianSuit : Suit {
  override fun showSuitInfo() {
    println(
      "1. Suit country: Italy.\n" +
          "2. Suit cost: 20.\n" +
          "3. Suit material: cotton"
    )
  }
}