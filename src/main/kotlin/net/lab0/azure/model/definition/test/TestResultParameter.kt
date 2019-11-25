package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface TestResultParameter {
  val actionPath: String

  val actual: List<String>

  val expected: List<String>

  val iterationId: Int

  val parameterName: String

  val testResultId: Int

  val testRunId: Int
}
