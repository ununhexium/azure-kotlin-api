package net.lab0.azure.test.model.definition

import kotlin.Int

/**
 * Reference to release environment resource.
 */
interface ReleaseEnvironmentDefinitionReference {
  /**
   * ID of the release definition that contains the release environment definition.
   */
  val definitionId: Int

  /**
   * ID of the release environment definition.
   */
  val environmentDefinitionId: Int
}
