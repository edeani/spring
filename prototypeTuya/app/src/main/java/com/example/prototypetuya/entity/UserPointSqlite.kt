package com.example.prototypetuya.entity

import android.provider.BaseColumns
import com.example.prototypetuya.components.ComponentSqlite

object UserPointSqlite {




    /*private const val SQL_CREATE_ENTRIES =
        "${componentSqlite.CREATE} ${componentSqlite.TABLE} ${UserPointAttributes.TABLE_NAME} (" +
                "${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT," +
                "${UserPointAttributes.COLUMN_ID_POINT} INTEGER," +
                "${UserPointAttributes.COLUMN_ID_USER} INTEGER," +
                "${UserPointAttributes.COLUMN_DATE} TEXT," +
                "${UserPointAttributes.COLUMN_STATUS} TEXT" +
                ")"

    private val SQL_DELETE_ENTRIES = ComponentSqlite().deleteTable(UserPointAttributes.TABLE_NAME,null)*/


    object UserPointAttributes : BaseColumns{
        const val TABLE_NAME = "USERPOINT"
        const val COLUMN_ID_POINT = "idpoint"
        const val COLUMN_ID_USER = "iduser"
        const val COLUMN_DATE = "dateAttend"
        /*const val COLUMN_POINT = "coordenate"
        const val COLUMN_CITY = "city"
        const val COLUMN_COUNTRY = "country"*/
        const val COLUMN_STATUS = "status"
    }
}