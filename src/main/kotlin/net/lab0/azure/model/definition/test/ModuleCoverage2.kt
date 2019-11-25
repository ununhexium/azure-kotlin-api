package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface ModuleCoverage2 {
  val blockCount: Int

  val blockData: List<String>

  val blockDataLength: Int

  val blocksCovered: Int

  val blocksNotCovered: Int

  val coverageFileUrl: String

  val coverageId: Int

  val linesCovered: Int

  val linesNotCovered: Int

  val linesPartiallyCovered: Int

  val moduleId: Int

  val name: String

  val signature: String

  val signatureAge: Int
}
