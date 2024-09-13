package com.example.al_quran.models

import com.google.gson.annotations.SerializedName

data class ResponseSurahs(

	@field:SerializedName("total_verses")
	val totalVerses: Int? = null,

	@field:SerializedName("translation")
	val translation: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("surah_name_ar")
	val surahNameAr: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("surah_name")
	val surahName: String? = null,

	@field:SerializedName("verses")
	val verses: Verses? = null
)

data class JsonMember91(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember105(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember16(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember67(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember11(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember13(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember5(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember19(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember17(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember49(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember64(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember43(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember109(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember47(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class Verses(

	@field:SerializedName("88")
	val jsonMember88: JsonMember88? = null,

	@field:SerializedName("89")
	val jsonMember89: JsonMember89? = null,

	@field:SerializedName("110")
	val jsonMember110: JsonMember110? = null,

	@field:SerializedName("111")
	val jsonMember111: JsonMember111? = null,

	@field:SerializedName("90")
	val jsonMember90: JsonMember90? = null,

	@field:SerializedName("91")
	val jsonMember91: JsonMember91? = null,

	@field:SerializedName("92")
	val jsonMember92: JsonMember92? = null,

	@field:SerializedName("93")
	val jsonMember93: JsonMember93? = null,

	@field:SerializedName("94")
	val jsonMember94: JsonMember94? = null,

	@field:SerializedName("95")
	val jsonMember95: JsonMember95? = null,

	@field:SerializedName("96")
	val jsonMember96: JsonMember96? = null,

	@field:SerializedName("97")
	val jsonMember97: JsonMember97? = null,

	@field:SerializedName("10")
	val jsonMember10: JsonMember10? = null,

	@field:SerializedName("98")
	val jsonMember98: JsonMember98? = null,

	@field:SerializedName("11")
	val jsonMember11: JsonMember11? = null,

	@field:SerializedName("99")
	val jsonMember99: JsonMember99? = null,

	@field:SerializedName("12")
	val jsonMember12: JsonMember12? = null,

	@field:SerializedName("13")
	val jsonMember13: JsonMember13? = null,

	@field:SerializedName("14")
	val jsonMember14: JsonMember14? = null,

	@field:SerializedName("15")
	val jsonMember15: JsonMember15? = null,

	@field:SerializedName("16")
	val jsonMember16: JsonMember16? = null,

	@field:SerializedName("17")
	val jsonMember17: JsonMember17? = null,

	@field:SerializedName("18")
	val jsonMember18: JsonMember18? = null,

	@field:SerializedName("19")
	val jsonMember19: JsonMember19? = null,

	@field:SerializedName("1")
	val jsonMember1: JsonMember1? = null,

	@field:SerializedName("2")
	val jsonMember2: JsonMember2? = null,

	@field:SerializedName("3")
	val jsonMember3: JsonMember3? = null,

	@field:SerializedName("4")
	val jsonMember4: JsonMember4? = null,

	@field:SerializedName("5")
	val jsonMember5: JsonMember5? = null,

	@field:SerializedName("6")
	val jsonMember6: JsonMember6? = null,

	@field:SerializedName("7")
	val jsonMember7: JsonMember7? = null,

	@field:SerializedName("8")
	val jsonMember8: JsonMember8? = null,

	@field:SerializedName("9")
	val jsonMember9: JsonMember9? = null,

	@field:SerializedName("20")
	val jsonMember20: JsonMember20? = null,

	@field:SerializedName("21")
	val jsonMember21: JsonMember21? = null,

	@field:SerializedName("22")
	val jsonMember22: JsonMember22? = null,

	@field:SerializedName("23")
	val jsonMember23: JsonMember23? = null,

	@field:SerializedName("24")
	val jsonMember24: JsonMember24? = null,

	@field:SerializedName("25")
	val jsonMember25: JsonMember25? = null,

	@field:SerializedName("26")
	val jsonMember26: JsonMember26? = null,

	@field:SerializedName("27")
	val jsonMember27: JsonMember27? = null,

	@field:SerializedName("28")
	val jsonMember28: JsonMember28? = null,

	@field:SerializedName("29")
	val jsonMember29: JsonMember29? = null,

	@field:SerializedName("30")
	val jsonMember30: JsonMember30? = null,

	@field:SerializedName("31")
	val jsonMember31: JsonMember31? = null,

	@field:SerializedName("32")
	val jsonMember32: JsonMember32? = null,

	@field:SerializedName("33")
	val jsonMember33: JsonMember33? = null,

	@field:SerializedName("34")
	val jsonMember34: JsonMember34? = null,

	@field:SerializedName("35")
	val jsonMember35: JsonMember35? = null,

	@field:SerializedName("36")
	val jsonMember36: JsonMember36? = null,

	@field:SerializedName("37")
	val jsonMember37: JsonMember37? = null,

	@field:SerializedName("38")
	val jsonMember38: JsonMember38? = null,

	@field:SerializedName("39")
	val jsonMember39: JsonMember39? = null,

	@field:SerializedName("40")
	val jsonMember40: JsonMember40? = null,

	@field:SerializedName("41")
	val jsonMember41: JsonMember41? = null,

	@field:SerializedName("42")
	val jsonMember42: JsonMember42? = null,

	@field:SerializedName("43")
	val jsonMember43: JsonMember43? = null,

	@field:SerializedName("44")
	val jsonMember44: JsonMember44? = null,

	@field:SerializedName("45")
	val jsonMember45: JsonMember45? = null,

	@field:SerializedName("46")
	val jsonMember46: JsonMember46? = null,

	@field:SerializedName("47")
	val jsonMember47: JsonMember47? = null,

	@field:SerializedName("48")
	val jsonMember48: JsonMember48? = null,

	@field:SerializedName("49")
	val jsonMember49: JsonMember49? = null,

	@field:SerializedName("50")
	val jsonMember50: JsonMember50? = null,

	@field:SerializedName("51")
	val jsonMember51: JsonMember51? = null,

	@field:SerializedName("52")
	val jsonMember52: JsonMember52? = null,

	@field:SerializedName("53")
	val jsonMember53: JsonMember53? = null,

	@field:SerializedName("54")
	val jsonMember54: JsonMember54? = null,

	@field:SerializedName("55")
	val jsonMember55: JsonMember55? = null,

	@field:SerializedName("56")
	val jsonMember56: JsonMember56? = null,

	@field:SerializedName("57")
	val jsonMember57: JsonMember57? = null,

	@field:SerializedName("58")
	val jsonMember58: JsonMember58? = null,

	@field:SerializedName("59")
	val jsonMember59: JsonMember59? = null,

	@field:SerializedName("60")
	val jsonMember60: JsonMember60? = null,

	@field:SerializedName("61")
	val jsonMember61: JsonMember61? = null,

	@field:SerializedName("62")
	val jsonMember62: JsonMember62? = null,

	@field:SerializedName("63")
	val jsonMember63: JsonMember63? = null,

	@field:SerializedName("64")
	val jsonMember64: JsonMember64? = null,

	@field:SerializedName("65")
	val jsonMember65: JsonMember65? = null,

	@field:SerializedName("66")
	val jsonMember66: JsonMember66? = null,

	@field:SerializedName("67")
	val jsonMember67: JsonMember67? = null,

	@field:SerializedName("68")
	val jsonMember68: JsonMember68? = null,

	@field:SerializedName("69")
	val jsonMember69: JsonMember69? = null,

	@field:SerializedName("70")
	val jsonMember70: JsonMember70? = null,

	@field:SerializedName("71")
	val jsonMember71: JsonMember71? = null,

	@field:SerializedName("72")
	val jsonMember72: JsonMember72? = null,

	@field:SerializedName("73")
	val jsonMember73: JsonMember73? = null,

	@field:SerializedName("74")
	val jsonMember74: JsonMember74? = null,

	@field:SerializedName("75")
	val jsonMember75: JsonMember75? = null,

	@field:SerializedName("76")
	val jsonMember76: JsonMember76? = null,

	@field:SerializedName("77")
	val jsonMember77: JsonMember77? = null,

	@field:SerializedName("78")
	val jsonMember78: JsonMember78? = null,

	@field:SerializedName("79")
	val jsonMember79: JsonMember79? = null,

	@field:SerializedName("100")
	val jsonMember100: JsonMember100? = null,

	@field:SerializedName("101")
	val jsonMember101: JsonMember101? = null,

	@field:SerializedName("102")
	val jsonMember102: JsonMember102? = null,

	@field:SerializedName("103")
	val jsonMember103: JsonMember103? = null,

	@field:SerializedName("104")
	val jsonMember104: JsonMember104? = null,

	@field:SerializedName("105")
	val jsonMember105: JsonMember105? = null,

	@field:SerializedName("106")
	val jsonMember106: JsonMember106? = null,

	@field:SerializedName("80")
	val jsonMember80: JsonMember80? = null,

	@field:SerializedName("107")
	val jsonMember107: JsonMember107? = null,

	@field:SerializedName("81")
	val jsonMember81: JsonMember81? = null,

	@field:SerializedName("108")
	val jsonMember108: JsonMember108? = null,

	@field:SerializedName("82")
	val jsonMember82: JsonMember82? = null,

	@field:SerializedName("109")
	val jsonMember109: JsonMember109? = null,

	@field:SerializedName("83")
	val jsonMember83: JsonMember83? = null,

	@field:SerializedName("84")
	val jsonMember84: JsonMember84? = null,

	@field:SerializedName("85")
	val jsonMember85: JsonMember85? = null,

	@field:SerializedName("86")
	val jsonMember86: JsonMember86? = null,

	@field:SerializedName("87")
	val jsonMember87: JsonMember87? = null
)

data class JsonMember48(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember1(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember28(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember31(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember98(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember70(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember60(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember3(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember53(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember61(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember84(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember77(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember100(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember56(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember50(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember66(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember57(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember18(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember20(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember59(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember81(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember39(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember73(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember23(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember111(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember90(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember96(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember29(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember4(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember52(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember99(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember107(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember78(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember63(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember54(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember27(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember106(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember21(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember51(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember32(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember82(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember102(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember45(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember68(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember7(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember97(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember69(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember104(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember75(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember6(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember22(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember34(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember14(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember86(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember9(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember2(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember80(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember85(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember79(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember89(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember15(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember36(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember93(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember10(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember71(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember38(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember65(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember37(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember88(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember72(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember101(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember8(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember33(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember25(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember26(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember30(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember110(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember12(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember74(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember44(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember58(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember35(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember103(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember62(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember40(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember95(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember24(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember46(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember76(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember41(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember55(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember108(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember83(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember42(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember94(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember92(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)

data class JsonMember87(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("translation_eng")
	val translationEng: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("transliteration")
	val transliteration: String? = null
)
