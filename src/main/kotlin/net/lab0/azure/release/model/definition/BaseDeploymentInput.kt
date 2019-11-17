package net.lab0.azure.release.model.definition

import javax.json.JsonObject
import kotlin.Int
import kotlin.String

interface BaseDeploymentInput {
  val condition: String

  /**
   * Gets or sets the job cancel timeout in minutes for deployment which are cancelled by user for
   * this release environment
   */
  val jobCancelTimeoutInMinutes: Int

  val overrideInputs: JsonObject

  /**
   * Gets or sets the job execution timeout in minutes for deployment which are queued against this
   * release environment
   */
  val timeoutInMinutes: Int
}
