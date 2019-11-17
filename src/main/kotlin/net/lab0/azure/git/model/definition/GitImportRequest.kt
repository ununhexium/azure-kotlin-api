package net.lab0.azure.git.model.definition

import kotlin.Int
import kotlin.String
import net.lab0.azure.git.model.definition.enumeration.GitAsyncOperationStatus

/**
 * A request to import data from a remote source control system.
 */
interface GitImportRequest {
  val _links: ReferenceLinks

  val detailedStatus: GitImportStatusDetail

  /**
   * The unique identifier for this import request.
   */
  val importRequestId: Int

  val parameters: GitImportRequestParameters

  val repository: GitRepository

  /**
   * Current status of the import.
   */
  val status: GitAsyncOperationStatus

  /**
   * A link back to this import request resource.
   */
  val url: String
}
