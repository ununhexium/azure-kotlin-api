package net.lab0.azure.model.definition.taskagent

import kotlin.Boolean
import kotlin.Int

interface TaskVersion {
  val isTest: Boolean

  val major: Int

  val minor: Int

  val patch: Int
}
