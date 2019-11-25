package net.lab0.azure.model.definition.taskagent

import kotlin.String

interface KubernetesServiceGroup : ServiceGroup {
  val namespace: String

  val serviceEndpointId: String
}
