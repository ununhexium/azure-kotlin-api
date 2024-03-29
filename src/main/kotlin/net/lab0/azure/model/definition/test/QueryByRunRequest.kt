package net.lab0.azure.model.definition.test

import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface QueryByRunRequest {
  val includeActionResults: Boolean

  val outcome: String

  val owner: String

  val pageSize: Int

  val projectName: String

  val state: String

  val testRunId: Int
}
