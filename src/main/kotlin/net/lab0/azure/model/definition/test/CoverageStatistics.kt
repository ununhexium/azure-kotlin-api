package net.lab0.azure.model.definition.test

import kotlin.Int

interface CoverageStatistics {
  val blocksCovered: Int

  val blocksNotCovered: Int

  val linesCovered: Int

  val linesNotCovered: Int

  val linesPartiallyCovered: Int
}
