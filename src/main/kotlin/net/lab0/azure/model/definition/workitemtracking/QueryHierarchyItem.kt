package net.lab0.azure.model.definition.workitemtracking

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.workitemtracking.LinkQueryMode
import net.lab0.azure.model.definition.enumeration.workitemtracking.QueryRecursionOption
import net.lab0.azure.model.definition.enumeration.workitemtracking.QueryType

/**
 * Represents an item in the work item query hierarchy. This can be either a query or a folder.
 */
interface QueryHierarchyItem : WorkItemTrackingResource {
  /**
   * The child query items inside a query folder.
   */
  val children: List<QueryHierarchyItem>

  val clauses: WorkItemQueryClause

  /**
   * The columns of the query.
   */
  val columns: List<WorkItemFieldReference>

  val createdBy: IdentityReference

  /**
   * When the query item was created.
   */
  val createdDate: String

  /**
   * The link query mode.
   */
  val filterOptions: LinkQueryMode

  /**
   * If this is a query folder, indicates if it contains any children.
   */
  val hasChildren: Boolean

  /**
   * The id of the query item.
   */
  val id: String

  /**
   * Indicates if this query item is deleted. Setting this to false on a deleted query item will
   * undelete it. Undeleting a query or folder will not bring back the permission changes that were
   * previously applied to it.
   */
  val isDeleted: Boolean

  /**
   * Indicates if this is a query folder or a query.
   */
  val isFolder: Boolean

  /**
   * Indicates if the WIQL of this query is invalid. This could be due to invalid syntax or a no
   * longer valid area/iteration path.
   */
  val isInvalidSyntax: Boolean

  /**
   * Indicates if this query item is public or private.
   */
  val isPublic: Boolean

  val lastExecutedBy: IdentityReference

  /**
   * When the query was last run.
   */
  val lastExecutedDate: String

  val lastModifiedBy: IdentityReference

  /**
   * When the query item was last modified.
   */
  val lastModifiedDate: String

  val linkClauses: WorkItemQueryClause

  /**
   * The name of the query item.
   */
  val name: String

  /**
   * The path of the query item.
   */
  val path: String

  /**
   * The recursion option for use in a tree query.
   */
  val queryRecursionOption: QueryRecursionOption

  /**
   * The type of query.
   */
  val queryType: QueryType

  /**
   * The sort columns of the query.
   */
  val sortColumns: List<WorkItemQuerySortColumn>

  val sourceClauses: WorkItemQueryClause

  val targetClauses: WorkItemQueryClause

  /**
   * The WIQL text of the query
   */
  val wiql: String
}
