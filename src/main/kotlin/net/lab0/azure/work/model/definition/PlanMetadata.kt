package net.lab0.azure.work.model.definition

import kotlin.String
import net.lab0.azure.work.model.definition.enumeration.PlanUserPermissions

/**
 * Metadata about a plan definition that is stored in favorites service
 */
interface PlanMetadata {
  val createdByIdentity: IdentityRef

  /**
   * Description of plan
   */
  val description: String

  /**
   * Last modified date of the plan
   */
  val modifiedDate: String

  /**
   * Bit flag indicating set of permissions a user has to the plan.
   */
  val userPermissions: PlanUserPermissions
}
