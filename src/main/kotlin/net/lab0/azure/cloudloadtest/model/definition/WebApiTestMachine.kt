package net.lab0.azure.cloudloadtest.model.definition

import kotlin.String

interface WebApiTestMachine {
  val lastHeartBeat: String

  val machineName: String

  val status: String
}
