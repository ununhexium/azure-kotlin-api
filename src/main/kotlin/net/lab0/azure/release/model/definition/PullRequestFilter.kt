package net.lab0.azure.release.model.definition

import kotlin.String
import kotlin.collections.List

interface PullRequestFilter {
  val tags: List<String>

  val targetBranch: String
}
