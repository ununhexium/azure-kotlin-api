package net.lab0.azure.api.tokenadministration.tokenlistglobalidentities

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.tokenadministration.TokenAdminRevocation
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface TokenListGlobalIdentitiesApi {
  /**
   * Revokes the listed OAuth authorizations.
   *
   * @param isPublic Set to false for PAT tokens and true for SSH tokens.
   */
  @POST("/_apis/tokenadministration/tokenlistglobalidentities")
  fun listIdentitiesWithGlobalAccessTokens(
    @Query("isPublic") isPublic: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: List<TokenAdminRevocation>
  ): Call<JsonValue>
}
