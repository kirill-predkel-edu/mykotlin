package patterns.abstractfactory.suits

class EnglishSuit : Suit {
  override fun showSuitInfo() {
    println(
      "1. Suit country: England.\n" +
          "2. Suit cost: 30.\n" +
          "3. Suit material: wool"
    )
  }
}