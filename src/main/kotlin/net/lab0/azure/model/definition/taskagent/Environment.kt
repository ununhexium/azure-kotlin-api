package net.lab0.azure.model.definition.taskagent

import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Environment.
 */
interface Environment {
  val createdBy: IdentityRef

  /**
   * Creation time of the Environment
   */
  val createdOn: String

  /**
   * Description of the Environment.
   */
  val description: String

  /**
   * Id of the Environment
   */
  val id: Int

  val lastModifiedBy: IdentityRef

  /**
   * Last modified time of the Environment
   */
  val lastModifiedOn: String

  /**
   * Name of the Environment.
   */
  val name: String

  val serviceGroups: List<ServiceGroupReference>
}
