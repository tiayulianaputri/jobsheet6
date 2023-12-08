package com.example.job6

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Generated("com.robohorse.robopojogenerator")
data class InfoDTO(

	@field:SerializedName("count")
	val count: Int? = null,

	@field:SerializedName("pages")
	val pages: Int? = null,

	@field:SerializedName("next")
	val next: String? = null,

	@field:SerializedName("prev")
	val prev: Any? = null
)