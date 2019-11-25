package net.lab0.azure.model.definition.test

import kotlin.Int
import net.lab0.azure.model.definition.enumeration.test.TestRunOutcome

interface AggregatedRunsByOutcome {
  val outcome: TestRunOutcome

  val runsCount: Int
}
