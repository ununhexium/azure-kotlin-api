package net.lab0.azure.servicehooks.model.definition

import kotlin.collections.List

/**
 * Defines a filter for subscription inputs. The filter matches a set of inputs if any (one or more)
 * of the groups evaluates to true.
 */
interface InputFilter {
  /**
   * Groups of input filter expressions. This filter matches a set of inputs if any (one or more) of
   * the groups evaluates to true.
   */
  val conditions: List<InputFilterCondition>
}
