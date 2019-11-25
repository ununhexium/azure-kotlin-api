package net.lab0.azure.model.definition.release

import kotlin.collections.List

interface DeploymentJob {
  val job: ReleaseTask

  val tasks: List<ReleaseTask>
}
