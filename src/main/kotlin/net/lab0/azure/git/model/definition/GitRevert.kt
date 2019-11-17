package net.lab0.azure.git.model.definition

import kotlin.Int

interface GitRevert : GitAsyncRefOperation {
  val revertId: Int
}
