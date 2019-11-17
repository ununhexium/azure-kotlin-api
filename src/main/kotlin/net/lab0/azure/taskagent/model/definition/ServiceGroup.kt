package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.String
import net.lab0.azure.taskagent.model.definition.enumeration.ServiceGroupType

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
