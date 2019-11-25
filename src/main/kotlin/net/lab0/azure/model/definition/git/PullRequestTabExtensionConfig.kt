package net.lab0.azure.model.definition.git

import kotlin.Int
import kotlin.String

/**
 * Initial config contract sent to extensions creating tabs on the pull request page
 */
interface PullRequestTabExtensionConfig {
  val pullRequestId: Int

  val repositoryId: String
}
