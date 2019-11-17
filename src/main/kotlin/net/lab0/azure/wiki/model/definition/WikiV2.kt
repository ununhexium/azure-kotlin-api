package net.lab0.azure.wiki.model.definition

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List

/**
 * Defines a wiki resource.
 */
interface WikiV2 : WikiCreateBaseParameters {
  /**
   * ID of the wiki.
   */
  val id: String

  /**
   * Properties of the wiki.
   */
  val properties: JsonObject

  /**
   * Remote web url to the wiki.
   */
  val remoteUrl: String

  /**
   * REST url for this wiki.
   */
  val url: String

  /**
   * Versions of the wiki.
   */
  val versions: List<GitVersionDescriptor>
}
