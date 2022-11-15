package com.example.crimeintent

import java.util.*
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Crime (@PrimaryKey val id: UUID = UUID.randomUUID(),var title:String = "",var date: Date? = null,  var isSolved: Boolean? = null,
                  var _requiresPolice:Boolean = false)  {
    /*
    var title:String = ""
    var date: Date? = null
    var isSolved: Boolean? = null
    var _requiresPolice:Boolean = false
    constructor(id: UUID, title: String, date: Date, isSolved:Boolean,requiresPolice:Boolean):this(id){
        this.title = title
        this.date = date
        this.id = id
        this.isSolved=isSolved
        this._requiresPolice = requiresPolice
    }


    fun requiresPolice(): Boolean {
        return _requiresPolice
    }


     */
}