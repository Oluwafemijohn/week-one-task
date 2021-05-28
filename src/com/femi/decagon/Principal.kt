package com.femi.decagon

import java.sql.DriverManager.println
import java.util.*

open class Principal(name: String, position: String, salary: Int,  id: Int): Staffs( name,  position,  salary,  id) {
//    create list for students
    var studentList: ArrayList<Students> = arrayListOf()
//    create list for admitted students
    var admitedApplicant: ArrayList<StudentApplicants> = arrayListOf()

    fun admitStudent(newApplicant: StudentApplicants): String {
//        to filter applicant student with age
        return if (newApplicant.age >= 18) {
    //            to add admitted student to the student list
            var list = admitedApplicant.mapTo(studentList){ Students( it.name, it.age)}
            studentList.addAll(list).toString()

            "${newApplicant.name} is admitted "


        } else {
            "${newApplicant.name}go back home ${newApplicant.name}"
        }
    }

//to expel student
    fun expelStudent(goingStudent: Students){
    studentList.remove(goingStudent)
        println("You are hereby ${goingStudent.name} expelled for this school")
    }

    fun addAspirant(aspirant:StudentApplicants) {
        admitedApplicant.add(aspirant)
    }
    fun addStudent(student:Students) {
        studentList.add(student)
    }
    fun printApplicantList() {

        val studentNames = mutableListOf<String>()

        for (i in studentList.indices){
            studentNames.add(studentList[i].name)
        }

        println(studentNames.toList())
    }




}







