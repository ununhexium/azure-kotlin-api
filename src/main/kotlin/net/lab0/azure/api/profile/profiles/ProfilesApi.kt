package net.lab0.azure.api.profile.profiles

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ProfilesApi {
  /**
   * Get my profile.
   */
  @GET("/_apis/profile/profiles/{id}")
  fun getProfile(
    @Path("id") id: String,
    @Query("details") details: Boolean? = null,
    @Query("withAttributes") withAttributes: Boolean? = null,
    @Query("partition") partition: String? = null,
    @Query("coreAttributes") coreAttributes: String? = null,
    @Query("forceRefresh") forceRefresh: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
