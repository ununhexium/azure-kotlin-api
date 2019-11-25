package net.lab0.azure.model.definition.cloudloadtest

import kotlin.String

interface WebApiTestMachine {
  val lastHeartBeat: String

  val machineName: String

  val status: String
}
