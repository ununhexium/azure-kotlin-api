package net.lab0.azure.test.model.definition

import javax.json.JsonObject
import kotlin.Int
import kotlin.String
import net.lab0.azure.test.model.definition.enumeration.TestOutcome

interface AggregatedResultsByOutcome {
  val count: Int

  val duration: String

  val groupByField: String

  val groupByValue: JsonObject

  val outcome: TestOutcome

  val rerunResultCount: Int
}
