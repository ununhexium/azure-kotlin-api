package net.lab0.azure.model.definition.taskagent

import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.taskagent.ServiceGroupType

interface ServiceGroup {
  val createdBy: IdentityRef

  val createdOn: String

  val environmentReference: EnvironmentReference

  val id: Int

  val lastModifiedBy: IdentityRef

  val lastModifiedOn: String

  val name: String

  val type: ServiceGroupType
}
