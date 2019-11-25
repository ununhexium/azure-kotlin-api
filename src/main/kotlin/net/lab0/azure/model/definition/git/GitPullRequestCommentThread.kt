package net.lab0.azure.model.definition.git

/**
 * Represents a comment thread of a pull request. A thread contains meta data about the file it was
 * left on (if any) along with one or more comments (an initial comment and the subsequent replies).
 */
interface GitPullRequestCommentThread : CommentThread {
  val pullRequestThreadContext: GitPullRequestCommentThreadContext
}
