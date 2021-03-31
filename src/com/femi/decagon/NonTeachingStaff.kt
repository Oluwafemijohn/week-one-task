package com.femi.decagon
// to create classes an inherit properties for staff class
class NonTeachingStaff( name: String,  salary: Int,  position:String, id:Int):  Staffs( name,  position,  salary,  id){
    var staff = Staffs(name, position, salary, id)
    fun paySalary(){
        println("Your salaries of ${staff.salary} has successively been paid into your account ${staff.name}")
    }

    fun employStaff(){
        println("You have been hired")
    }
    fun disengageStaff(){
        println("Your serves are no long need as from today")
    }

}