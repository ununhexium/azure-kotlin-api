package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String
import net.lab0.azure.test.model.definition.enumeration.CustomTestFieldScope
import net.lab0.azure.test.model.definition.enumeration.CustomTestFieldType

interface CustomTestFieldDefinition {
  val fieldId: Int

  val fieldName: String

  val fieldType: CustomTestFieldType

  val scope: CustomTestFieldScope
}
