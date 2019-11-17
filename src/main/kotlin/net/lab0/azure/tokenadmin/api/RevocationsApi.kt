package net.lab0.azure.tokenadmin.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.tokenadmin.model.definition.TokenAdminRevocation
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface RevocationsApi {
  /**
   * Revokes the listed OAuth authorizations.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param isPublic Set to false for PAT tokens and true for SSH tokens.
   */
  @POST("/{organization}/_apis/tokenadmin/revocations")
  fun revokeAuthorizations(
    @Path("organization") organization: String,
    @Query("isPublic") isPublic: Boolean,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: List<TokenAdminRevocation>
  ): Call<JsonValue>
}
