package net.lab0.azure.taskagent.model.definition

import kotlin.Boolean
import kotlin.Int

interface TaskVersion {
  val isTest: Boolean

  val major: Int

  val minor: Int

  val patch: Int
}
