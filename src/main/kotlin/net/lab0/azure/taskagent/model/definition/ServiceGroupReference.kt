package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.String
import net.lab0.azure.taskagent.model.definition.enumeration.ServiceGroupType

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
