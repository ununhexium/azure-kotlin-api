package net.lab0.azure.model.definition.release

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
