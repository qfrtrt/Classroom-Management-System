package server

class Answer {
    String order_class
    String order_reason
    String order_time
    static constraints = {
        order_class()
        order_reason()
        order_time()
    }
}
