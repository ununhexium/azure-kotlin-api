package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String

interface QueryTestRunsRequest {
  val buildUri: String

  val owner: String

  val planId: Int

  val skip: Int

  val teamProjectName: String

  val testRunId: Int

  val top: Int
}
