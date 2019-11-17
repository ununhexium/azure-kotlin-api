package net.lab0.azure.test.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.test.model.definition.enumeration.SqlDbType

interface TestExtensionFieldDetails {
  val id: Int

  val isResultScoped: Boolean

  val isRunScoped: Boolean

  val isSystemField: Boolean

  val name: String

  val type: SqlDbType
}
