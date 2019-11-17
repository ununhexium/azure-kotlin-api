package net.lab0.azure.git.model.definition

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.git.model.definition.enumeration.GitRefSearchType

interface GitQueryRefsCriteria {
  /**
   * List of commit Ids to be searched
   */
  val commitIds: List<String>

  /**
   * List of complete or partial names for refs to be searched
   */
  val refNames: List<String>

  /**
   * Type of search on refNames, if provided
   */
  val searchType: GitRefSearchType
}
