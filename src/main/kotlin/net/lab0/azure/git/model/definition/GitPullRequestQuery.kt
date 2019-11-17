package net.lab0.azure.git.model.definition

import javax.json.JsonObject
import kotlin.collections.List

/**
 * A set of pull request queries and their results.
 */
interface GitPullRequestQuery {
  /**
   * The queries to perform.
   */
  val queries: List<GitPullRequestQueryInput>

  /**
   * The results of the queries. This matches the QueryInputs list so Results[n] are the results of
   * QueryInputs[n]. Each entry in the list is a dictionary of commit->pull requests.
   */
  val results: List<JsonObject>
}
