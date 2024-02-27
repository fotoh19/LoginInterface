package com.globomantics.login

class LoginVerification{
    fun Verify(email:String,password:String):Boolean{
        return email== "test@globomantics.com" &&
                password == "test123"
    }
}