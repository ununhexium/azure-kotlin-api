package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String

interface FunctionCoverage2 {
  val blocksCovered: Int

  val blocksNotCovered: Int

  val `class`: String

  val coverageId: Int

  val functionId: Int

  val linesCovered: Int

  val linesNotCovered: Int

  val linesPartiallyCovered: Int

  val moduleId: Int

  val name: String

  val namespace: String

  val sourceFile: String
}
