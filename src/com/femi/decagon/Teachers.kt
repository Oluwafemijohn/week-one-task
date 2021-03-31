package com.femi.decagon

class Teachers (name: String, position: String, salary: Int, id: Int, var subject: String ): Staffs( name,  position,  salary,  id){
    fun getSalary(){
        print("You Salary has been paid")
    }
    fun teachSubject(){
        print("You have a class now:")
    }
}