package patterns.abstractfactory.factories

import patterns.abstractfactory.suits.EnglishSuit
import patterns.abstractfactory.suits.Suit

class EnglishSuitFactory : SuitFactory {
  override fun createSuit(): Suit {
    return EnglishSuit()
  }
}