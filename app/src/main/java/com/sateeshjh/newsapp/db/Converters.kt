package com.sateeshjh.newsapp.db

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.sateeshjh.newsapp.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}