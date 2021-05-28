package com.femi.decagon
fun main() {
    /*
   * Creating the instance of the principal
   *
   * */
    var principal = Principal("Lawrence", "principal", 244, 1)


//    object or instances of the students
    var shola = Students("Shola", 20)
    var tunde = Students("tunde",37)
    var kunle = Students("kunle",56)
    var waled = Students("waled", 19)
//  adding the students to the list of student
    principal.addStudent(shola)
    principal.addStudent(tunde)
    principal.addStudent(kunle)
    principal.addStudent(waled)

//    printing list of student in the school
    principal.printApplicantList()



//    admitting student
    var femi = StudentApplicants("femi", 20)
    principal.admitStudent(femi)

//    Expel student
    println(principal.expelStudent(waled))



//  testing primary and secondary constructor
    var courses = Courses("sc", "a", "com")
    var coursesTwo = Courses("sc", "a", "com", 1)


//    creating object of nonTeachingStaff
    var MrAjayi = NonTeachingStaff("Mr Ajayi", 25000, "Art teacher", 10)
//    calling paySalary method for a staff
    MrAjayi.paySalary()



//    call employStaff method to employ a staff
    var mrStephen = StaffApplicants("Mr Stephen", 30000, "English")
    MrAjayi.employStaff(mrStephen)
// creating an object of nonTeachingStaff
    var mrOla = NonTeachingStaff("Mr Ola", 20000, "Economic", 11)
    mrOla.disengageStaff()

//    principal.printApplicantList()

}
