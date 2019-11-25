package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String

interface AggregatedResultsDifference {
  val increaseInDuration: String

  val increaseInFailures: Int

  val increaseInOtherTests: Int

  val increaseInPassedTests: Int

  val increaseInTotalTests: Int
}
