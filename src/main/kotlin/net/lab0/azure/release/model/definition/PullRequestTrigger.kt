package net.lab0.azure.release.model.definition

import kotlin.String
import kotlin.collections.List

interface PullRequestTrigger : ReleaseTriggerBase {
  val artifactAlias: String

  val pullRequestConfiguration: PullRequestConfiguration

  val statusPolicyName: String

  val triggerConditions: List<PullRequestFilter>
}
