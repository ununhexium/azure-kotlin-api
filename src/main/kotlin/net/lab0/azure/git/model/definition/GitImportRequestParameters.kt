package net.lab0.azure.git.model.definition

import kotlin.Boolean
import kotlin.String

/**
 * Parameters for creating an import request
 */
interface GitImportRequestParameters {
  /**
   * Option to delete service endpoint when import is done
   */
  val deleteServiceEndpointAfterImportIsDone: Boolean

  val gitSource: GitImportGitSource

  /**
   * Service Endpoint for connection to external endpoint
   */
  val serviceEndpointId: String

  val tfvcSource: GitImportTfvcSource
}
