package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface DeleteTestRunRequest {
  val projectName: String

  val testRunIds: List<Int>
}
