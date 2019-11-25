package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface TestParameter2 {
  val actionPath: String

  val actual: List<String>

  val creationDate: String

  val dataType: String

  val dateModified: String

  val expected: List<String>

  val iterationId: Int

  val parameterName: String

  val testResultId: Int

  val testRunId: Int
}
