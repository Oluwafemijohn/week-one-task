package com.femi.decagon

open class Principal(name: String, position: String, salary: Int,  id: Int): Staffs( name,  position,  salary,  id) {
//    creat list for students
    var studentName: MutableList<Students> = mutableListOf()
//    create list for admitted students
    var admitedApplicant: MutableList<Students> = mutableListOf()
    fun admitStudent(newApplicant: Applicants): String {
//        to filterapplicant student with age
        return if (newApplicant.age >= 18) {
//            to add admited student to the student list
            admitedApplicant.mapTo(studentName){ Students( it.name, it.age, it.id)}

            "${newApplicant.name} is admitted "


        } else {
            "${newApplicant.name}go back home ${newApplicant.name}"
        }
    }

//to expel student
    fun expelStudent(newApplicant: Students){

        println("You are hereby ${newApplicant.name} expelled for this school")
    }



}







