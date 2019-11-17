package net.lab0.azure.test.model.definition

import kotlin.Int
import net.lab0.azure.test.model.definition.enumeration.TestRunOutcome

interface AggregatedRunsByOutcome {
  val outcome: TestRunOutcome

  val runsCount: Int
}
