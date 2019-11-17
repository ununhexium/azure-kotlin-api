package net.lab0.azure.git.model.definition

import kotlin.collections.List
import net.lab0.azure.git.model.definition.enumeration.GitRefUpdateMode

interface UpdateRefsRequest {
  val refUpdateRequests: List<GitRefUpdate>

  val updateMode: GitRefUpdateMode
}
