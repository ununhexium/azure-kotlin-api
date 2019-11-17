package net.lab0.azure.taskagent.model.definition

import kotlin.String
import kotlin.collections.List

interface DeploymentMachineChangedData : DeploymentMachine {
  val addedTags: List<String>

  val deletedTags: List<String>
}
