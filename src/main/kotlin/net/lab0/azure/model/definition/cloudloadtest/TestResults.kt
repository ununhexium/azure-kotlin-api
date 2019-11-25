package net.lab0.azure.model.definition.cloudloadtest

import kotlin.String
import kotlin.collections.List

interface TestResults {
  val cloudLoadTestSolutionUrl: String

  val counterGroups: List<CounterGroup>

  val diagnostics: Diagnostics

  val resultsUrl: String
}
