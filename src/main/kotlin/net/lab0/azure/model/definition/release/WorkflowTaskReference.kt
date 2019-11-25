package net.lab0.azure.model.definition.release

import kotlin.String

interface WorkflowTaskReference {
  val id: String

  val name: String

  val version: String
}
