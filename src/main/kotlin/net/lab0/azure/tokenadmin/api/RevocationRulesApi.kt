package net.lab0.azure.tokenadmin.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.tokenadmin.model.definition.TokenAdminRevocationRule
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface RevocationRulesApi {
  /**
   * Creates a revocation rule to prevent the further usage of any OAuth authorizations that were
   * created before the current point in time and which match the conditions in the rule.
   *
   * Not all kinds of OAuth authorizations can be revoked directly.
   * Some, such as self-describing session tokens, must instead by revoked by creating a rule
   * which will be evaluated and used to reject matching OAuth credentials at authentication time.
   * Revocation rules created through this endpoint will apply to all credentials that were issued
   * before the datetime at which the rule was created and which match one or more additional
   * conditions.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/tokenadmin/revocationrules")
  fun create(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: TokenAdminRevocationRule
  ): Call<JsonValue>
}
