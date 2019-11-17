package net.lab0.azure.release.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.release.model.definition.enumeration.GateStatus

interface ReleaseGates {
  val deploymentJobs: List<DeploymentJob>

  val id: Int

  val ignoredGates: List<IgnoredGate>

  val lastModifiedOn: String

  val runPlanId: String

  val stabilizationCompletedOn: String

  val startedOn: String

  val status: GateStatus

  val succeedingSince: String
}
