package net.lab0.azure.test.model.definition

import kotlin.Int

interface CoverageStatistics {
  val blocksCovered: Int

  val blocksNotCovered: Int

  val linesCovered: Int

  val linesNotCovered: Int

  val linesPartiallyCovered: Int
}
