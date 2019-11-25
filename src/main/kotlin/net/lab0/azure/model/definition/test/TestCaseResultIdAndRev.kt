package net.lab0.azure.model.definition.test

import kotlin.Int

interface TestCaseResultIdAndRev {
  val id: LegacyTestCaseResultIdentifier

  val revision: Int
}
