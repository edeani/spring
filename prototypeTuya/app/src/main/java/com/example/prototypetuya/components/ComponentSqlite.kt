package com.example.prototypetuya.components

import com.example.prototypetuya.models.GenericsModelsSqlite.AttributesSqlite
import com.example.prototypetuya.models.GenericsModelsSqlite.AttributesWhereSqlite
class ComponentSqlite {

    val AUTOINCREMENT =" AUTOINCREMENT "
    val PRIMARY_KEY =" PRIMARY KEY "
    val TEXT =" TEXT "
    val REAL =" REAL "
    val INTEGER =" INTEGER "
    val COMMA =","
    val SPACE =" "


    val CREATE =" CREATE "
    private val DROP =" DROP "
    private val DELETE =" DELETE "
    private val IFEXISTS =" IF EXISTS "
    val TABLE =" TABLE "
    private val WHERE =" WHERE "
    private val AND =" AND "
    private val EQUAL =" = "
    private val FROM =" FROM "
    fun createTable(name:String,attributes:List<AttributesSqlite>):String{
        return "${CREATE}${TABLE}${name} (${buildAttributes(attributes)})"
    }

    fun dropTable(name:String,attributes:List<AttributesSqlite>):String{
        return "${DROP}${TABLE}${IFEXISTS}${name}"
    }

    fun deleteTable(name:String,attributes:List<AttributesSqlite>?):String{
        return "${DELETE}${FROM}${TABLE}${name} ${WHERE} 1=1 "
    }

    fun selectTable(name:String,attributes:List<AttributesSqlite>,conditions:List<AttributesWhereSqlite>):String{
        return "SELECT ${buildAttributes(attributes)} FROM ${name} ${WHERE} 1=1 ${buildWhere(conditions)}"
    }

    private fun buildAttributes(attributes:List<AttributesSqlite>):String{
        var attrString =""

        var i = 0

        val tooLongSize = attributes.size > 1
        while(i<attributes.size){
            val attrItem=attributes.get(i)
            attrString+=attrItem!!.name + attrItem!!.specification

            if(tooLongSize && i<attributes.size-1){
                attrString+=COMMA
            }
            i++
        }

        return attrString
    }

    private fun buildWhere(conditions:List<AttributesWhereSqlite>):String{
        var conditionString =""

        var i = 0
        val tooLongSize = conditions.size > 1

        if(conditions!=null){
            while(i<conditions.size){
                val conditionItem=conditions.get(i)
                conditionString+=conditionItem!!.name + EQUAL +  conditionItem!!.value

                if(tooLongSize && i<conditions.size-1){
                    conditionString+=AND
                }
                i++
            }
        }


        return conditionString
    }


}