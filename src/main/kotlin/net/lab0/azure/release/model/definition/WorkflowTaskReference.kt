package net.lab0.azure.release.model.definition

import kotlin.String

interface WorkflowTaskReference {
  val id: String

  val name: String

  val version: String
}
