package com.example.ma.model

import com.google.gson.annotations.SerializedName

data class ResponseGame(

	@field:SerializedName("ResponseGame")
	val responseGame: List<ResponseGameItem?>? = null
)

data class ResponseGameItem(

	@field:SerializedName("short_description")
	val shortDescription: String? = null,

	@field:SerializedName("thumbnail")
	val thumbnail: String? = null,

	@field:SerializedName("main_image")
	val mainImage: String? = null,

	@field:SerializedName("article_content")
	val articleContent: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("article_url")
	val articleUrl: String? = null
)
