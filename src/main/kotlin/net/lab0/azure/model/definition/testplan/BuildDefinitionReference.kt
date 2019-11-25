package net.lab0.azure.model.definition.testplan

import kotlin.Int
import kotlin.String

/**
 * The build definition reference resource
 */
interface BuildDefinitionReference {
  /**
   * ID of the build definition
   */
  val id: Int

  /**
   * Name of the build definition
   */
  val name: String
}
