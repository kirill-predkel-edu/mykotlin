package patterns.abstractfactory.factories

import patterns.abstractfactory.suits.ItalianSuit
import patterns.abstractfactory.suits.Suit

class ItalianSuitFactory : SuitFactory {
  override fun createSuit(): Suit {
    return ItalianSuit()
  }
}