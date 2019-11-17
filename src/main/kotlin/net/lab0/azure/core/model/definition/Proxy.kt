package net.lab0.azure.core.model.definition

import kotlin.Boolean
import kotlin.String

interface Proxy {
  val authorization: ProxyAuthorization

  /**
   * This is a description string
   */
  val description: String

  /**
   * The friendly name of the server
   */
  val friendlyName: String

  val globalDefault: Boolean

  /**
   * This is a string representation of the site that the proxy server is located in (e.g.
   * "NA-WA-RED")
   */
  val site: String

  val siteDefault: Boolean

  /**
   * The URL of the proxy server
   */
  val url: String
}
