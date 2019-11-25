package net.lab0.azure.model.definition.git

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Identity information including a vote on a pull request.
 */
interface IdentityRefWithVote : IdentityRef {
  /**
   * Indicates if this is a required reviewer for this pull request. <br /> Branches can have
   * policies that require particular reviewers are required for pull requests.
   */
  val isRequired: Boolean

  /**
   * URL to retrieve information about this identity
   */
  val reviewerUrl: String

  /**
   * Vote on a pull request:<br /> 10 - approved 5 - approved with suggestions 0 - no vote -5 -
   * waiting for author -10 - rejected
   */
  val vote: Int

  /**
   * Groups or teams that that this reviewer contributed to. <br /> Groups and teams can be
   * reviewers on pull requests but can not vote directly.  When a member of the group or team votes,
   * that vote is rolled up into the group or team vote.  VotedFor is a list of such votes.
   */
  val votedFor: List<IdentityRefWithVote>
}
