package net.lab0.azure.work.model.definition

import javax.json.JsonObject
import kotlin.Int
import kotlin.String
import net.lab0.azure.work.model.definition.enumeration.PlanType
import net.lab0.azure.work.model.definition.enumeration.PlanUserPermissions

/**
 * Data contract for the plan definition
 */
interface Plan {
  val createdByIdentity: IdentityRef

  /**
   * Date when the plan was created
   */
  val createdDate: String

  /**
   * Description of the plan
   */
  val description: String

  /**
   * Id of the plan
   */
  val id: String

  val modifiedByIdentity: IdentityRef

  /**
   * Date when the plan was last modified. Default to CreatedDate when the plan is first created.
   */
  val modifiedDate: String

  /**
   * Name of the plan
   */
  val name: String

  /**
   * The PlanPropertyCollection instance associated with the plan. These are dependent on the type
   * of the plan. For example, DeliveryTimelineView, it would be of type
   * DeliveryViewPropertyCollection.
   */
  val properties: JsonObject

  /**
   * Revision of the plan. Used to safeguard users from overwriting each other's changes.
   */
  val revision: Int

  /**
   * Type of the plan
   */
  val type: PlanType

  /**
   * The resource url to locate the plan via rest api
   */
  val url: String

  /**
   * Bit flag indicating set of permissions a user has to the plan.
   */
  val userPermissions: PlanUserPermissions
}
