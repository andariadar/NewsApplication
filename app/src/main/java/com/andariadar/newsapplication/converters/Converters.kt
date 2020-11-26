package com.andariadar.newsapplication.converters

import androidx.room.TypeConverter
import com.andariadar.newsapplication.model.entity.Media
import com.andariadar.newsapplication.model.entity.News
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.json.JSONArray
import org.json.JSONObject

class Converters {
    @TypeConverter
    fun toMedia(json: String): List<Media> {
        val type = object : TypeToken<List<Media>>() {}.type
        return Gson().fromJson(json, type)
    }

    @TypeConverter
    fun toJson(media: List<Media>): String {
        val type = object: TypeToken<List<Media>>() {}.type
        return Gson().toJson(media, type)
    }

    @TypeConverter
    fun toInt(long: Long): Int {
        return long.toInt()
    }

    @TypeConverter
    fun toLong(int: Int): Long {
        return int.toLong()
    }

}