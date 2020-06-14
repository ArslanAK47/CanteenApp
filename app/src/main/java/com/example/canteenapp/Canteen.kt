package com.example.canteenapp

class Canteen
{
    var _managementName:String?=null
        get() = field
        set(value) {
            field = value
        }

    var _handler:String?=null
        get() = field
        set(value) {
            field = value
        }

    var _mobile:String?=null
        get() = field
        set(value) {
            field = value
        }

    var _noOfWorkers:Int?=0
        get() = field
        set(value) {
            field = value
        }

    var _address:String?=null
        get() = field
        set(value) {
            field = value
        }
    var _foodItems:List<FoodItem>?=null
        get() = field
        set(value) {
            field = value
        }


}