package net.lab0.azure.model.definition.work

import javax.json.JsonObject
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.work.PlanType

interface UpdatePlan {
  /**
   * Description of the plan
   */
  val description: String

  /**
   * Name of the plan to create.
   */
  val name: String

  /**
   * Plan properties.
   */
  val properties: JsonObject

  /**
   * Revision of the plan that was updated - the value used here should match the one the server
   * gave the client in the Plan.
   */
  val revision: Int

  /**
   * Type of the plan
   */
  val type: PlanType
}
