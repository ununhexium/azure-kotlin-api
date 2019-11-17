package net.lab0.azure.taskagent.model.definition

import javax.json.JsonObject
import kotlin.String

/**
 * Represents an option that may affect the way an agent runs the job.
 */
interface JobOption {
  val data: JsonObject

  /**
   * Gets the id of the option.
   */
  val id: String
}
