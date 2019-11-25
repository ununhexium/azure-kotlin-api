package net.lab0.azure.model.definition.git

import kotlin.Int

/**
 * This class contains the metadata of a service/extension posting pull request status. Status can
 * be associated with a pull request or an iteration.
 */
interface GitPullRequestStatus : GitStatus {
  /**
   * ID of the iteration to associate status with. Minimum value is 1.
   */
  val iterationId: Int

  val properties: PropertiesCollection
}
