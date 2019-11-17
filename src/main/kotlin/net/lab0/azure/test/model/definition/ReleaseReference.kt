package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

/**
 * Reference to a release.
 */
interface ReleaseReference {
  val attempt: Int

  val creationDate: String

  /**
   * Release definition ID.
   */
  val definitionId: Int

  val environmentCreationDate: String

  /**
   * Release environment definition ID.
   */
  val environmentDefinitionId: Int

  /**
   * Release environment definition name.
   */
  val environmentDefinitionName: String

  /**
   * Release environment ID.
   */
  val environmentId: Int

  /**
   * Release environment name.
   */
  val environmentName: String

  /**
   * Release ID.
   */
  val id: Int

  /**
   * Release name.
   */
  val name: String
}
