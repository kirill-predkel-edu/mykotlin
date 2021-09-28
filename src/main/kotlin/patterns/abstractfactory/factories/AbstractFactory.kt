package patterns.abstractfactory.factories

import patterns.abstractfactory.suits.Suit

interface SuitFactory {
  fun createSuit(): Suit
}