package net.lab0.azure.git.model.definition

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.git.model.definition.enumeration.GitPullRequestQueryType

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
