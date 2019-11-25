package net.lab0.azure.model.definition.test

import javax.json.JsonNumber
import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface TestResultsEx2 {
  val bitValue: Boolean

  val creationDate: String

  val dateTimeValue: String

  val fieldId: Int

  val fieldName: String

  val floatValue: JsonNumber

  val guidValue: String

  val intValue: Int

  val projectId: String

  val stringValue: String

  val testResultId: Int

  val testRunId: Int
}
