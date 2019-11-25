package net.lab0.azure.model.definition.test

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.test.SqlDbType

interface TestExtensionFieldDetails {
  val id: Int

  val isResultScoped: Boolean

  val isRunScoped: Boolean

  val isSystemField: Boolean

  val name: String

  val type: SqlDbType
}
