package net.lab0.azure.model.definition.test

import kotlin.String

/**
 * An abstracted reference to some other resource. This class is used to provide the build data
 * contracts with a uniform way to reference other resources in a way that provides easy traversal
 * through links.
 */
interface ShallowReference {
  /**
   * ID of the resource
   */
  val id: String

  /**
   * Name of the linked resource (definition name, controller name, etc.)
   */
  val name: String

  /**
   * Full http link to the resource
   */
  val url: String
}
