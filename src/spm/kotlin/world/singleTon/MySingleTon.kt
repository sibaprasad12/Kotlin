package spm.kotlin.world.singleTonclass MySingleTon {    companion object {        lateinit var instance: MySingleTon        fun getInstance1() = if (this::instance.isInitialized) instance else MySingleTon()    }}