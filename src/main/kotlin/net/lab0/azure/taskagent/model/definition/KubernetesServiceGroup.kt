package net.lab0.azure.taskagent.model.definition

import kotlin.String

interface KubernetesServiceGroup : ServiceGroup {
  val namespace: String

  val serviceEndpointId: String
}
