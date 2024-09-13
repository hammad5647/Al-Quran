package com.example.al_quran.models

import com.google.gson.annotations.SerializedName

data class ResponseSurahNames(

	@field:SerializedName("chapters")
	val chapters: List<ChaptersItem?>? = null
)

data class TranslatedName(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("language_name")
	val languageName: String? = null
)

data class ChaptersItem(

	@field:SerializedName("pages")
	val pages: List<Int?>? = null,

	@field:SerializedName("name_complex")
	val nameComplex: String? = null,

	@field:SerializedName("translated_name")
	val translatedName: TranslatedName? = null,

	@field:SerializedName("bismillah_pre")
	val bismillahPre: Boolean? = null,

	@field:SerializedName("revelation_order")
	val revelationOrder: Int? = null,

	@field:SerializedName("verses_count")
	val versesCount: Int? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("name_simple")
	val nameSimple: String? = null,

	@field:SerializedName("name_arabic")
	val nameArabic: String? = null,

	@field:SerializedName("revelation_place")
	val revelationPlace: String? = null
)
