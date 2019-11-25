package net.lab0.azure.model.definition.git

import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.git.GitRefUpdateMode

interface UpdateRefsRequest {
  val refUpdateRequests: List<GitRefUpdate>

  val updateMode: GitRefUpdateMode
}
