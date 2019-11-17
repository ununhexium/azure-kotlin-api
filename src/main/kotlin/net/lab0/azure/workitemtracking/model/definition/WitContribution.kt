package net.lab0.azure.workitemtracking.model.definition

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Properties of a work item form contribution
 */
interface WitContribution {
  /**
   * The id for the contribution.
   */
  val contributionId: String

  /**
   * The height for the contribution.
   */
  val height: Int

  /**
   * A dictionary holding key value pairs for contribution inputs.
   */
  val inputs: JsonObject

  /**
   * A value indicating if the contribution should be show on deleted workItem.
   */
  val showOnDeletedWorkItem: Boolean
}
