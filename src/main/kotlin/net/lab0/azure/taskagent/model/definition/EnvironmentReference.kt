package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.String

interface EnvironmentReference {
  val id: Int

  val name: String
}
