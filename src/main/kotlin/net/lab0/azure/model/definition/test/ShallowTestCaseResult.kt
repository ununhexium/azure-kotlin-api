package net.lab0.azure.model.definition.test

import javax.json.JsonNumber
import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface ShallowTestCaseResult {
  val automatedTestStorage: String

  val durationInMs: JsonNumber

  val id: Int

  val isReRun: Boolean

  val outcome: String

  val owner: String

  val priority: Int

  val refId: Int

  val runId: Int

  val testCaseTitle: String
}
