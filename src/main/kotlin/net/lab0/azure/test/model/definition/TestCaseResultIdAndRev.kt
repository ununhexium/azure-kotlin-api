package net.lab0.azure.test.model.definition

import kotlin.Int

interface TestCaseResultIdAndRev {
  val id: LegacyTestCaseResultIdentifier

  val revision: Int
}
