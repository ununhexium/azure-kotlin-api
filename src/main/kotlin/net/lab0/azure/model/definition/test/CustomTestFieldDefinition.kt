package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.test.CustomTestFieldScope
import net.lab0.azure.model.definition.enumeration.test.CustomTestFieldType

interface CustomTestFieldDefinition {
  val fieldId: Int

  val fieldName: String

  val fieldType: CustomTestFieldType

  val scope: CustomTestFieldScope
}
