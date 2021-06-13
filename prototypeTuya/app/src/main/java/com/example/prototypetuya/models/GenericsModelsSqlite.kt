package com.example.prototypetuya.models

object GenericsModelsSqlite {
    data class AttributesSqlite(val name:String,val specification:String)
    data class AttributesWhereSqlite(val name:String,val value:String)
}