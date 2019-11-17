package net.lab0.azure.git.model.definition

import kotlin.String
import kotlin.collections.List

interface GitFilePathsCollection {
  val commitId: String

  val paths: List<String>

  val url: String
}
