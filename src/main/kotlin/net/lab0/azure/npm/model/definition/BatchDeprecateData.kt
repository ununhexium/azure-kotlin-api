package net.lab0.azure.npm.model.definition

import kotlin.String

/**
 * Data required to deprecate multiple package versions. Pass this while performing
 * NpmBatchOperationTypes.Deprecate batch operation.
 */
interface BatchDeprecateData : BatchOperationData {
  /**
   * Deprecate message that will be added to packages
   */
  val message: String
}
