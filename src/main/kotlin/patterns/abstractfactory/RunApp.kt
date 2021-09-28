package patterns.abstractfactory

import patterns.abstractfactory.factories.EnglishSuitFactory
import patterns.abstractfactory.factories.ItalianSuitFactory

fun main() {
  val italianSuitFactory = ItalianSuitFactory()
  val englishSuitFactory = EnglishSuitFactory()

  val italianSuit = italianSuitFactory.createSuit()
  val englishSuit = englishSuitFactory.createSuit()

  italianSuit.showSuitInfo()
  println()
  englishSuit.showSuitInfo()
}