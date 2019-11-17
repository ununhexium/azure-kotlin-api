package net.lab0.azure.workitemtracking.model.definition

import kotlin.Boolean
import kotlin.String
import net.lab0.azure.workitemtracking.model.definition.enumeration.FieldType

interface FieldModel {
  val description: String

  val id: String

  val isIdentity: Boolean

  val name: String

  val type: FieldType

  val url: String
}
