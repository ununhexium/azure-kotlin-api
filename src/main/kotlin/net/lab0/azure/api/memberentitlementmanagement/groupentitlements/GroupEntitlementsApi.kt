package net.lab0.azure.api.memberentitlementmanagement.groupentitlements

import javax.json.JsonPatch
import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import net.lab0.azure.model.definition.enumeration.memberentitlementmanagement.RuleOption
import net.lab0.azure.model.definition.memberentitlementmanagement.GroupEntitlement
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface GroupEntitlementsApi {
  /**
   * Get the group entitlements for an account.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/groupentitlements")
  fun getGroupEntitlements(@Path("organization") organization: String, @Query("api-version")
      apiVersion: String = "5.0-preview.1"): Call<JsonValue>

  /**
   * Create a group entitlement with license rule, extension rule.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param ruleOption RuleOption [ApplyGroupRule/TestApplyGroupRule] - specifies if the rules
   * defined in group entitlement should be created and applied to it’s members (default option) or
   * just be tested
   */
  @POST("/{organization}/_apis/groupentitlements")
  fun addGroupEntitlement(
    @Path("organization") organization: String,
    @Query("ruleOption") ruleOption: RuleOption? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: GroupEntitlement
  ): Call<JsonValue>

  /**
   * Get a group entitlement.
   *
   * If the group entitlement does not exist, returns null.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param groupId ID of the group.
   */
  @GET("/{organization}/_apis/groupentitlements/{groupId}")
  fun getGroupEntitlement(
    @Path("organization") organization: String,
    @Path("groupId") groupId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Delete a group entitlement.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param groupId ID of the group to delete.
   * @param ruleOption RuleOption [ApplyGroupRule/TestApplyGroupRule] - specifies if the rules
   * defined in group entitlement should be deleted and the changes are applied to it’s members
   * (default option) or just be tested
   * @param removeGroupMembership Optional parameter that specifies whether the group with the given
   * ID should be removed from all other groups
   */
  @DELETE("/{organization}/_apis/groupentitlements/{groupId}")
  fun deleteGroupEntitlement(
    @Path("organization") organization: String,
    @Path("groupId") groupId: String,
    @Query("ruleOption") ruleOption: RuleOption? = null,
    @Query("removeGroupMembership") removeGroupMembership: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Update entitlements (License Rule, Extensions Rule, Project memberships etc.) for a group.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param groupId ID of the group.
   * @param ruleOption RuleOption [ApplyGroupRule/TestApplyGroupRule] - specifies if the rules
   * defined in group entitlement should be updated and the changes are applied to it’s members
   * (default option) or just be tested
   */
  @PATCH("/{organization}/_apis/groupentitlements/{groupId}")
  fun updateGroupEntitlement(
    @Path("organization") organization: String,
    @Path("groupId") groupId: String,
    @Query("ruleOption") ruleOption: RuleOption? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json-patch+json",
    @Body body: JsonPatch
  ): Call<JsonValue>
}
