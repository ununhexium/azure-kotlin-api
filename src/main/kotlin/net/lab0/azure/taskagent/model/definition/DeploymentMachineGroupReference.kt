package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.String

interface DeploymentMachineGroupReference {
  val id: Int

  val name: String

  val pool: TaskAgentPoolReference

  val project: ProjectReference
}
