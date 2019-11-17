package net.lab0.azure.core.model.definition

import kotlin.Boolean
import kotlin.String
import net.lab0.azure.core.model.definition.enumeration.ProcessType

interface Process : ProcessReference {
  val _links: ReferenceLinks

  val description: String

  val id: String

  val isDefault: Boolean

  val type: ProcessType
}
