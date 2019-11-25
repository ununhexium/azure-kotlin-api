package net.lab0.azure.model.definition.release

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface WorkflowTask {
  val alwaysRun: Boolean

  val condition: String

  val continueOnError: Boolean

  val definitionType: String

  val enabled: Boolean

  val environment: JsonObject

  val inputs: JsonObject

  val name: String

  val overrideInputs: JsonObject

  val refName: String

  val taskId: String

  val timeoutInMinutes: Int

  val version: String
}
