package net.lab0.azure.git.model.definition

import kotlin.Int

interface TfvcStatistics {
  /**
   * Id of the last changeset the stats are based on.
   */
  val changesetId: Int

  /**
   * Count of files at the requested scope.
   */
  val fileCountTotal: Int
}
