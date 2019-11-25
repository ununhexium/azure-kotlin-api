package net.lab0.azure.model.definition.git

import kotlin.String
import kotlin.collections.List

interface GitFilePathsCollection {
  val commitId: String

  val paths: List<String>

  val url: String
}
