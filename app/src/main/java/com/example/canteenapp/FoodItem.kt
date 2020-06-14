package com.example.canteenapp

class FoodItem
{
    var _itemName:String? = null
        get() = field
        set(value) {
            field = value
        }
    var _description:String ? =null
        get() = field
        set(value) {
            field = value
        }
    var _quantitiy:Int? =0
        get() = field
        set(value) {
            field = value
        }
    var _cost:Double?=0.00
        get() = field
        set(value) {
            field = value
        }
    var _timeToCreate:String ?=null //defines how much time need for food items to be prepared
        get() = field
        set(value) {
            field = value
        }


}