package app.gmal.firebase_test

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}