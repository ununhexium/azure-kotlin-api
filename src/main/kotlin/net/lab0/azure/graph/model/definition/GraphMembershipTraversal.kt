package net.lab0.azure.graph.model.definition

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

interface GraphMembershipTraversal {
  /**
   * Reason why the subject could not be traversed completely
   */
  val incompletenessReason: String

  /**
   * When true, the subject is traversed completely
   */
  val isComplete: Boolean

  /**
   * The traversed subject descriptor
   */
  val subjectDescriptor: String

  /**
   * Subject descriptor ids of the traversed members
   */
  val traversedSubjectIds: List<String>

  /**
   * Subject descriptors of the traversed members
   */
  val traversedSubjects: List<String>
}
