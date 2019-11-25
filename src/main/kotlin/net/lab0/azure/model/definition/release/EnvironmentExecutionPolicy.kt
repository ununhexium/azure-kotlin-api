package net.lab0.azure.model.definition.release

import kotlin.Int

/**
 * Defines policy on environment queuing at Release Management side queue. We will send to
 * Environment Runner [creating pre-deploy and other steps] only when the policies mentioned are
 * satisfied.
 */
interface EnvironmentExecutionPolicy {
  /**
   * This policy decides, how many environments would be with Environment Runner.
   */
  val concurrencyCount: Int

  /**
   * Queue depth in the EnvironmentQueue table, this table keeps the environment entries till
   * Environment Runner is free [as per it's policy] to take another environment for running.
   */
  val queueDepthCount: Int
}
