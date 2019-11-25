package net.lab0.azure.model.definition.core

import kotlin.Boolean
import kotlin.String
import net.lab0.azure.model.definition.enumeration.core.ProcessType

interface Process : ProcessReference {
  val _links: ReferenceLinks

  val description: String

  val id: String

  val isDefault: Boolean

  val type: ProcessType
}
