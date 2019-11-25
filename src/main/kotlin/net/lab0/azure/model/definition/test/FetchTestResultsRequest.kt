package net.lab0.azure.model.definition.test

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

interface FetchTestResultsRequest {
  val idAndRevs: List<TestCaseResultIdAndRev>

  val includeActionResults: Boolean

  val projectName: String
}
