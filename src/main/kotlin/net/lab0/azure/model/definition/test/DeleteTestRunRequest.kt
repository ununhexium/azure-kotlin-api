package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface DeleteTestRunRequest {
  val projectName: String

  val testRunIds: List<Int>
}
