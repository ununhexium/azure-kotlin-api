package net.lab0.azure.release.model.definition

import kotlin.collections.List

interface DeploymentJob {
  val job: ReleaseTask

  val tasks: List<ReleaseTask>
}
