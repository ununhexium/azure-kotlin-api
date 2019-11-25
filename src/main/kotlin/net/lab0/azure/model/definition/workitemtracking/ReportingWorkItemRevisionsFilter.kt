package net.lab0.azure.model.definition.workitemtracking

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

interface ReportingWorkItemRevisionsFilter {
  /**
   * A list of fields to return in work item revisions. Omit this parameter to get all reportable
   * fields.
   */
  val fields: List<String>

  /**
   * Include deleted work item in the result.
   */
  val includeDeleted: Boolean

  /**
   * Return an identity reference instead of a string value for identity fields.
   */
  val includeIdentityRef: Boolean

  /**
   * Include only the latest version of a work item, skipping over all previous revisions of the
   * work item.
   */
  val includeLatestOnly: Boolean

  /**
   * Include tag reference instead of string value for System.Tags field
   */
  val includeTagRef: Boolean

  /**
   * A list of types to filter the results to specific work item types. Omit this parameter to get
   * work item revisions of all work item types.
   */
  val types: List<String>
}
