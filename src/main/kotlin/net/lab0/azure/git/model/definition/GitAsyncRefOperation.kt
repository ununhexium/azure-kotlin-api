package net.lab0.azure.git.model.definition

import kotlin.String
import net.lab0.azure.git.model.definition.enumeration.GitAsyncOperationStatus

interface GitAsyncRefOperation {
  val _links: ReferenceLinks

  val detailedStatus: GitAsyncRefOperationDetail

  val parameters: GitAsyncRefOperationParameters

  val status: GitAsyncOperationStatus

  /**
   * A URL that can be used to make further requests for status about the operation
   */
  val url: String
}
