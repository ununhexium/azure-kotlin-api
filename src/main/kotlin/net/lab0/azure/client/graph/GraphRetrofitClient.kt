package net.lab0.azure.client.graph

import com.squareup.moshi.Moshi
import java.lang.Class
import kotlin.Any
import kotlin.String
import kotlin.reflect.KClass
import net.lab0.azure.client.Client
import net.lab0.azure.client.OkHttpFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class GraphRetrofitClient(
  private val moshi: Moshi,
  private val okHttpFactory: OkHttpFactory
) : Client {
  override fun <T> create(token: String, api: Class<T>): T = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .client(okHttpFactory.create(token))
    .baseUrl("https://vssps.dev.azure.com/")
    .build()
    .create(api)

  override fun <T : Any> create(token: String, api: KClass<T>): T = create(token, api.java)
}
