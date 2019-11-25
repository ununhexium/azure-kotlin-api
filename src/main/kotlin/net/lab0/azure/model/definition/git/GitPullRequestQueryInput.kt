package net.lab0.azure.model.definition.git

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.git.GitPullRequestQueryType

/**
 * Pull request query input parameters.
 */
interface GitPullRequestQueryInput {
  /**
   * The list of commit IDs to search for.
   */
  val items: List<String>

  /**
   * The type of query to perform.
   */
  val type: GitPullRequestQueryType
}
