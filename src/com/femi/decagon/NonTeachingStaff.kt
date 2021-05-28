package com.femi.decagon
// to create classes an inherit properties for staff class
class NonTeachingStaff( name: String,  salary: Int,  position:String, id:Int):  Staffs( name,  position,  salary,  id){
    var staff = Staffs(name, position, salary, id)

    var NonTeachingStaffList : MutableList<NonTeachingStaff> = mutableListOf()
    fun paySalary(){
        println("Your salaries of ${staff.salary} has successively been paid into your account ${staff.name}")
    }

    fun employStaff(staffApplicants :StaffApplicants){
        println("${staffApplicants.name} you have been hired and will be paid a sum of ${staffApplicants.name}")
    }
    fun disengageStaff(){
        println("${staff.name} your serves are no long need as from today due to misconducts found in you")
    }

}