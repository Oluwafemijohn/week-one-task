package com.femi.decagon

class Courses(var science: String, var art: String, var commercial: String){

    var a: Int = 0

    constructor( science: String, art: String, commercial: String,  a: Int) :
            this(science, art, commercial) {
            this.a = a
    }

    fun takeCourses(){
        this.science = "English"
        this.art = "Art"
        this.commercial = "Commercial"
    }


}

