package net.lab0.azure.model.definition.work

import kotlin.String

/**
 * Base class for TeamSettings data contracts. Anything common goes here.
 */
interface TeamSettingsDataContractBase {
  val _links: ReferenceLinks

  /**
   * Full http link to the resource
   */
  val url: String
}
