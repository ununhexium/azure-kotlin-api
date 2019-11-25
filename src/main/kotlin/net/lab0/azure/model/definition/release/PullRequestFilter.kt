package net.lab0.azure.model.definition.release

import kotlin.String
import kotlin.collections.List

interface PullRequestFilter {
  val tags: List<String>

  val targetBranch: String
}
