package net.lab0.azure.work.model.definition

import javax.json.JsonObject
import kotlin.String
import net.lab0.azure.work.model.definition.enumeration.PlanType

interface CreatePlan {
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
   * Type of plan to create.
   */
  val type: PlanType
}
