package server

class Classroom {
    int class_number
    String class_time
    String class_state
    
    static constraints = {
    	class_number()
    	class_time()
    	class_state()
    }
}

