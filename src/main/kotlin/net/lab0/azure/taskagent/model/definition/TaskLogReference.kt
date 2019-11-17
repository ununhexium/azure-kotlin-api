package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.String

interface TaskLogReference {
  val id: Int

  val location: String
}
