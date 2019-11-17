package net.lab0.azure.git.model.definition

import kotlin.Int

/**
 * This object is returned from Cherry Pick operations and provides the id and status of the
 * operation
 */
interface GitCherryPick : GitAsyncRefOperation {
  val cherryPickId: Int
}
