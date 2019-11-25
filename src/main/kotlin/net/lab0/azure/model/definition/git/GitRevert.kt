package net.lab0.azure.model.definition.git

import kotlin.Int

interface GitRevert : GitAsyncRefOperation {
  val revertId: Int
}
