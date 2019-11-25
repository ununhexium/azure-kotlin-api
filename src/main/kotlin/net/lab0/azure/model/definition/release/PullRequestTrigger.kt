package net.lab0.azure.model.definition.release

import kotlin.String
import kotlin.collections.List

interface PullRequestTrigger : ReleaseTriggerBase {
  val artifactAlias: String

  val pullRequestConfiguration: PullRequestConfiguration

  val statusPolicyName: String

  val triggerConditions: List<PullRequestFilter>
}
