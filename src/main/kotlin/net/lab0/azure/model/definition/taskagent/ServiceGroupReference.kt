package net.lab0.azure.model.definition.taskagent

import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.taskagent.ServiceGroupType

/**
 * ServiceGroupReference.
 */
interface ServiceGroupReference {
  /**
   * Id of the Service Group.
   */
  val id: Int

  /**
   * Name of the service group.
   */
  val name: String

  /**
   * Type of the service group.
   */
  val type: ServiceGroupType
}
