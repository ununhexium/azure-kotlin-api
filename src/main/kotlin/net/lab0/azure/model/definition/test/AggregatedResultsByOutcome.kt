package net.lab0.azure.model.definition.test

import javax.json.JsonObject
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.test.TestOutcome

interface AggregatedResultsByOutcome {
  val count: Int

  val duration: String

  val groupByField: String

  val groupByValue: JsonObject

  val outcome: TestOutcome

  val rerunResultCount: Int
}
