package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

interface AggregatedResultsDifference {
  val increaseInDuration: String

  val increaseInFailures: Int

  val increaseInOtherTests: Int

  val increaseInPassedTests: Int

  val increaseInTotalTests: Int
}
