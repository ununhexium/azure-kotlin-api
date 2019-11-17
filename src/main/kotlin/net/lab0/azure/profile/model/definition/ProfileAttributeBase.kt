package net.lab0.azure.profile.model.definition

import kotlin.Int
import kotlin.String

interface ProfileAttributeBase {
  val descriptor: AttributeDescriptor

  val revision: Int

  val timeStamp: String

  val value: String
}
