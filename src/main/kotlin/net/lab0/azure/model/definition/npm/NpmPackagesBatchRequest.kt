package net.lab0.azure.model.definition.npm

import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.npm.NpmBatchOperationType

/**
 * A batch of operations to apply to package versions.
 */
interface NpmPackagesBatchRequest {
  val data: BatchOperationData

  /**
   * Type of operation that needs to be performed on packages.
   */
  val operation: NpmBatchOperationType

  /**
   * The packages onto which the operation will be performed.
   */
  val packages: List<MinimalPackageDetails>
}
