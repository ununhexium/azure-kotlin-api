package net.lab0.azure.model.definition.test

import javax.json.JsonObject
import kotlin.Int
import net.lab0.azure.model.definition.enumeration.test.TestRunState

interface AggregatedRunsByState {
  val resultsByOutcome: JsonObject

  val runsCount: Int

  val state: TestRunState
}
