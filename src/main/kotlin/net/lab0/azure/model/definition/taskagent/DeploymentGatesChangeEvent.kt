package net.lab0.azure.model.definition.taskagent

import kotlin.String
import kotlin.collections.List

interface DeploymentGatesChangeEvent {
  val gateNames: List<String>
}
