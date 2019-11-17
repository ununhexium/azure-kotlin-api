package net.lab0.azure.taskagent.model.definition

import kotlin.String
import kotlin.collections.List

interface DeploymentGatesChangeEvent {
  val gateNames: List<String>
}
