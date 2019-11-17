package net.lab0.azure.work.model.definition

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List

/**
 * Process Configurations for the project
 */
interface ProcessConfiguration {
  val bugWorkItems: CategoryConfiguration

  /**
   * Details about portfolio backlogs
   */
  val portfolioBacklogs: List<CategoryConfiguration>

  val requirementBacklog: CategoryConfiguration

  val taskBacklog: CategoryConfiguration

  /**
   * Type fields for the process configuration
   */
  val typeFields: JsonObject

  val url: String
}
