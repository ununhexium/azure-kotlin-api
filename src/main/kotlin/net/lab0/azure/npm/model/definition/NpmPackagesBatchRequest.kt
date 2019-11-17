package net.lab0.azure.npm.model.definition

import kotlin.collections.List
import net.lab0.azure.npm.model.definition.enumeration.NpmBatchOperationType

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
