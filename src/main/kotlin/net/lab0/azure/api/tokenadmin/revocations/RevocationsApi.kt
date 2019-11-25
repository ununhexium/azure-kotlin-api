package net.lab0.azure.api.tokenadmin.revocations

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.tokenadmin.TokenAdminRevocation
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
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
    @Query("isPublic") isPublic: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: List<TokenAdminRevocation>
  ): Call<JsonValue>
}
