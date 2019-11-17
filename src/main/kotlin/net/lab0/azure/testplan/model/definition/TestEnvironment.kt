package net.lab0.azure.testplan.model.definition

import kotlin.String

interface TestEnvironment {
  val environmentId: String

  val environmentName: String
}
