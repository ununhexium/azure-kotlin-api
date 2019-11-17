package net.lab0.azure.test.model.definition

import javax.json.JsonObject
import kotlin.Int
import net.lab0.azure.test.model.definition.enumeration.TestRunState

interface AggregatedRunsByState {
  val resultsByOutcome: JsonObject

  val runsCount: Int

  val state: TestRunState
}
