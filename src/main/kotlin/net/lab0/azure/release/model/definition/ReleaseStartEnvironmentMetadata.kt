package net.lab0.azure.release.model.definition

import javax.json.JsonObject
import kotlin.Int

interface ReleaseStartEnvironmentMetadata {
  /**
   * Sets release definition environment id.
   */
  val definitionEnvironmentId: Int

  /**
   * Sets list of environments variables to be overridden at deployment time.
   */
  val variables: JsonObject
}
