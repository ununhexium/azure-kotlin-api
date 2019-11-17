package net.lab0.azure.taskagent.model.definition

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface TaskInstance : TaskReference {
  val alwaysRun: Boolean

  val condition: String

  val continueOnError: Boolean

  val displayName: String

  val enabled: Boolean

  val environment: JsonObject

  val instanceId: String

  val refName: String

  val timeoutInMinutes: Int
}
