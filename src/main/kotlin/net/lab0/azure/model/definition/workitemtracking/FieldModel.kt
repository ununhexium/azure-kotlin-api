package net.lab0.azure.model.definition.workitemtracking

import kotlin.Boolean
import kotlin.String
import net.lab0.azure.model.definition.enumeration.workitemtracking.FieldType

interface FieldModel {
  val description: String

  val id: String

  val isIdentity: Boolean

  val name: String

  val type: FieldType

  val url: String
}
