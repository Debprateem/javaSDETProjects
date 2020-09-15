package first

class Ex2_GradeScale {
    static void main(def args) {
        //Initialize marks
        def marks = [80, 100, 85, 90, 80]
        def sum = 0, avg = 0
        def grade = "F"
		def marksRng = 0..100
        
        //Calculate Average
        marks.each { sum+=it }
        avg = sum/marks.size() as Integer
        
        //Get Grade
        switch(avg) {
            case 90..100:
                grade = "A"
                break
            case 80..89:
                grade = "B"
                break
            case 70..79:
                grade = "C"
                break
            case 50..69:
                grade = "D"
                break
            case 0..49:
                grade = "F"
                break
            default:
                println "Invalid value"
        }
        
        //Print results
        println "Maximum marks: " + marks.max()
        println "Minimum marks: " + marks.min()
        println "Average Grade: " + avg
        println "Grade: " + grade
		
		println(marksRng.getFrom()) //1
		println(marksRng.getTo()) //10

    }
}