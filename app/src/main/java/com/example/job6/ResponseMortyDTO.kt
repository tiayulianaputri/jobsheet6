package com.example.job6

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Generated("com.robohorse.robopojogenerator")
data class ResponseMortyDTO(

	@field:SerializedName("info")
	val info: InfoDTO? = null,

	@field:SerializedName("results")
	val results: List<ResultsDTO?>? = null
)