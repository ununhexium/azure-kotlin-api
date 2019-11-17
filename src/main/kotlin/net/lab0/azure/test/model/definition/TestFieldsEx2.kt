package net.lab0.azure.test.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface TestFieldsEx2 {
  val fieldId: Int

  val fieldName: String

  val fieldType: String

  val isResultScoped: Boolean

  val isRunScoped: Boolean

  val isSystemField: Boolean

  val projectId: String
}
